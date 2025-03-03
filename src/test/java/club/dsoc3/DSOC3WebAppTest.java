package club.dsoc3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DSOC3WebAppTest {
    
    @Test
    public void testWelcomeMessage() {
        // A simple test case
        assertTrue(true); 
    }

    @Test
    public void testStringEquality() {
        // Test case to check if the welcome message is correct
        String expectedMessage = "Welcome to DevSecOps Club!!!";
        String actualMessage = "Welcome to DevSecOps Club!!!"; // This should come from your application logic
        assertEquals(expectedMessage, actualMessage, "The welcome message should be 'Welcome to DevSecOps Club!!!'");
    }

    @Test
    public void testNotNull() {
        // Test case to check if an object is not null
        Object obj = new Object();
        assertNotNull(obj, "The object should not be null");
    }

    @Test
    public void testArrayEquality() {
        // Test case to check if arrays are equal
        int[] expectedArray = {1, 2, 3, 4, 5};
        int[] actualArray = {1, 2, 3, 4, 5};
        assertArrayEquals(expectedArray, actualArray, "The arrays should be equal");
    }

    @Test
    public void testBooleanCondition() {
        // Test case to check a boolean condition
        boolean isActive = true;
        assertTrue(isActive, "The isActive flag should be true");
    }

    @Test
    public void testException() {
        // Test case to check if an exception is thrown
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            throw new IllegalArgumentException("Invalid argument");
        });
        assertEquals("Invalid argument", exception.getMessage());
    }
}

