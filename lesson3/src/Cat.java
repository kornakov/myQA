public class Cat extends Animal implements Fightable
{
    // public int health=5;
    public void speak() {
        System.out.println("Myu-myu");
    }

    public void eat() {
        System.out.println("Omomom");
    }

    public void run() {
        System.out.println("run...sleep");
    }

    Cat (String Name,char Sex,  String Owner, boolean Home) {
        name=Name;
        home=Home;
        sex=Sex;
        owner=Owner;
    }
    @Override
    public  void fight(Animal c){
        if (c.health!=0 && health!=0) {
            System.out.printf("%s scratchs\n", name);
            c.health--;
            c.displayHealth();
            if(c.health==0) System.out.printf("%s wins\n", name);

        }

    }
}