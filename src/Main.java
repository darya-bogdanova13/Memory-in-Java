import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задание 5");
        int value = 33;
        System.out.println("value = " + value);
        changeValue(value);
        System.out.println("value = " + value);
    }
    private static void changeValue(int value1) {
        value1 = 22;
        System.out.println("value1 = " + value1 );
    }
}