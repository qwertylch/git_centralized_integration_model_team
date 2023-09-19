import java.util.Scanner;

public class CalculatorInput {
    public static void getInputAndCalculate() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("간단한 콘솔 계산기 프로그램");
        System.out.print("첫 번째 숫자를 입력하세요: ");
        double num1 = scanner.nextDouble();

        System.out.print("두 번째 숫자를 입력하세요: ");
        double num2 = scanner.nextDouble();

        System.out.print("사용할 연산자를 입력하세요 (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result = Calculator.performOperation(num1, num2, operator);

        if (!Double.isNaN(result)) {
            System.out.println("결과: " + result);
        }

        scanner.close();
    }
}
