package OOP.Generalizations;

public class Apple extends Fructs{



    public Apple(double weight) {
        super(weight);
    }


    @Override
    public String toString() {
        return "Apple" + super.toString();
    }
}
