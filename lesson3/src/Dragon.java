public class Dragon extends Animal implements Fightable
{
    Dragon(String n) {
        name=n;
    }




    public void speak() {
        System.out.println("Gav-Gav");
    }

    public void eat() {
        System.out.println("Nym-Nym");
    }

    public void run() {
        System.out.println("RUN! tututututut");
    }




    @Override
    public  void fight(Animal c){
        if (c.health!=0 && health!=0) {
            System.out.printf("%s fireeee\n", name);
            c.health--;
            c.displayHealth();
            if(c.health==0) System.out.printf("%s wins\n", name);

        }
    }
}