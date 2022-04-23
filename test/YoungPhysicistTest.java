
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class YoungPhysicistTest {
    @BeforeEach
    public void init()
    {

    }
    @Test
    public void notEquilibrium() {
        YoungPhysicist Y_P= new YoungPhysicist();
        int num=3;
        int [][]forces= {{4,1,7},{-2,4,-1},{1,-5,-3}};
        assertFalse(Y_P.isEquilibrium(num,forces));
    }
    @Test
    public void Equilibrium() {
        YoungPhysicist Y_P= new YoungPhysicist();
        int num=3;
        int [][]forces= {{3,-1,7},{-5,2,-4},{2,-1,-3}};
        assertTrue(Y_P.isEquilibrium(num,forces));
    }
    @Test(expected=IllegalArgumentException.class)
    public void numbersOutOfRange() {
        YoungPhysicist Y_P= new YoungPhysicist();
        int num=3;
        int [][]forces= {{400,1,7},{-2,4,-1},{1,-5,-3}};
        Y_P.isEquilibrium(num,forces);
    }
    @Test(expected=IllegalArgumentException.class)
    public void testException()
    {
        YoungPhysicist Y_P= new YoungPhysicist();
        int num=4;
        int [][]forces= {{400,1,7},{-2,4,-1},{1,-5,-3}};
        Y_P.isEquilibrium(num,forces);
    }
}