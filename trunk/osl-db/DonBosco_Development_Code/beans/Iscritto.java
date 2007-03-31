/**
 * 
 */
package beans;

import exceptions.TooLongException;

/**
 * @author Emanuele Panigati
 */
public class Iscritto {

	/**
	 * @uml.property name="nome"
	 */
	String nome = "";

	/**
	 * @uml.property name="cognome"
	 */
	String cognome = "";

	/**
	 * @uml.property name="via"
	 */
	String via = "";

	/**
	 * @uml.property name="ntel1"
	 */
	String ntel1 = "";

	/**
	 * @uml.property name="ntel2"
	 */
	String ntel2 = "";

	/**
	 * @uml.property name="ntel3"
	 */
	String ntel3 = "";

	/**
	 * @uml.property name="citta"
	 */
	String citta = "";

	/**
	 * @uml.property name="tessera"
	 */
	String tessera = "";

	/**
	 * @uml.property name="note"
	 */
	String note = "";

	/**
	 * @uml.property name="sesso"
	 */
	char sesso;

	/**
	 * @uml.property name="idSquadra"
	 */
	int idSquadra;

	/**
	 * @uml.property name="idClasse"
	 */
	int idClasse;

	/**
	 * @uml.property name="id"
	 */
	int id;

	/**
	 * @uml.property name="nciv"
	 */
	int nciv;

	public Iscritto() {
	}

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
	public Iscritto(String nome, String cognome, String via, String ntel1,
			String ntel2, String ntel3, String citta, String tessera,
			String note, char sesso, int idSquadra, int idClasse, int id,
			int nciv) throws TooLongException {
		if ((nome.length() > 20) || (cognome.length() > 20)
				|| (via.length() > 15) || (ntel1.length() > 10)
				|| (ntel2.length() > 10) || (ntel3.length() > 10)
				|| (citta.length() > 15) || (tessera.length() > 16))
			throw new TooLongException("Un campo è troppo lungo...");
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
	 * @uml.property name="citta"
	 */
	public String getCitta() {
		return citta;
	}

	/**
	 * @param citta
	 *            the citta to set
	 * @uml.property name="citta"
	 */
	public void setCitta(String citta) {
		this.citta = citta;
	}

	/**
	 * @return the cognome
	 * @uml.property name="cognome"
	 */
	public String getCognome() {
		return cognome;
	}

	/**
	 * @param cognome
	 *            the cognome to set
	 * @uml.property name="cognome"
	 */
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	/**
	 * @return the id
	 * @uml.property name="id"
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 * @uml.property name="id"
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the idClasse
	 * @uml.property name="idClasse"
	 */
	public int getIdClasse() {
		return idClasse;
	}

	/**
	 * @param idClasse
	 *            the idClasse to set
	 * @uml.property name="idClasse"
	 */
	public void setIdClasse(int idClasse) {
		this.idClasse = idClasse;
	}

	/**
	 * @return the idSquadra
	 * @uml.property name="idSquadra"
	 */
	public int getIdSquadra() {
		return idSquadra;
	}

	/**
	 * @param idSquadra
	 *            the idSquadra to set
	 * @uml.property name="idSquadra"
	 */
	public void setIdSquadra(int idSquadra) {
		this.idSquadra = idSquadra;
	}

	/**
	 * @return the nciv
	 * @uml.property name="nciv"
	 */
	public int getNciv() {
		return nciv;
	}

	/**
	 * @param nciv
	 *            the nciv to set
	 * @uml.property name="nciv"
	 */
	public void setNciv(int nciv) {
		this.nciv = nciv;
	}

	/**
	 * @return the nome
	 * @uml.property name="nome"
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 *            the nome to set
	 * @uml.property name="nome"
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the note
	 * @uml.property name="note"
	 */
	public String getNote() {
		return note;
	}

	/**
	 * @param note
	 *            the note to set
	 * @uml.property name="note"
	 */
	public void setNote(String note) {
		this.note = note;
	}

	/**
	 * @return the ntel1
	 * @uml.property name="ntel1"
	 */
	public String getNtel1() {
		return ntel1;
	}

	/**
	 * @param ntel1
	 *            the ntel1 to set
	 * @uml.property name="ntel1"
	 */
	public void setNtel1(String ntel1) {
		this.ntel1 = ntel1;
	}

	/**
	 * @return the ntel2
	 * @uml.property name="ntel2"
	 */
	public String getNtel2() {
		return ntel2;
	}

	/**
	 * @param ntel2
	 *            the ntel2 to set
	 * @uml.property name="ntel2"
	 */
	public void setNtel2(String ntel2) {
		this.ntel2 = ntel2;
	}

	/**
	 * @return the ntel3
	 * @uml.property name="ntel3"
	 */
	public String getNtel3() {
		return ntel3;
	}

	/**
	 * @param ntel3
	 *            the ntel3 to set
	 * @uml.property name="ntel3"
	 */
	public void setNtel3(String ntel3) {
		this.ntel3 = ntel3;
	}

	/**
	 * @return the sesso
	 * @uml.property name="sesso"
	 */
	public char getSesso() {
		return sesso;
	}

	/**
	 * @param sesso
	 *            the sesso to set
	 * @uml.property name="sesso"
	 */
	public void setSesso(char sesso) {
		this.sesso = sesso;
	}

	/**
	 * @return the tessera
	 * @uml.property name="tessera"
	 */
	public String getTessera() {
		return tessera;
	}

	/**
	 * @param tessera
	 *            the tessera to set
	 * @uml.property name="tessera"
	 */
	public void setTessera(String tessera) {
		this.tessera = tessera;
	}

	/**
	 * @return the via
	 * @uml.property name="via"
	 */
	public String getVia() {
		return via;
	}

	/**
	 * @param via
	 *            the via to set
	 * @uml.property name="via"
	 */
	public void setVia(String via) {
		this.via = via;
	}

}
