package HomeWork_19062023;

public class Pizza {
    public static void main(String[] args) {


    /* Напишите программу, которая вычисляет, сколько лишних калорий будет,
если вместо пиццы диаметром 24 см вы купите пиццу диаметром 28 см.
Чтобы решить эту проблему, предположим, что каждый квадратный сантиметр пиццы содержит 40 калорий.

В качестве подсказки - лучше всего создать метод для вычисления калорий в зависимости от диаметра
пиццы, его можно использовать дважды (не забываем про переиспользование) и получим дельту, это и будет ответ.
Формулу для нахождения площади пиццы (и не только) можно найти на просторах интернета.
 */

        // r = d /2
        //a = pi * r^2
        //kkal = area * cklcm2
        // Kalorie - 2

        int pizzadm1 = 24;
        int pizzadm2 = 28;
        int kcalpercm = 40;

        calcecxtrcall(pizzadm1, pizzadm2, kcalpercm);
        System.out.println(calcecxtrcall(pizzadm1, pizzadm2, kcalpercm));

    }




    public static double calcecxtrcall (int pizzadm1, int pizzadm2, int kcalpercm){

        double radius1 = pizzadm1 / 2;
        double radius2 = pizzadm2 / 2;
        double Area1 = Math.PI * (radius1 * radius1);
        double Area2 = Math.PI * (radius2 * radius2);
        double Calories1 = Area1 * kcalpercm;
        double Calories2 = Area2 * kcalpercm;
        double ExtraCaloories = Calories2 - Calories1;
        return ExtraCaloories;


    }



}