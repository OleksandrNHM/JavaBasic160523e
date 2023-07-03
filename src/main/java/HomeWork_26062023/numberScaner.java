package HomeWork_26062023;

import java.util.Scanner;

public class numberScaner {
    public static void main(String[] args) {
        /*Создайте алгоритм, который считывал бы через Scanner число и
        проверял бы четное оно или нет (результат четности/нечетности
        необходимо вывести в консоль)*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Ввелите число: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("Число " + number + " четное.");
        } else {
            System.out.println("Число " + number + " нечетное.");
        }
    }
}
