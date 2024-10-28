import javax.xml.validation.Validator;

public class Main {
    public static void main(String[] args) {
        validator validator = new validator("fbnfdDSg1342", "yghb34RMse", "yghb34RMse");
        try {
            validator.validateLogin();
            validator.validatePassword();
            System.out.println("Login and password are valid");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}
