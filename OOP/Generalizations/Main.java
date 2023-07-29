package OOP.Generalizations;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        GenericBox<Apple> genBox = new GenericBox<>(List.of(new Apple(1.2)));
        System.out.println(genBox);
        GenericBox<Orange> orangeGenericBox = new GenericBox<>(List.of(new Orange(6.7)));
        System.out.println(orangeGenericBox);

        System.out.println(orangeGenericBox.compareTo(genBox));

    }
}
