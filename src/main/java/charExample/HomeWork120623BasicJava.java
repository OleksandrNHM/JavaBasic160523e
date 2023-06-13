package charExample;

public class HomeWork120623BasicJava {
    public static void main(String[] args) {

        char test1 = '0';
        int q = test1;
        System.out.println(q);

        char test2 = '0';
        String w = String.valueOf(test2);
        int ww = Integer.parseInt(w);
        System.out.println(ww);

        char test3 = '0';
        int e = Character.getNumericValue(test3);
        System.out.println(e);



    }
}
