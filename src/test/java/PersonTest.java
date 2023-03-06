import JavaPractice.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    //TODO Add an annotation to make this method a test method
    @Test
    public void testPerson(){
     //TODO create an instance of Person using 2 argument constructor

        Person p1=new Person( "Anusha", "Ramasahayam");
       // Person p2=new Person("Vikram","Ramasahayam");


     //TODO using Person get Methods assert firstName and lastName is working as expected

        assertEquals("Anusha",p1.getfirstNmae());
        assertEquals("Ramasahayam",p1.getLastname());
       // assertEquals("Vikram",p2.getfirstNmae());


    }
}
