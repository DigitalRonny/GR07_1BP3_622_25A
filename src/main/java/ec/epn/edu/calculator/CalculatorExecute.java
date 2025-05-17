package ec.epn.edu.calculator;

public class CalculatorExecute {
    public static void main(String[] args) {
        System.out.println("==== Welcome to Calculator Execute ====");
        Calculator calc = new Calculator();

        System.out.println("=== Welcome to Calculator Execute ===");
        System.out.println(" ");

        System.out.println("===ADDITION===");
        int add = calc.add(1, 2);
        System.out.println("Addition: 1 + 2 = "+ add);

        System.out.println("===DIVISON===");
        int division = calc.division(30,3);
        System.out.println("Division: 30 / 3 = "+ division);

        System.out.println("===MULTIPLICATION===");
        int multiplication = calc.multiplication(10,2);
        System.out.println("Multiplication: 10 * 2 = "+ multiplication);


    }
}
