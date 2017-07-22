package ExceptionHandling;

public class MyException extends ExceptionDemo { //Creating child class with throw statement
	/* 
	 * It will give compilation error because child class is 
	   throwing exception which has larger scope than the exception 
	   thrown by parent class.
	 
	 * Create display method and add throws statement with different exception 
	   from the parent class.
		                             
	 */
	void display() throws Exception { // Checked Exception 
		
		System.out.println("Child class exception "); //Print Statement

	}

	public static void main(String[] args) {       // Main class 
		ExceptionDemo obj = new ExceptionDemo();  // Creating abject parent class 
		MyException obj1 = new MyException();    // Creating abject child class
		try {                          // Try Block to check the exception
			obj.display();             //Printing the object parent class 
			obj1.display();            //Printing the object of child class
		} catch (Exception e) {        // Catch block when the exception is caught
			e.printStackTrace();       // Trace the exception 
		}

	}    /* NOTE:
	     This can be resolve only if we throw EXCEPTION in Parent class and IOEXCEPTION
	     in Child class.
	     Because EXCEPTION has broader scope than IOEXCEPTION .  
	     */
}
