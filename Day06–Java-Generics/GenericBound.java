class NumberBox<T extends Number> {
    T number;
    public NumberBox(T number) {
        this.number = number;
    }

    public double doubleValue() {
        return number.doubleValue();
    }
}

public class Main {
    public static void main(String[] args) {
        NumberBox<Integer> intBox = new NumberBox<>(10);
        NumberBox<Double> doubleBox = new NumberBox<>(5.5);

        System.out.println(intBox.doubleValue());
        System.out.println(doubleBox.doubleValue());

        // This will give Error
        // NumberBox<String> strBox = new NumberBox<>("Hello");
    }
}

/*
Output : 

10.0
5.5

Link : https://onlinegdb.com/7l-ZCc9-n
*/
