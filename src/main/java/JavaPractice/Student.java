package JavaPractice;

public class Student {

    int rollnumber;
    String name;
    static String collagename= "JNTU";

    public int printRollNumber(){
        return rollnumber;
    }
    public String printName(){
        return name;
    }

    public String printCollageName(){
        return collagename;
    }

    public static void main(String[] args) {

        Student s1=new Student();

    }
}
