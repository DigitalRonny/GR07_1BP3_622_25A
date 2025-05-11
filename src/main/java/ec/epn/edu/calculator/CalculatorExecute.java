package ec.epn.edu.calculator;

public class CalculatorExecute {
    public static void main(String[] args) {
        System.out.println("==== Welcome to Calculator Execute ====");
        Calculator calc = new Calculator();

        int add = calc.add(1, 2);
        System.out.println("Addition: 1 + 2 = "+ add);

        int division = calc.division(30,3);
        System.out.println("Division: 30 / 3 = "+ division);
    }
}
