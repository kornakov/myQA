import java.util.Scanner;
public class Login {
    public static void enterNumber() throws PhoneNumberException{
    Scanner in = new Scanner(System.in);
    long number;
    System.out.println("Press your phone number");
    number=in.nextLong();
    if (number/1000000000!=89) throw new  PhoneNumberException("Phone number should be 89XXXXXXXXX");
}

public static void enterPassword() throws PasswordException{
    Scanner in = new Scanner(System.in);
    String password;
    System.out.println("Press your password");
    password=in.next();
    if ((password.length()<8) || !(password.matches("[A-Za-z0-9]*"))) throw new  PasswordException("Password must contain at least 8 letters or numbers");
    
   
} 

}








class PhoneNumberException extends Exception{
    public PhoneNumberException(String message){
        super(message);
        
    }
}
    class PasswordException extends Exception{
    public PasswordException(String message){
        super(message);
        
    }

}
