/**
 * 
 */
package beans;

/**
 * @author Emanuele
 */
public class Gite {

	/**
	 * @uml.property name="id_iscritto"
	 */
	private int id_iscritto;

	/**
	 * Getter of the property <tt>id_iscritto</tt>
	 * 
	 * @return Returns the id_iscritto.
	 * @uml.property name="id_iscritto"
	 */
	public int getId_iscritto() {
		return id_iscritto;
	}

	/**
	 * Setter of the property <tt>id_iscritto</tt>
	 * 
	 * @param id_iscritto
	 *            The id_iscritto to set.
	 * @uml.property name="id_iscritto"
	 */
	public void setId_iscritto(int id_iscritto) {
		this.id_iscritto = id_iscritto;
	}

	/**
	 * @uml.property name="id_gita"
	 */
	private int id_gita;

	/**
	 * Getter of the property <tt>id_gita</tt>
	 * 
	 * @return Returns the id_gita.
	 * @uml.property name="id_gita"
	 */
	public int getId_gita() {
		return id_gita;
	}

	/**
	 * Setter of the property <tt>id_gita</tt>
	 * 
	 * @param id_gita
	 *            The id_gita to set.
	 * @uml.property name="id_gita"
	 */
	public void setId_gita(int id_gita) {
		this.id_gita = id_gita;
	}

	/**
	 * @uml.property name="pagato"
	 */
	private boolean pagato;

	/**
	 * Getter of the property <tt>pagato</tt>
	 * 
	 * @return Returns the pagato.
	 * @uml.property name="pagato"
	 */
	public boolean getPagato() {
		return pagato;
	}

	/**
	 * Setter of the property <tt>pagato</tt>
	 * 
	 * @param pagato
	 *            The pagato to set.
	 * @uml.property name="pagato"
	 */
	public void setPagato(boolean pagato) {
		this.pagato = pagato;
	}

	/**
	 * @uml.property name="accompagnato"
	 */
	private boolean accompagnato;

	/**
	 * Getter of the property <tt>accompagnato</tt>
	 * 
	 * @return Returns the accompagnato.
	 * @uml.property name="accompagnato"
	 */
	public boolean getAccompagnato() {
		return accompagnato;
	}

	/**
	 * Setter of the property <tt>accompagnato</tt>
	 * 
	 * @param accompagnato
	 *            The accompagnato to set.
	 * @uml.property name="accompagnato"
	 */
	public void setAccompagnato(boolean accompagnato) {
		this.accompagnato = accompagnato;
	}

	/**
	 * @uml.property name="nome_accompagnatore"
	 */
	private String nome_accompagnatore = "";

	/**
	 * Getter of the property <tt>nome_accompagnatore</tt>
	 * 
	 * @return Returns the nome_accompagnatore.
	 * @uml.property name="nome_accompagnatore"
	 */
	public String getNome_accompagnatore() {
		return nome_accompagnatore;
	}

	/**
	 * Setter of the property <tt>nome_accompagnatore</tt>
	 * 
	 * @param nome_accompagnatore
	 *            The nome_accompagnatore to set.
	 * @uml.property name="nome_accompagnatore"
	 */
	public void setNome_accompagnatore(String nome_accompagnatore) {
		this.nome_accompagnatore = nome_accompagnatore;
	}

}
