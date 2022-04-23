import static org.junit.Assert.*;
 import org.junit.Test;
import static org.junit.Assert.*;
public class WatermelonTest {


        @Test
        public void even() {
            Watermelon watermelon = new Watermelon();

            assertTrue(watermelon.isEven(8));
        }
        @Test
        public void notEven() {
            Watermelon watermelon = new Watermelon();

            assertFalse(watermelon.isEven(19));
        }
    @Test(expected=IllegalArgumentException.class)
    public void OutOfRange() {
        Watermelon watermelon = new Watermelon();

        watermelon.isEven(109);
    }

    }

