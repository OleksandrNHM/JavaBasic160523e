package scannerExamples;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter pls value for A: ");
        int a = sc.nextInt();

        System.out.println("Дусятичное: " + a);
        System.out.println("Восьмеричное: " + Integer.toOctalString(a));
        System.out.println("Двоичное: " + Integer.toBinaryString(a));
        System.out.println("Шестнадцатеричное: " + Integer.toHexString(a));
    }
}
