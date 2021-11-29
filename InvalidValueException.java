public class InvalidValueException extends RuntimeException {
	public InvalidValueException() {
	}

	public InvalidValueException(String error) {
		super(error);
	}
}
