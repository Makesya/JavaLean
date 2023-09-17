package ToyShop;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ToyShop toyShop = new ToyShop();
//        toyShop.addToy(1, "Teddy Bear", 10, 30);
//        toyShop.addToy(2, "Lego Set", 5, 20);
//        toyShop.addToy(3, "Doll", 8, 25);
        for (int i = 0; i < 25; i++) {
            toyShop.addToy(i, "Toy #" + i, 25, new Random().nextInt(20, 40));
        }

        for (int i = 0; i < 10; i++) {
            toyShop.giveAwayPrizeToy();
        }
    }
}
