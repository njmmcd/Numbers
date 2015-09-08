import static org.junit.Assert.*;

public class NumberTest {

    private Number num;

    @org.junit.Before
    public void setUp() throws Exception {
        num = new Number();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        num = null;
    }

    @org.junit.Test
    public void testIsEven() throws Exception {
        assertEquals(true, num.isEven(0));
        assertEquals(false, num.isEven(0.5));
        assertEquals(false, num.isEven(1));
        assertEquals(true, num.isEven(2));
        assertEquals(true, num.isEven(-4));
    }
}