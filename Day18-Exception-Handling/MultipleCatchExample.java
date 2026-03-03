public class Main
{
	public static void main(String[] args) {
		try {
            String str = null;
            System.out.println(str.length());
        } 
        catch (NullPointerException e) {
            System.out.println("Null reference detected.");
        } 
        catch (Exception e) {
            System.out.println("General exception occurred.");
        }

        System.out.println("Execution completed.");
	}
}

//Null reference detected.
//Execution completed.
