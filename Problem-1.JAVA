

public class Calculator {
    private double a;
    private double b;
    private String operation;

    public Calculator(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    public double calculate() {
        switch (operation.toLowerCase()) {
            case "addition":
            case "+":
                return a + b;
            case "subtraction":
            case "-":
                return a - b;
            case "multiplication":
            case "*":
                return a * b;
            case "division":
            case "/":
                if (b != 0) {
                    return a / b;
                } else {
                    throw new ArithmeticException("Error: Division by zero is not allowed");
                }
            default:
                throw new UnsupportedOperationException("Error: Invalid operation");
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator(10.5, 2.5, "+");
        System.out.println(calculator.calculate());

        calculator = new Calculator(10.5, 2.5, "addition");
        System.out.println(calculator.calculate());

        calculator = new Calculator(10.5, 2.5, "-");
        System.out.println(calculator.calculate());

        calculator = new Calculator(10.5, 2.5, "subtraction");
        System.out.println(calculator.calculate());

        calculator = new Calculator(10.5, 2.5, "*");
        System.out.println(calculator.calculate());

        calculator = new Calculator(10.5, 2.5, "multiplication");
        System.out.println(calculator.calculate());

        calculator = new Calculator(10.5, 2.5, "/");
        System.out.println(calculator.calculate());

        calculator = new Calculator(10.5, 2.5, "division");
        System.out.println(calculator.calculate());

        try {
            calculator = new Calculator(10.5, 0, "/");
            System.out.println(calculator.calculate());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        try {
            calculator = new Calculator(10.5, 2.5, "%");
            System.out.println(calculator.calculate());
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}