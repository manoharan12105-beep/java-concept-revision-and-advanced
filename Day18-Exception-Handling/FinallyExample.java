public class Main{
	public static void main(String[] args){
		 try{
        int number = 20 / 2;
        System.out.println("Result: " + number);
    } 
    catch (ArithmeticException e){
        System.out.println("Arithmetic error.");
    } 
    finally{
        System.out.println("Cleanup code executed (finally block).");
    }
	}
}

//Result: 10
//Cleanup code executed (finally block).
