package db_connection_functions;

/**
 * @author Cinzia Cappiello (DEI Politecnico di Milano)
 * @author Emanuele Panigati
 */

import java.sql.*;

public class ConnectionPool {

//	array di connessioni al database
	Connection con[];
//	array delle disponibilità delle connessioni
	boolean busy[];
//	registra chi sta tenendo occupata la connessione
	String who[];
//	numero di connessioni attive
	int numCon;
//	incremento dimensione del pool per accogliere nuove richieste
	int inc;
//	parametri di accesso al database
	String dbUrl;
	String dbUsername;
	String dbPswd;
	String driverString;
	
	/** Costruttore */
	
	public ConnectionPool (String dbUrl, String dbUsername, String dbPswd, int numCon, int inc, String driverString) throws Exception {
		this.dbUrl = dbUrl;
		this.dbUsername= dbUsername;
		this.dbPswd = dbPswd;
		this.numCon = numCon;
		this.inc = inc;
		this.driverString = driverString;
		newConnections();
	}
	
	/**
	 * newConnections
	 */
	
	private synchronized void newConnections() throws Exception
	{
//		alloca gli array globali (connessioni e info)
		con = new Connection[numCon];
		busy = new boolean[numCon];
		who = new String[numCon];
		Class.forName(driverString);
		for (int i = 0; i < numCon; i++) {
			con[i] = DriverManager.getConnection(dbUrl,dbUsername,dbPswd);
			busy[i] = false;
			who[i] = "";
		}
	}
	
	/**
	 * extendConnections
	 */
	
	public synchronized void extendConnections() throws Exception
	{
//		copia dei vecchi vettori
		Connection con2[] = con;
		boolean busy2[] = busy;
		String who2[] = who;
//		creazione dei nuovi vettori estesi
		con = new Connection[numCon+inc];
		busy = new boolean[numCon+inc];
		who = new String[numCon+inc];
//		ciclo per trasferire le vecchie connessioni nei nuovi array
		for (int i = 0; i < numCon; i++)
		{
			con[i] = con2[i];
			busy[i] = busy2[i];
			who[i] = who2[i];
		}
//		ciclo per creare le nuove connessioni da aggiungere alle precedenti
		for (int i = numCon; i < numCon+inc; i++)
		{
			con[i] = DriverManager.getConnection(dbUrl,dbUsername,dbPswd);
			busy[i] = false;
			who[i] = "";
		}
		numCon += inc;
	}
	
	/** getConnection - assegna una connessione all’utente who */
	public synchronized Connection getConnection(String who)
	throws Exception {
		int indFree = findFreeConnection();
		if (indFree >= 0) {
			busy[indFree] = true;
			this.who[indFree] = who;
			return con[indFree];
		}
//		se arriva qui, il pool è saturo: lo estende e richiama findFreeConn…()
		extendConnections();
		indFree = findFreeConnection();
		if (indFree >= 0) {
			busy[indFree] = true;
			this.who[indFree] = "No name";
			return con[indFree]; }
		return null; // se arriva qui non ci sono proprio più risorse di calcolo
	}
	
	/** getConnection */
	
	public synchronized Connection getConnection() throws Exception {
		return getConnection("noName");
	}
	
	/**
	 * releaseConnection - la connessione viene solo “liberata”
	 */
	
	public synchronized void releaseConnection(Connection c)
	{
		for (int i = 0; i < numCon; i++) {
			if (con[i] == c) {
				who[i] = "";
				busy[i] = false;
			}
		}
	}
	
	/** findFreeConnection - scandisce il vettore e restituisce l’indice */
	
	protected int findFreeConnection()
	{
		for(int i = 0; i < numCon; i++)
			if ( ! busy[i] ) return i;
		return -1;
	}
	
	/** printStatusConnection */
	
	public String printStatusConnection()
	{
		String result = "";
		for (int i = 0; i < numCon; i++)
			result += "Conn. " + i + ": " + busy[i] + " used by: " + who[i];
		return result;
	}
	
	public void halt() throws SQLException {
		int i = 0;
		while(busy[i] == true) {
			busy[i] = false;
			who[i] = "";
			con[i].close();
		}
	}
	
	public void changeDB(String dbUrl, String dbUsername, String dbPswd, int numCon, int inc, String driverString) throws Exception {
		this.halt();
		this.dbUrl = dbUrl;
		this.dbUsername= dbUsername;
		this.dbPswd = dbPswd;
		this.numCon = numCon;
		this.inc = inc;
		this.driverString = driverString;
		newConnections();
	}
}
