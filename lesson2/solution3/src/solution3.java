public class solution3 {
    public static void main(String[] args) {
        int i=5+(int)(Math.random()*155);
        if (i>25 && i<100) System.out.println("Число "+i+" содержится в интервале (25,100)");
        else System.out.println("Число "+i+" не содержится в интервале (25,100)");
    }
}
