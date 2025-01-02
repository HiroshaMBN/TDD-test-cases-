package Tdd.Tdd;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
    	String userName ="Hirosha";
    	String userName1 = "username1";
    	isValidUserName(userName);
    }
    
    static boolean isValidUserName(String name) {
    	if(name.contains("/") || name.contains("#") || name.contains(" ") || name.contains("_") ||name.contains("@")) {
//    		return false;
//    		System.out.println("Test failed");
    		return false;
    	}
//    	return true;
//    	System.out.println("Test passed");
    	return true;
    }
}
