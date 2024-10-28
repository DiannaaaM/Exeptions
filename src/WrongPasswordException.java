public class WrongPasswordException extends Throwable {
    public WrongPasswordException(String invalidPassword) {
        super(invalidPassword);
    }
}
