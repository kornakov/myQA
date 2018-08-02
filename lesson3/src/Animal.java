public abstract class Animal implements Fightable
{
    public int health=2;
    public String name;
    public String owner;
    public boolean home;
    public char sex;
    public abstract void run();
    public abstract void eat();
    public abstract void speak();
    public void displayInfo()
    {
        System.out.printf("Name:%s\tHas Home:%b\tSex:%c\tOwner:%s\n", name, home, sex, owner);
    }
    public void displayHealth()
    {
        System.out.printf("%s's health: %d\n",name, health);
    }


}

