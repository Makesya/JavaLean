package ToyShop;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        String input = "1 2 конструктор; 2 2 робот; 3 6 кукла.";
        String[] toys = input.split("; ");
        int[] ids = new int[toys.length];
        int[] frequencies = new int[toys.length];

        for (int i = 0; i < toys.length; i++) {
            String[] toy = toys[i].split(" ");
            ids[i] = Integer.parseInt(toy[0]);
            frequencies[i] = Integer.parseInt(toy[1]);
        }

        PriorityQueue<Toy> queue = new PriorityQueue<>(toys.length, Comparator.comparingInt(Toy::getFrequency));

        for (int i = 0; i < toys.length; i++) {
            queue.add(new Toy(ids[i], toys[i].split(" ")[1], frequencies[i]));
        }

        Random random = new Random();
        FileWriter writer = new FileWriter("output.txt");

        for (int j = 1; j < 11; j++) {
            writer.write("\n======== " + j + " ========");
            for (int i = 0; i < toys.length; i++) {
                int randomInt = frequencies[i];
                if (randomInt < 2) writer.append("\n1");
                else if (randomInt < 4) writer.append("\n2");
                else {writer.append("\n3");}}
        }

        writer.close();

    }
}