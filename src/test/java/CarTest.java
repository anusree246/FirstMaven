import HeadFirstJava.Car;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    void bothCarsareEqual(){
        Car c1= new Car("2013","Honda");
        Car c2= new Car("2016","BMW");
        Car c3= new Car("2013","Honda");
assertEquals(c1,c1);

    }

}