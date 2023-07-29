package OOP.Generalizations;

public abstract class Fructs {
    private  double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Fructs(double weight) {
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "{" +
                "weight=" + weight +
                '}';
    }
}
