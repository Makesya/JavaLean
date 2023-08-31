package ExceptionHandling;



public class ExceptionList {

    public static void printExceptionList(){
        System.out.println("""
                ====================================================================
                ClassCastException - Неверное приведение типов (Например string в int)
                IllegalArgumentException - Неддопустимый аргумент в методе
                IndexOutBoundsException - Выход за пределы массива
                ====================================================================
                NumberFormatException - Неверное приобразование строки в число
                IOException - Ошибка ввода\\вывода
                NullPointerException - Обращение к несуществуещему объекту
                ====================================================================
                FileNotFoundException - Файл не найден
                ClassNotFoundException - Класс не найден
                UnsupportedOperationException - Попытка выполнения не реализованного метода
                ====================================================================
                """);
    }
}
