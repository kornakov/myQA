import java.util.Scanner;
public class Main
{
	public static void main(String[] args){
	    try{
      Login.enterNumber();
      Login.enterPassword();
	    }
	    catch (PhoneNumberException ex)
	    {
	       System.out.println(ex.getMessage());
	    }
	    catch (PasswordException ex)
	    {
	       System.out.println(ex.getMessage());
	    }

} 
}
