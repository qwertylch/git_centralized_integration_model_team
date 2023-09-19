import java.util.Scanner;
11111111111


// Task 1
public class CalculatorInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("간단한 콘솔 계산기 프로그램");

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요 (끝내려면 q를 입력하세요): ");
            String input = scanner.next();

            if (input.equalsIgnoreCase("q")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            try {
                double num1 = Double.parseDouble(input);

                System.out.print("두 번째 숫자를 입력하세요: ");
                double num2 = scanner.nextDouble();

                System.out.print("사용할 연산자를 입력하세요 (+, -, *, /): ");
                char operator = scanner.next().charAt(0);

                double result = Calculator.performOperation(num1, num2, operator);

                if (!Double.isNaN(result)) {
                    System.out.println("결과: " + result);
                } else {
                    System.out.println("잘못된 연산입니다.");
                }
            } catch (NumberFormatException e) {
                System.out.println("유효한 숫자를 입력하세요.");
                scanner.nextLine(); // 입력 버퍼 비우기
            } catch (ArithmeticException e) {
                System.out.println("0으로 나눌 수 없습니다.");
            }
        }

        scanner.close();
    }
}

