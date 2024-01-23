package HeadFirstJava;

public class Person {
  // NOTE : Static method should use static variable
    // Define 2 Instance variables first name, Last name

    String firstname;
    String lastname;

    //TODO write a constructor that takes 2 string parameters. And populate firstname and lastname

    public Person(String fname, String lname){
        this.firstname=fname;
        this.lastname=lname;
    }


    // write a method to set firstname. It doesnot return anything , it take one string parameter

    public void setLastName(String lname){
        this.lastname=lname;
    }

    public void setFastName(String fname){
        this.firstname=fname;
    }

    // write a method to return firstname. It takes NO parameters, Returns String

    public String getfirstNmae(){
        return firstname;
    }

    // write get method for lastname

    public String getLastname(){
        return lastname;

    }





}
