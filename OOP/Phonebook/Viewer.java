package OOP.Phonebook;

import java.util.Scanner;

public class Viewer {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        while (true){
            clear();
            System.out.println("1. Create contact\n" +
                               "2. Show Contacts\n" +
                               "3. Delete contact\n" +
                               "4. Edit contact\n");
            System.out.print("Execute: ");
            Book x = new Book();

            switch (scanner.next()) {
                case ("1"):{clear(); x.addContact();break;}
                case ("2"):{x.showContacts(); clear(); break;}
                case ("3"):{ clear(); break;}
                case ("4"):{System.out.println("X44"); clear(); break;}
                case ("0"):{System.exit(1); clear(); break;}


            }


        }
    }
        public static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();}
}
