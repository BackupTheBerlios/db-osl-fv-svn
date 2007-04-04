/**
 * 
 */
package data_access_methods;

import java.sql.Connection;

import org.postgresql.jdbc3.*;
import beans.*;

/**
 * @author Emanuele
 *
 */
public class DataAccessMethods {
	
	private Iscritto iscritto = null;
	private Oracard card  = null;
	private Gite gite = null;
	private Jdbc3PoolingDataSource pool= null;
	
	private static int SEGR = 0;
	private static int BAR = 1;
	private static int ADMIN = 2;
	private int admin_count;
	
	/**
	 * 
	 */
	public DataAccessMethods() {
		
		this.iscritto = new Iscritto();
		this.card = new Oracard();
		this.gite = new Gite();
		try {
			this.pool = new Jdbc3PoolingDataSource();
			pool.setDataSourceName("DB Oratorio S. Luigi");
			pool.setServerName("localhost");
			pool.setPortNumber(5432);
			pool.setDatabaseName("DB_Oratorio_Feriale");
			pool.setUser("ora_user");
			pool.setPassword("settebello");
			pool.setMaxConnections(25);
		} catch (Exception e) {
			System.out.println("Error creating connection pool.");
		}
		
		this.admin_count = 0;
		
	}
	

	private Connection connect(int type) throws Exception {

		if ((type == ADMIN) && (admin_count == 0)) {
			this.admin_count++;
			return pool.getConnection();
		}
		if(type == SEGR) {
			return pool.getConnection();
		}
		throw new Exception("Parametro non consentito");
	}
	
	private void disconnect(int type, Connection con) throws Exception {
		
		if(((type != SEGR) && (type != ADMIN)) || (type == BAR)) throw new Exception("Parametro non consentito");
		else {
			if(type == ADMIN) {
				con.close();
				this.admin_count--;
			}
			if((type == SEGR)) {
				con.close();
			}
		}
	}
	
	public static void main (String args[]) {
		System.out.println("inizio tentativo");
		DataAccessMethods data = new DataAccessMethods();
		try {
			Connection con = data.connect(ADMIN);
			System.out.println("connesso");
			data.disconnect(ADMIN, con);
			System.out.println("disconnesso");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("tentativo fallito");
		}
	}
	

}
