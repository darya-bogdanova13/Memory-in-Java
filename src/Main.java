import com.sun.jdi.Value;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задание 10");
        Person person = new Person("Lyapis ", "Trubetskoy");
        System.out.println("Value1: " + person);
        changeValue(person);
        System.out.println("Value2: " + person);
    }
        public static void changeValue(Person person) {
            System.out.println("changeValue1: " + person);
            person.setName("Ilya");
            person.setSurname("Lagutenko");
            System.out.println("changeValue2: " + person);
        }
    }