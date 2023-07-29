package OOP.Generalizations;

public class Orange extends Fructs {


    public Orange(double weight) {
        super(weight);
    }

    @Override
    public String toString() {
        return "Orange" + super.toString();
    }
}
