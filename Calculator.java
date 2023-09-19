public class Calculator {
    public static double performOperation(double num1, double num2, char operator) {
// task 4

        double result = 0.0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("0으로 나눌 수 없습니다.");
                }
                break;
            default:
                System.out.println("올바른 연산자를 입력하세요.");
        }


        return result;
    }
	public static double calculateSquareRoot(double number) {
    if (number >= 0) {
        return Math.sqrt(number);
    } else {
        System.out.println("음수에 대한 제곱근을 계산할 수 없습니다.");
        return Double.NaN; // 무한대를 나타내는 특수한 Double 값
    }
}
}
