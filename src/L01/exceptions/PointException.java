
package L01.exceptions;

public class PointException extends Exception{
	private static final long serialVersionUID = 1L;

	public PointException(String error) { 
		super(error);
	}
}
