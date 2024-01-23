package HeadFirstJava;

public class NewDogMain {

    public static void main(String[] args) {
        NewDog one= new NewDog();
        one.size=70;
        NewDog two= new NewDog();
        two.size=8;
        NewDog three= new NewDog();
        three.size=35;
        one.bark();
        two.bark();
        three.bark();
    }
}
