// Усов Максим

public class CreationExample {
    public static void main(String[] args) {
        try {
            Cat tom = new Cat();
            tom.name = "Thomas";
            tom.age = 5;
            tom.weight = 3.2;
            
            Cat kilkCat = new Cat("kilka", 3, 1.2, true);

            tom.info();
            System.out.println(kilkCat.toString());
            tom.meow();
        } catch (Exception e) {
            System.out.println("\n\n\n" + e.getMessage());
        }

    }
}
class Cat {
    int age = 0; // Возраст
    double weight = 0; // Вес
    String name = "Не задано"; // Имя
    boolean thoroughbred = false; // Породистый

    @Override
    public String toString() {
        return (name + ", " + age + " лет, " + weight + " кг");
    }


    Cat(){};
    Cat(String name){
        this.name = name;
    };
    Cat(String name, int age){
        this.name = name;
        this.age = age;
    };
    Cat(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    };
    Cat(String name, int age, double weight, boolean thoroughbred){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.thoroughbred = thoroughbred;
    };


    public void info(){
        System.out.printf("Имя: %s\nВозраст: %d лет\nВес: %.2f кг\nПородистый: %s\n\n", this.name, this.age, this.weight, this.thoroughbred ); }
    public void meow(){
        System.out.printf("%s: Meeeooow!\n", this.name);}
    
}