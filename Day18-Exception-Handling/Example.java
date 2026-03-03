public class Example {
    static void withdraw(double balance, double amount) {
        if (amount <= 0) 
            throw new IllegalArgumentException("Amount must be greater than zero.");
        if (amount > balance)
            throw new ArithmeticException("Insufficient balance.");

        System.out.println("Withdrawal successful. Remaining balance: " + (balance - amount));
    }
    public static void main(String[] args) {
        double balance = 1000;
        try {
            withdraw(balance, 500);
            withdraw(balance, -50);
        } 
        catch (IllegalArgumentException e){
            System.out.println("Validation Error: " + e.getMessage());
        } 
        catch (ArithmeticException e) {
            System.out.println("Transaction Error: " + e.getMessage());
        } 
        finally {
            System.out.println("Transaction completed.");
        }

        System.out.println("Program ended safely.");
    }
}
/* Output:

      Withdrawal successful. Remaining balance: 500.0
      Validation Error: Amount must be greater than zero.
      Transaction completed.
      Program ended safely

*/



