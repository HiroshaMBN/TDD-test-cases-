package Tdd.Tdd;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import static Tdd.Tdd.App.isValidUserName;
//import org.junit.*;
/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
//        assertTrue(true);
    	String username = "Hirosha";
    	String username1 = "hirosha badnara";
    	String username2 ="hirosha@123";
    	String username3 ="hirosha_abc";
    	String username4 ="hirosha24d";
    	String username5 ="hirosha#w";
    	assertTrue(isValidUserName(username));
    	assertTrue(isValidUserName(username1));
    	assertTrue(isValidUserName(username2));
    	assertTrue(isValidUserName(username3));
    	assertTrue(isValidUserName(username4));
    	assertTrue(isValidUserName(username5));
    	
    }
}
