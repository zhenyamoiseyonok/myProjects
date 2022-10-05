package lesson8;

public class CalculatorImpl implements Calculator {

    public void operation(User currentUser, double firstNumber, double secondNumber, String operation) {
        double result = 0;
        switch (operation) {
            case "+":
                result = firstNumber + secondNumber;
                System.out.println("Результат: " + result);
                break;
            case "-":
                result = firstNumber - secondNumber;
                System.out.println("Результат: " + (firstNumber - secondNumber));
                break;
            case "*":
                result = firstNumber * secondNumber;
                System.out.println("Результат: " + (firstNumber * secondNumber));
                break;
            case "/":
                result = firstNumber / secondNumber;
                System.out.println("Результат: " + (firstNumber / secondNumber));
                break;
        }
        currentUser.setValue(result);
    }
}
