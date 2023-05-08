package exceptions;

// UNCHECKED
public class NumberLessThanZeroException extends RuntimeException {
	private int number;

	public NumberLessThanZeroException(String message, int number) {
		super(message);
		this.number = number;
	}
}
