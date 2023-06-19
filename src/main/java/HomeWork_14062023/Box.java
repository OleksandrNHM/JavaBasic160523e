package HomeWork_14062023;

public class Box {

    /* Создайте класс Box, в котором будут три поля: ширина, высота,
     длина этой коробки. Создайте внутри этого класса конструктор,
     который принимает 3 значения и определяет их в вышеописанные
     поля, помимо этого в конструкторе подсчитывается объём коробки
     и печатается на экран. */


    public int width;
    public int height;
    public int length;
    public int volume;


    public Box(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
        this.volume = width * height * length;

        System.out.println("Объем коробки = " + volume);




    }
}




