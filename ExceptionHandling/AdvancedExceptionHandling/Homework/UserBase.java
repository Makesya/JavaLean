package ExceptionHandling.AdvancedExceptionHandling.Homework;

import java.io.*;
import java.util.Scanner;

public class UserBase extends CheckData {

    /**
     * Метод добавления человека в БД
     */
    public void add() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("""
                    Введите данные в формате\s
                      Фамилия Имя Отчество Дата Телефон Пол (m, f)
                      Например: Иванов Игорь Александрович 08.12.1995 89990001122 m
                     разделённые пробелом:\s""");
            String data = scanner.nextLine().trim();
            String[] inData = data.split(" ");
            String lastName = checkName(inData[0]);
            String name = checkName(inData[1]);
            String surname = checkName(inData[2]);
            String birthDay = checkData(inData[3]);
            long numberPhone = checkPhone(inData[4]);
            String gender = checkGender(inData[5].toLowerCase());

            save(lastName, name, surname, birthDay, numberPhone, gender);

        } catch (IndexOutOfBoundsException e) {
            throw new RuntimeException("""
                    \n>>> Проверьте введённые данные
                    >>> (Возможно вы ввели недостаточно информации)
                    """);
        }
    }

    /**
     * Метод добавления человека в БД
     * Принимаемые аргументы:
     *
     * @param data строка для получения данных <br>
     *             lastName - Фамилия <br>
     *             name - Имя <br>
     *             surname - Отчество  <br>
     *             birthDay - Дата рождения <br>
     *             numberPhone - Номер телефона  <br>
     *             gender - Пол (m, f)
     */
    public void add(String data) {
        try {
            String[] inData = data.trim().split(" ");
            if (inData.length != 6) {
                throw new RuntimeException("""
                        \n>>> Ошибка ввода данных:
                        >>> Проверьте кол-во указаных полей""");
            }
            String lastName = checkName(inData[0]);
            String name = checkName(inData[1]);
            String surname = checkName(inData[2]);
            String birthDay = checkData(inData[3]);
            long numberPhone = checkPhone(inData[4]);
            String gender = checkGender(inData[5].toLowerCase());

            save(lastName, name, surname, birthDay, numberPhone, gender);

        } catch (IndexOutOfBoundsException e) {
            throw new RuntimeException("""
                    \n>>> Проверьте введённые данные
                    >>> (Возможно вы ввели недостаточно информации)
                    """);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void save(String lastName, String name, String surname,
                      String birthDay, long numberPhone, String gender) {

        String data = String.format("<%s><%s><%s><%s><%s><%s>",
                lastName, name, surname, birthDay, numberPhone, gender);
        String path = "D:\\JavaProjects\\JavaLean\\ExceptionHandling\\AdvancedExceptionHandling\\Homework\\DataBase\\" + lastName;
        try (
                BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
                BufferedReader reader = new BufferedReader(new FileReader(path))) {

            String line = reader.readLine();
            while (line != null) {
                if (line.equals(data)) {
                    System.err.println("Такая запись уже есть: " + data);
                    System.exit(1);
                }
                line = reader.readLine();
            }
            writer.write(data + "\n");

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (NullPointerException e) {
            System.out.println("||| " + e.getMessage());
        }
    }


}
