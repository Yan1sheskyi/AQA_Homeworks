import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("LoopTask 1 - последовательность 1000+3+3+...");
        for (int i1 = 1000; i1 < 10000; i1 = i1 + 3) {
            System.out.print(i1 + " ");
        }
        System.out.println();


        System.out.println("LoopTask 2 - неотрицательные элем.");
        for (int i2 = 10; i2 >= -10; i2 -= 4) {
            if (i2>=0) {
                System.out.println(i2);
            }
        }


        System.out.println("LoopTask 3 - факториал числа");
        System.out.println("Введите число, факториал коготорого Вы хотите узнать");
        int n3 = scanner.nextInt();
        long f3=1;
        for (int i3 = 1; i3 <= n3; i3++) {
            f3 = i3*f3;
        }
        System.out.println("Факториал числа " + n3 + " = " + f3);


        System.out.println("LoopTask 4 - сумма цифр введенного числа");
        System.out.println("Введите натуральное число");
        int x4 = scanner.nextInt();
        int s4 = 0;
        if (x4 > 0) {
            while (x4>0) {
                s4 = s4 + x4%10;
                x4 = x4 / 10;
            }
            System.out.println(s4);
        } else {
            System.out.println("Введеное число не натуральное");
        }


        System.out.println("ArrayTask1 - чётные числа от 2 до 20");
        int[] arr1 = new int[10];
        int x5 = 2;
        for (int ia1 = 0; ia1 < 10; ia1++) {
                arr1[ia1] = x5;
                x5 += 2;
        }
        for (int ia1 = 0; ia1 < 10; ia1++) {
            System.out.print(arr1[ia1] + " ");
        }
        System.out.println();
        for (int ia1 = 0; ia1 < 10; ia1++) {
            System.out.println(arr1[ia1]);
        }


        System.out.println("ArrayTask2 - нечётные от 1 до 99 и наоборот");
        int[] arr2 = new int[50];
        int x6 = 1;
        for (int ia2 = 0; ia2 < arr2.length; ia2++) {
            arr2[ia2] = x6;
            x6 += 2;
        }
        for (int ia2 = 0; ia2 < 50; ia2++) {
            System.out.print(arr2[ia2] + " ");
        }
        System.out.println();
        for (int ia2 = 49; ia2 >= 0; ia2--) {
            System.out.print(arr2[ia2] + " ");
        }
        System.out.println();


        System.out.println("ArrayTask 3* - 2 масива из 5 случайных чисел из отрезка [0;5]");
        int[] arr3_1 = new int[5];
        int[] arr3_2 = new int[5];
        float suma1 = 0, suma2 = 0, sa1, sa2;
        System.out.println("Введите елементы пергого масива от 0 до 5");
        for (int ia3 = 0; ia3 < 5; ia3++) {
            arr3_1[ia3] = scanner.nextInt();
            suma1 = suma1 + arr3_1[ia3];
        }
        sa1 = suma1 / 5;
                System.out.println("Введите елементы второго масива от 0 до 5");
        for (int ia3 = 0; ia3 < 5; ia3++) {
            arr3_2[ia3] = scanner.nextInt();
            suma2 = suma2 + arr3_2[ia3];
        }
        sa2 = suma2 / 5;
        if (sa1 > sa2) {
            System.out.println("Ср. арифм. знач. элем. ПЕРВОГО масива БОЛЬШЕ чем ВТОРОГО");
        } else if (sa1 < sa2) {
            System.out.println("Ср. арифм. знач. элем. ВТОРОГО масива БОЛЬШЕ чем ПЕРВОГО");
        } else {
            System.out.println("Ср. арифм. знач. элем. обоих масивов РАВНЫ");
        }
    }
}
