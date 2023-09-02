package ExceptionHandling.AdvancedExceptionHandling.Homework;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        UserBase userBase = new UserBase();
//        generateBase(25);
//        userBase.add();
        userBase.add("ктулху александр иванович 07.07.1999 89991113232 m");
    }

    public static void generateBase(int count) {
        UserBase userBase = new UserBase();
        String[] lastNames = {"Шаров", "Устинов", "Вишняков"};

        String[] names = {"Александр", "Дмитрий", "Максим", "Сергей", "Андрей", "Алексей", "Артём", "Илья",
                "Кирилл", "Михаил", "Никита", "Матвей", "Роман", "Егор", "Арсений", "Иван", "Денис", "Евгений",
                "Тимофей", "Владислав", "Игорь", "Владимир", "Павел", "Руслан", "Марк", "Константин"};

        Random random = new Random();

        for (int i = 0; i < count; i++) {
            userBase.add(String.format("%s %s МнеЛеневич %d.%d.%d 89998887766 m",
                    lastNames[random.nextInt(0, lastNames.length)],
                    names[random.nextInt(0, names.length)],
                    random.nextInt(10, 30),
                    random.nextInt(10, 12),
                    random.nextInt(1980, 2005)));
        }
    }
}
