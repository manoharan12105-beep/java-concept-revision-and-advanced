@FunctionalInterface
interface Operation{
    int apply(int a, int b);
}

public class Main{
    public static int calculate(int a, int b, Operation op){
        return op.apply(a, b);
    }

    public static void main(String[] args){

        Operation add = (x, y) -> x + y;

        Operation subtract = (x, y) -> x - y;

        Operation multiply = (x, y) -> x * y;

        Operation divide = (x, y) ->{
            if (y == 0){
                throw new ArithmeticException("Cannot divide by zero");
            }
            return x / y;
        };

        System.out.println("Addition: " + calculate(10, 5, add));
        System.out.println("Subtraction: " + calculate(10, 5, subtract));
        System.out.println("Multiplication: " + calculate(10, 5, multiply));
        System.out.println("Division: " + calculate(10, 5, divide));
    }
}

/*
Output : 

Addition: 15
Subtraction: 5
Multiplication: 50
Division: 2
*/

