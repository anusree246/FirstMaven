package HeadFirstJava;

public class DogMain {
    public static void main(String[] args) {
        Dog d= new Dog();
        d.size=20;
        d.bark();
        d.printSize();
       String s= d.getColor();
       System.out.println(s);
       String type= d.getBreed();
       System.out.println(type);

    }
}
