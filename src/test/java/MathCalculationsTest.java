import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathCalculationsTest {

    @Test
    void multiplication() {
        int results=MathCalculations.multiplication(10,5);
        assertEquals(15,results);
    }

    @Test
    void additionMethod() {
        MathCalculations m= new MathCalculations();
        int results = m.additionMethod(10,5);
        assertEquals(15,results);
    }
}