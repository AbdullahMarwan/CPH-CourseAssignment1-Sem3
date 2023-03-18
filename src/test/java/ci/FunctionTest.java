package ci;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author thomas
 */
public class FunctionTest {

    public FunctionTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getTen method, of class MyFunctionality.
     */
    @Test
    public void testGetTen() {

        MyFunctionality instance = new MyFunctionality();
        assertEquals(10, instance.getTen());

        System.out.println(instance.getTen());

    }

}

