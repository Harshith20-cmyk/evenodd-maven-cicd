import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class evenoddtest {

    @Test
    void testEvenNumber() {
        assertTrue(evenodd.isEven(4));
    }

    @Test
    void testOddNumber() {
        assertFalse(evenodd.isEven(7));
    }

    @Test
    void testZeroIsEven() {
        assertTrue(evenodd.isEven(0));
    }

    @Test
    void testNegativeEvenNumber() {
        assertTrue(evenodd.isEven(-6));
    }

    @Test
    void testNegativeOddNumber() {
        assertFalse(evenodd.isEven(-5));
    }
}
