public class Dog extends Animal implements Fightable
{
    public void speak() {
        System.out.println("Gav-Gav");
    }

    public void eat() {
        System.out.println("Nym-Nym");
    }

    public void run() {
        System.out.println("RUN! tututututut");
    }

    Dog (boolean Home, String Name) {
        name=Name;
        home=Home;
    }
    Dog (boolean h) {

        home=h;
    }
    @Override
    public  void fight(Animal c){
        if (c.health!=0 && health!=0){
            System.out.printf("%s bites\n", name);
            c.health--;
            c.displayHealth();
            if(c.health==0) System.out.printf("%s wins\n", name);

        }
    }
}