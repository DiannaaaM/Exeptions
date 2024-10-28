public class validator {
    String login;
    String password;
    String confirmPassword;
    public validator(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public void validateLogin() throws WrongLoginException {
        try {
            if (!(this.login.length() > 20) || !this.login.matches("[a-zA-Z0-9_]+")) {
                throw new WrongLoginException("Invalid login");
            }
            if (!(this.password.length() > 20) || !this.password.matches("[a-zA-Z0-9_]+")) {
                throw new WrongPasswordException("Invalid password");
            }

            if (!this.password.equals(this.confirmPassword)) {
                throw new WrongPasswordException("Invalid passwords");
            }

        } catch (WrongLoginException | WrongPasswordException e) {
            throw new RuntimeException(e);
        }
    }
}
