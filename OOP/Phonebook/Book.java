package OOP.Phonebook;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book extends  Contact{

    List<Contact> contactList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public  void addContact() throws InterruptedException {
        clear();
        System.out.print("Contact name: ");
        String name = sc.next();
        System.out.print("Contact nubmer: ");
        BigInteger number = sc.nextBigInteger();

        contactList.add(new Contact(name, number));
        System.out.printf("Added contact: %s %d\n\n", name, number);
        clear();}


    public void showContacts(){
        for(Contact item:contactList){
            System.out.println(item);
        }

    }
        public static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();}
}
