import java.util.*;
public abstract class Animal{
   public String colour;
   public void take(ArrayList A){
       System.out.println("You take a pet");
       int z=(int)(Math.random()*A.size());
       System.out.println(z);
       A.remove(z);
   }
}