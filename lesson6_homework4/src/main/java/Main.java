import java.util.Scanner;

public class Main {

    public static int getInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static String getOperation() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static int calc(int num1, int num2, String operation) {
        switch (operation) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            default:
                return 0;

        }
    }

    public static void main(String[] args) {
        System.out.println("Введите первое число");
        int x = getInt();
        System.out.println("Введите второе число");
        int y = getInt();
        System.out.println("Введите оператор (+ - * /)");
        String oper = getOperation();
        int res = calc(x,y, oper);
        System.out.println(x + " " + oper + " " + y + " = " + res);
    }
}
