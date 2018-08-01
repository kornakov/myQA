import java.util.*;
public class solution4 {


        public static void main(String[] args) {
            String str="Я у мамы программист";
            String strWithLower=str.toLowerCase();
            ArrayList <Character> v= new ArrayList();
            for (int i=0; i<str.length(); i++)
            {
                int count=0;
                for(int j=0; j<str.length(); j++)
                {
                    if (strWithLower.charAt(i)==strWithLower.charAt(j)) count++;
                }
                if (count==1 && strWithLower.charAt(i)!=' ') v.add(strWithLower.charAt(i));
            }
            System.out.print("[");
            Character [] d = {};
            d = v.toArray(new Character[v.size()]);
            Arrays.sort(d);
            for(int j=0; j<v.size(); j++)
            {
                System.out.print("'");
                System.out.print(d[j]);
                System.out.print("'");
                if (j!=v.size()-1)System.out.print(", ");
            }
            System.out.print("]");

        }



}
