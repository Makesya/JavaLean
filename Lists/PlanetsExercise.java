package Lists;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class PlanetsExercise {
    public static void main(String[] args) throws InterruptedException {
        planetsCounter(25);
    }
     public static void planetsCounter(int n) throws InterruptedException{
        List<String> listPlanets = List.of("Mercury", "Venus", "Earth",
                                           "Mars", "Jupiter", "Saturn", 
                                           "Uranus", "Neptune", "Pluton");
        List<String> randPlanets = new ArrayList<String>(n);
        int[] counts = new int[listPlanets.size()];

        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            randPlanets.add(listPlanets.get(rand.nextInt(listPlanets.size())));
            System.out.print(randPlanets.get(i) + " ");
            counts[listPlanets.indexOf(randPlanets.get(i))]++;
        }
        System.out.println();

        for (int i = 0; i < counts.length; i++)
        System.out.printf("%s - %d\n", listPlanets.get(i), counts[i]);

        System.out.println("\n Удаляю повторения...");
        for (int i = 0; i < randPlanets.size(); i++) {
            System.out.print("=");
            Thread.sleep(100);  }

            Set<String> planetSet = new HashSet<>(randPlanets);
            randPlanets.clear();
            randPlanets.addAll(planetSet);

        System.out.println("\n Завершено!");
        for (String planet : randPlanets) {
            System.out.print(planet + " ");
        }

    }
}
