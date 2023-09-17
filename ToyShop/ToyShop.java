package ToyShop;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ToyShop {
    private List<Toy> toys = new ArrayList<>();

    public void addToy(int id, String name, int quantity, int weight) {
        Toy toy = new Toy(id, name, quantity, weight);
        toys.add(toy);
    }

    public void updateWeight(int id, int newWeight) {
        for (Toy toy : toys) {
            if (toy.getId() == id) {
                toy.setWeight(newWeight);
                break;
            }
        }
    }

    public Toy selectPrizeToy() {
        Random random = new Random();
        int totalWeight = calculateTotalWeight();
        int randomNumber = random.nextInt(totalWeight);
        int cumulativeWeight = 0;

        for (Toy toy : toys) {
            cumulativeWeight += toy.getWeight();
            if (randomNumber < cumulativeWeight) {
                return toy;
            }
        }

        return null;
    }

    public void giveAwayPrizeToy() {
        Toy prizeToy = selectPrizeToy();
        if (prizeToy != null) {
            toys.remove(prizeToy);
            decreaseQuantity(prizeToy);
            writePrizeToyToFile(prizeToy);
        }
    }

    private int calculateTotalWeight() {
        int totalWeight = 0;
        for (Toy toy : toys) {
            totalWeight += toy.getWeight();
        }
        return totalWeight;
    }

    private void decreaseQuantity(Toy toy) {
        toy.setQuantity(toy.getQuantity() - 1);
    }

    private void writePrizeToyToFile(Toy toy) {
        try {
            FileWriter writer = new FileWriter("ToyShop/prize_toys.txt", true);
            writer.write(toy.getName() + " - " + toy.getWeight() + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }}