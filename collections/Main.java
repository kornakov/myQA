import java.util.*;
public class Main
{
	public static void main(String[] args){
	   
	   Dogs dog=new Dogs();
	   Cats cat=new Cats();
	   String cmd;
	   int i=0;
	   ArrayList shelter = new ArrayList();
	   while(i==0){
	     System.out.println("Do you want add or take pets?\nPress ADD or TAKE. Press 0 to Exit.");
	     Scanner in = new Scanner(System.in);
	     cmd=in.next();
	     if(cmd.equals("0")) break;
	     else if (cmd.equalsIgnoreCase("ADD")) {
	         System.out.println("Do you want add cat or dog?\nPress CAT or DOG. Press 0 to Exit.");
	     
	        String pet=in.next();
	        if(pet.equals("0")) break;
	        else if (pet.equalsIgnoreCase("CAT")) shelter.add(cat);
	        else if (pet.equalsIgnoreCase("DOG")) shelter.add(dog);
	     }
	     else if (cmd.equalsIgnoreCase("TAKE")){
	         System.out.println("Do you want take cat or dog?\nPress CAT or DOG. Press 0 to Exit.");
	         String pet=in.next();
	        if(pet.equals("0")) break;
	        else if (pet.equalsIgnoreCase("CAT")) shelter.remove(cat);
	        else if (pet.equalsIgnoreCase("DOG")) shelter.remove(dog);
	     }
	   
}

	  
	  System.out.println(shelter);System.out.println(shelter.size());
    } 
}
