package OOP.StandartInterface;

public class Student extends User {
    private final int meanBall;

    //====== Constructor =========

    public Student(int id, String firstName, String lastName, int meanBall) {
        super(id, firstName, lastName);
        this.meanBall = meanBall;
    }

    //======= Getters and Setters =======

    public int getMeanBall() {
        return meanBall;
    }
    //======= Override =======

    @Override
    public String toString() {
        return super.toString() + " meanBall " + meanBall;
    }

    @Override
    public int compareTo(Teacher o) {
        return 0;
    }

    @Override
    public int compareTo(Student o){
        return (int)(this.getMeanBall()-o.meanBall);
    }
}
