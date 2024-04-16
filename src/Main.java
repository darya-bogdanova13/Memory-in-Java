import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задание 7");
        Integer [] value = new Integer[] {3, 4};
        changeValue(value);
        System.out.println(Arrays.toString(value));
    }
    private static void changeValue(Integer[] value) {
        value = new Integer[] {1, 2};
        System.out.println(Arrays.toString(value));
    }
}