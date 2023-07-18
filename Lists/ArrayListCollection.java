
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ArrayListCollection {
    public static void main(String[] args) {
        createTable(3);
    }
    public static void planetsCounter(int n){
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

    }

    public static void createTable(int size){
        List<String> genres =List.of("Фантастика", "Комедия", "Детектив", "Ужасы");
        List<ArrayList<String>> table = new ArrayList<>(genres.size());
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < genres.size(); i++) {
            ArrayList<String> booksOfGenre = new ArrayList<>(size);
            booksOfGenre.add(genres.get(i));
            System.out.printf("Введите %d названий книг жанра %s: \n", size, genres.get(i));
            for (int j = 0; j < size; j++)
                 
                booksOfGenre.add(input.nextLine());
            
            table.add(booksOfGenre);
        }
        input.close();
        for (ArrayList<String> books : table) {
            for (String book : books) {
                System.out.print(book + " ");
            }
            System.out.println();
        }
    }
}
