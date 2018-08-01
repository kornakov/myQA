class Main
{
    public static void main(String[] args) {
        Dog dog1 = new Dog(false,"Rex");
        Dog dog2 = new Dog(true);
        Cat catM = new Cat("kot", 'M', "Vasyaaa", true);
        Cat catF = new Cat("koshka", 'F', "Petro", true);
        Cat[]cats =new Cat[]{catF,catM};
        Dog[]dogs =new Dog[]{dog1,dog2};
        Dragon drags = new Dragon("Hydra");


        while((((dog1.health!=0 || dog2.health!=0) || (catF.health!=0 || catM.health!=0 ))&&drags.health!=0) ||
                (((dog1.health!=0 || dog2.health!=0) || (drags.health!=0))&&(catF.health!=0 || catM.health!=0 )) ||
                (((drags.health!=0) || (catF.health!=0 || catM.health!=0 ))&&(dog1.health!=0 || dog2.health!=0))){
            double z=Math.random();
            int i=(int)(Math.random()*2);
            int j=(int)(Math.random()*2);

            if (z<0.4)
            {
                if (z<0.2) cats[j].fight(dogs[i]);
                else cats[j].fight(drags);
            }
            else if (z>0.8)
            {
                if (z>0.9) drags.fight(cats[j]);
                else drags.fight(dogs[j]);
            }
            else {
                if (z>0.6) dogs[i].fight(cats[j]);
                else dogs[i].fight(drags);
            }


        }
        dog1.displayHealth();
        dog2.displayHealth();
        catF.displayHealth();
        catM.displayHealth();
        drags.displayHealth();

    }

}
