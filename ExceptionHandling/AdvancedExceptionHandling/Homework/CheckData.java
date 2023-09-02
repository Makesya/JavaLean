package ExceptionHandling.AdvancedExceptionHandling.Homework;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CheckData {

    public String checkName(String nameData) {
        char[] data = nameData.toLowerCase().toCharArray();
        for (char datum : data) {
            if (Character.isDigit(datum)) {
                throw new RuntimeException("""
                        \n>>> Ошибка ввода данных
                        >>> В ФИО нельзя вводить цифры
                        """);
            }
        }

        return nameData.toLowerCase();
    }

    public long checkPhone(String data) {
        if (data.length() < 5 || data.length() > 11) {
            throw new RuntimeException("""
                    \n>>> Ошибка ввода данных телефона:
                    >>> Вероятно указана неверная длина
                    """);
        }
        return Long.parseLong(data);
    }

    public String checkGender(String data) {
        if (!data.equals("m") && !data.equals("f")) {
            throw new RuntimeException("""
                    \n>>> Неправильно введён пол:
                    >>> Пол может указываеться только в формате (f, m) где
                    >>> m - male (Мужчина)
                    >>> f - female (Женщина)
                    """);
        }
        return data.toLowerCase();
    }

    public String checkData(String data) {
        try {
            LocalDate.parse(data.replace(".", "/"),
                    DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        } catch (DateTimeException e) {
            System.err.println("""
                    \n>>> Неверный ввод даты:
                    >>> Дата вводиться в формате dd.mm.yyyy
                    """);
            throw new RuntimeException(e.getMessage());
        }
        return data;
    }

}
