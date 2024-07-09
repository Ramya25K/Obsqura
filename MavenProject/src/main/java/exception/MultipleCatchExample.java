package exception;

public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
        	int result = 10 / 0; // This will cause an ArithmeticException 
        	
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // This will cause an ArrayIndexOutOfBoundsException

            
            
            String str = null;
            System.out.println(str.length()); // This will cause a NullPointerException
           
        } catch (ArrayIndexOutOfBoundsException e) {// This handles array index out-of-bounds exceptions.
            System.out.println("Array index is out of bounds: " + e.getMessage());
        } catch (ArithmeticException e) {//This handles arithmetic exceptions, such as division by zero.
            System.out.println("Arithmetic exception: " + e.getMessage());
        } 
        catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: " + e.getMessage());
        }
        catch (Exception e) { //This is a general exception handler that catches any exception not caught by the previous catch blocks.
            System.out.println("An exception occurred: " + e.getMessage());
           
        } 
        finally {
            System.out.println("This block is always executed.");
        }
    }
}

//In a try block, once an exception is thrown and caught by a corresponding catch block,
//the control flow of the program moves to the catch block and then optionally to the finally block. 
//The remaining code in the try block after the point where the exception was thrown is not executed
