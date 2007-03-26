/**
 * 
 */
package exceptions;

/**
 * @author Emanuele Panigati
 * Se il dato immesso è troppo lungo per il campo tiro questa eccezione.
 *
 */
public class TooLongException extends Exception {

	private static final long serialVersionUID = 855119616701718946L;
	
	public TooLongException() {
		super();
	}
	
	public TooLongException(String msg) {
		super(msg);
	}

}
