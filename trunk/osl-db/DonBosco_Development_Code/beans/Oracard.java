/**
 * 
 */
package beans;

import java.sql.Date;

import exceptions.TooLongException;

/**
 * @author Emanuele Panigati
 */
public class Oracard {

	/**
	 * @uml.property name="id"
	 */
	private int id;

	/**
	 * Getter of the property <tt>id</tt>
	 * 
	 * @return Returns the id.
	 * @uml.property name="id"
	 */
	public int getId() {
		return id;
	}

	/**
	 * Setter of the property <tt>id</tt>
	 * 
	 * @param id
	 *            The id to set.
	 * @uml.property name="id"
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @uml.property name="num_carta"
	 */
	private String num_carta = "";

	/**
	 * Getter of the property <tt>num_carta</tt>
	 * 
	 * @return Returns the num_carta.
	 * @uml.property name="num_carta"
	 */
	public String getNum_carta() {
		return num_carta;
	}

	/**
	 * Setter of the property <tt>num_carta</tt>
	 * 
	 * @param num_carta
	 *            The num_carta to set.
	 * @throws TooLongException 
	 * @uml.property name="num_carta"
	 */
	public void setNum_carta(String num_carta) throws TooLongException {
		if(num_carta.length() > 12) throw new TooLongException("Il numero di carta è troppo lungo...");
		this.num_carta = num_carta;
	}

	/**
	 * @uml.property name="credito_attuale"
	 */
	private float credito_attuale;

	/**
	 * Getter of the property <tt>credito_attuale</tt>
	 * 
	 * @return Returns the credito_attuale.
	 * @uml.property name="credito_attuale"
	 */
	public float getCredito_attuale() {
		return credito_attuale;
	}

	/**
	 * Setter of the property <tt>credito_attuale</tt>
	 * 
	 * @param credito_attuale
	 *            The credito_attuale to set.
	 * @uml.property name="credito_attuale"
	 */
	public void setCredito_attuale(float credito_attuale) {
		this.credito_attuale = credito_attuale;
	}

	/**
	 * @uml.property name="tetto_spesa"
	 */
	private float tetto_spesa;

	/**
	 * Getter of the property <tt>tetto_spesa</tt>
	 * 
	 * @return Returns the tetto_spesa.
	 * @uml.property name="tetto_spesa"
	 */
	public float getTetto_spesa() {
		return tetto_spesa;
	}

	/**
	 * Setter of the property <tt>tetto_spesa</tt>
	 * 
	 * @param tetto_spesa
	 *            The tetto_spesa to set.
	 * @uml.property name="tetto_spesa"
	 */
	public void setTetto_spesa(float tetto_spesa) {
		this.tetto_spesa = tetto_spesa;
	}

	/**
	 * @uml.property name="spesa"
	 */
	private float spesa;

	/**
	 * Getter of the property <tt>spesa</tt>
	 * 
	 * @return Returns the spesa.
	 * @uml.property name="spesa"
	 */
	public float getSpesa() {
		return spesa;
	}

	/**
	 * Setter of the property <tt>spesa</tt>
	 * 
	 * @param spesa
	 *            The spesa to set.
	 * @uml.property name="spesa"
	 */
	public void setSpesa(float spesa) {
		this.spesa = spesa;
	}

	/**
	 * @uml.property name="ultimo_uso"
	 */
	private Date ultimo_uso;

	/**
	 * Getter of the property <tt>ultimo_uso</tt>
	 * 
	 * @return Returns the ultimo_uso.
	 * @uml.property name="ultimo_uso"
	 */
	public Date getUltimo_uso() {
		return ultimo_uso;
	}

	/**
	 * Setter of the property <tt>ultimo_uso</tt>
	 * 
	 * @param ultimo_uso
	 *            The ultimo_uso to set.
	 * @uml.property name="ultimo_uso"
	 */
	public void setUltimo_uso(Date ultimo_uso) {
		this.ultimo_uso = ultimo_uso;
	}

	/**
	 * 
	 */
	public Oracard() {}

	/**
	 * @param id
	 * @param num_carta
	 * @param credito_attuale
	 * @param tetto_spesa
	 * @param spesa
	 * @param ultimo_uso
	 */
	public Oracard(int id, String num_carta, float credito_attuale, float tetto_spesa, float spesa, Date ultimo_uso) throws TooLongException {
		
		if(num_carta.length() > 12) throw new TooLongException("Il numero di carta è troppo lungo...");
		this.id = id;
		this.num_carta = num_carta;
		this.credito_attuale = credito_attuale;
		this.tetto_spesa = tetto_spesa;
		this.spesa = spesa;
		this.ultimo_uso = ultimo_uso;
	}
	
	

	
}
