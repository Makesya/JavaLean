package OOP.StandartInterface;

public class Student {
    private int id;
    private String name;

    public Student(String name, int id){
        this.name = name;
        this.id = id;
    }

    //Getters and Setters ======================
    public String getName() {return name;}
    public int getId() { return id;}
    public void setName(String name) {this.name = name;}
    public void setId(int id) {this.id = id;}
    //==========================================


    @Override
    public String toString() {
        return String.format("ID: %d - %s", id, name);
    }
}
