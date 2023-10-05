package HeadFirstJava;

public class AmericanDog {

    String name;

    public static void main(String[] args) {
        AmericanDog pet = new AmericanDog();
        pet.bark();
        pet.name = "Melo";

        AmericanDog[] myDogs = new AmericanDog[3];
        myDogs[0] = new AmericanDog();
        myDogs[1] = new AmericanDog();
        myDogs[2] = pet;

        myDogs[0].name = "coco";
        myDogs[1].name = "Fred";

        System.out.print("last dog's name is  ");
        System.out.println(myDogs[2].name);

        System.out.println("*************************");

        //int x = 0;
        //while (x < myDogs.length) {
           // myDogs[x].bark();
          //  x = x + 1;
       // for(int x=0; x<myDogs.length;x++){
         //   myDogs[x].bark();
        //}
        int x=0;
        while(x<myDogs.length){
            myDogs[x].bark();
            myDogs[x].eat();
            myDogs[x].chasecat();
        x++;
        System.out.println("**********************");
        }
        }


        public void bark() {
            System.out.println(name + "  says Ruff!");
        }
        public void eat() {
        System.out.println(name + " eats chicken ");

        }
        public void chasecat() {
        System.out.println(name +"  chasecats ");

        }

    }

