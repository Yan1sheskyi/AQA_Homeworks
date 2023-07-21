import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Task 1 - centimeter to inch & vice versa");
        double cntm = 10;
        double inch = 25;
        double cntm2inch = cntm / 2.54;
        double inch2cntm = inch * 2.54;
        System.out.println(cntm + " см = " + cntm2inch + " дюймов");
        System.out.println(inch + " дюймов = " + inch2cntm + " см");


        System.out.println("Task 2 - 5000 UAH Vasya + 5000 UAH of his parents to euro");
        float vcash = 5000;
        float pcash = 5000;
        float eucash = (vcash + pcash) / 28;
        System.out.println("У Васі на поїздку є " + eucash + " евро");


        System.out.println("Task 3 - Десятки і одиниці в зворотному порядку");
        int des3, od3;
        System.out.println("Введіть додатнє, двозначне число");
        int x3 = scanner.nextInt();
        if (x3 > 9 && x3 <100) {
            des3 = x3 / 10;
            od3 = x3%10;
            System.out.println(od3 + " " + des3);
        } else {
            System.out.println("Введене число від'ємне, або ж не двозначне :(");
        }


        System.out.println("Task 4 - Двозначне позитивне число в 'повному вигляді'");
        int des4, od4;
        System.out.println("Введіть додатнє, двозначне число");
        int x4 = scanner.nextInt();
        if (x3 > 9 && x3 <100) {
            od4 = x4%10;
            des4 = x4 - od4;
            System.out.println(des4 + "+" + od4);
        } else {
            System.out.println("Введене число від'ємне, або ж не двозначне :(");
        }


        System.out.println("Task 5 - Вага двозначного додатнього числа");
        int des5, od5, vaga5;
        System.out.println("Введіть додатнє, двозначне число");
        int x5 = scanner.nextInt();
        if (x5 > 9 && x5 <100) {
            des5 = x5 / 10;
            od5 = x5%10;
            vaga5 = des5 + od5;
            System.out.println("Вага числа = " + vaga5);
        } else {
            System.out.println("Введене число від'ємне, або ж не двозначне :(");
        }


        System.out.println("Task 6* - Кількість парних цифр в двозначному позитивному числі");
        System.out.println("Введіть парне позитивне число");
        int x6 = scanner.nextInt();
        if (x6 > 9 && x6 < 100) {
            if ((x6/10)%2 == 0 && (x6%10)%2 == 0) {
                System.out.println("Степінь числа = 2");
            } else if ((x6/10)%2 == 1 && (x6%10)%2 == 1) {
                System.out.println("Степінь числа = 0");
            } else {
                System.out.println("Степінь числа = 1");
            }
        } else {
            System.out.println("Введене число не двозначне, або ж від'ємне");
        }


        System.out.println("Task 7 - Вивід інформації про число (позитивне/негативне/нуль)");
        int x7 = scanner.nextInt();
        if (x7 > 0) {
            System.out.println("Позитивне");
        } else if (x7 < 0) {
            System.out.println("Негативне");
        } else {
            System.out.println("Нуль");
        }


        System.out.println("Task 8 - Тризначне позитивне число мінус один");
        System.out.println("Введіть як мінімум трьохзначне та додатнє число");
        int x8 = scanner.nextInt();
        if (x8 > 99) {
            x8--;
            System.out.println(x8);
        } else {
            System.out.println("Введене число менше ніж трьохзначне, або ж взагалі від'ємне");
        }


        System.out.println("Task 9 - Що більше (число чи добуток його цифр)");
        System.out.println("Введіть парне позитивне число");
        int x9 = scanner.nextInt();
        int mcx9 = (x9/10)*(x9%10);
        if (x9 > 9 && x9 < 100) {
            if (x9 > mcx9) {
                System.out.println("Введене число більше за його добуток");
            } else {
                System.out.println("Введене число менше ніж його добуток");
            }
        }
        else {
            System.out.println("Введене число не двозначне, абож взагалі від'ємне");
        }
    }
}
