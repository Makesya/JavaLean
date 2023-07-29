package OOP.StandartInterface;

public class Teacher extends User {
    private int rating;
    private String discipline;

    //======== Constructor ========

    public Teacher(int id, String firstName, String lastName, int rating, String discipline) {
        super(id, firstName, lastName);
        this.rating = rating;
        this.discipline = discipline;
    }
    //======== Getters and setters ========


    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    //======== Override ========
    @Override
    public int compareTo(Teacher o) {
        return (int)(this.getRating() - o.getRating());
    }
    @Override
    public int compareTo(Student o) {
        return 0;
    }
}

