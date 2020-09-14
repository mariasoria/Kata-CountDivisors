import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountDivisorsTest {

    @Test
    public void test_01 (){
        assertEquals(3, CountDivisors.numberOfDivisors( 4));
    }
    @Test
    public void test_02 (){
        assertEquals(2, CountDivisors.numberOfDivisors( 5));
    }
    @Test
    public void test_03 (){
        assertEquals(6, CountDivisors.numberOfDivisors( 12));
    }
    @Test
    public void test_04 (){
        assertEquals(8, CountDivisors.numberOfDivisors( 30));
    }

    @Test
    public void test_05(){
        assertEquals(25, CountDivisors.numberOfDivisors(10000));
    }

    @Test
    public void test_06 (){
        assertEquals(36, CountDivisors.numberOfDivisors(100000));
    }

    @Test
    public void test_07 (){
        assertEquals(42, CountDivisors.numberOfDivisors(500000));
    }
}
