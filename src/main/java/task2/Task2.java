package task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            Task2 task2 = new Task2();
            task2.calcWithoutMulti(a, b, c);
        } catch (InputMismatchException e) {
            System.out.println("enter number please");
        }
    }

    public int calcWithoutMulti(int a, int b, int c) {
        if (a == 1) {
            a = 0;
        }

        if (b == 1) {
            b = 0;
        }

        if (c == 1) {
            c = 0;
        }

        int result = 0;


        //berechnen (5+5+5+0)=15
        for (int i = 0; i < a; i++) {
            result = result + b;
        }

        int temp = result;

        for (int i = 1; i < c; i++) {
            result = result + temp;
        }

        System.out.println("Ergebnis: " + result);
        return result;
    }
}

