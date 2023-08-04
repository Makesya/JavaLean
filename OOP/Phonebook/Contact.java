package OOP.Phonebook;

import java.math.BigInteger;

public class Contact {
    String name;
    BigInteger number;

    public Contact(String name, BigInteger number) {
        this.name = name;
        this.number = number;
    }

    public Contact() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigInteger getNumber() {
        return number;
    }

    public void setNumber(BigInteger number) {
        this.number = number;
    }
}

