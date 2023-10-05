package HeadFirstJava;

public class Dog {

    int size;
    String name;
    String breed;
    String color;


    void bark(){
        System.out.println("Ruff Ruff");
    }
    void printSize(){
        System.out.println(size);

    }
    public String getColor(){
        return "red";
    }
    public String getBreed(){
        return "DogBreed";
    }
}
