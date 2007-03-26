/**
 * 
 */
package beans;

import exceptions.TooLongException;

/**
 * @author Emanuele Panigati
 *
 */
public class Iscritto {

	String nome = "", cognome = "", via = "", ntel1 = "", ntel2 = "", ntel3 = "", citta = "", tessera = "", note = "";
	char sesso;
	int idSquadra, idClasse, id, nciv;
	
	public Iscritto() {}

	/**
	 * @param nome
	 * @param cognome
	 * @param via
	 * @param ntel1
	 * @param ntel2
	 * @param ntel3
	 * @param citta
	 * @param tessera
	 * @param note
	 * @param sesso
	 * @param idSquadra
	 * @param idClasse
	 * @param id
	 * @param nciv
	 * @throws TooLongException 
	 */
	public Iscritto(String nome, String cognome, String via, String ntel1, String ntel2, String ntel3, String citta, String tessera, String note, char sesso, int idSquadra, int idClasse, int id, int nciv) throws TooLongException {
		if ((nome.length() > 20) || (cognome.length() > 20) || (via.length() > 15) || (ntel1.length() > 10) || (ntel2.length() > 10) || (ntel3.length() > 10) ||(citta.length() >15) || (tessera.length() > 16)) throw new TooLongException("Un campo è troppo lungo...");
		this.nome = nome;
		this.cognome = cognome;
		this.via = via;
		this.ntel1 = ntel1;
		this.ntel2 = ntel2;
		this.ntel3 = ntel3;
		this.citta = citta;
		this.tessera = tessera;
		this.note = note;
		this.sesso = sesso;
		this.idSquadra = idSquadra;
		this.idClasse = idClasse;
		this.id = id;
		this.nciv = nciv;
	}

	/**
	 * @return the citta
	 */
	public String getCitta() {
		return citta;
	}

	/**
	 * @param citta the citta to set
	 */
	public void setCitta(String citta) {
		this.citta = citta;
	}

	/**
	 * @return the cognome
	 */
	public String getCognome() {
		return cognome;
	}

	/**
	 * @param cognome the cognome to set
	 */
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the idClasse
	 */
	public int getIdClasse() {
		return idClasse;
	}

	/**
	 * @param idClasse the idClasse to set
	 */
	public void setIdClasse(int idClasse) {
		this.idClasse = idClasse;
	}

	/**
	 * @return the idSquadra
	 */
	public int getIdSquadra() {
		return idSquadra;
	}

	/**
	 * @param idSquadra the idSquadra to set
	 */
	public void setIdSquadra(int idSquadra) {
		this.idSquadra = idSquadra;
	}

	/**
	 * @return the nciv
	 */
	public int getNciv() {
		return nciv;
	}

	/**
	 * @param nciv the nciv to set
	 */
	public void setNciv(int nciv) {
		this.nciv = nciv;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the note
	 */
	public String getNote() {
		return note;
	}

	/**
	 * @param note the note to set
	 */
	public void setNote(String note) {
		this.note = note;
	}

	/**
	 * @return the ntel1
	 */
	public String getNtel1() {
		return ntel1;
	}

	/**
	 * @param ntel1 the ntel1 to set
	 */
	public void setNtel1(String ntel1) {
		this.ntel1 = ntel1;
	}

	/**
	 * @return the ntel2
	 */
	public String getNtel2() {
		return ntel2;
	}

	/**
	 * @param ntel2 the ntel2 to set
	 */
	public void setNtel2(String ntel2) {
		this.ntel2 = ntel2;
	}

	/**
	 * @return the ntel3
	 */
	public String getNtel3() {
		return ntel3;
	}

	/**
	 * @param ntel3 the ntel3 to set
	 */
	public void setNtel3(String ntel3) {
		this.ntel3 = ntel3;
	}

	/**
	 * @return the sesso
	 */
	public char getSesso() {
		return sesso;
	}

	/**
	 * @param sesso the sesso to set
	 */
	public void setSesso(char sesso) {
		this.sesso = sesso;
	}

	/**
	 * @return the tessera
	 */
	public String getTessera() {
		return tessera;
	}

	/**
	 * @param tessera the tessera to set
	 */
	public void setTessera(String tessera) {
		this.tessera = tessera;
	}

	/**
	 * @return the via
	 */
	public String getVia() {
		return via;
	}

	/**
	 * @param via the via to set
	 */
	public void setVia(String via) {
		this.via = via;
	}

	
	
	
	
}
