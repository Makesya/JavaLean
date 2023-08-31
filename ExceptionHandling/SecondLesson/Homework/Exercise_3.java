package ExceptionHandling.SecondLesson.Homework;
//try {
//        int a = 90;
//        int b = 3;
//        System.out.println(a / b);
//        printSum(23, 234);
//        int[] abc = { 1, 2 };
//        abc[3] = 9;
//        } catch (Throwable ex) {                                                              В Java все исключения и ошибки являются подклассами класса Throwable. Это означает, что если в блоке catch указать Throwable,
//        System.out.println("Что-то пошло не так...");                                         то будут перехвачены абсолютно все исключения и ошибки, которые могут возникнуть в блоке try. Поэтому чтобы обработать
//        } catch (NullPointerException ex) {                                                   возможные исключения перемещаю его в самый низ
//        System.out.println("Указатель не может указывать на null!");
//        } catch (IndexOutOfBoundsException ex) {
//        System.out.println("Массив выходит за пределы своего размера!");
//        }
//        }
//public static void printSum(Integer a, Integer b) throws FileNotFoundException {              throws FileNotFoundException - обработка исключения которого не может быть
//        System.out.println(a + b);
public class Exercise_3 {
    public static void main(String[] args) {                                                    // в  main(String[] args) throws Exception - нет необходимости указывать "throws Exception", т.к. все возможные
        try {                                                                                   // исключения есть в блоке catch (Throwable ex) {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;                                                                         // Убираю NullPointerException т.к. он здесь не нужен
        }  catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!\n" + ex.getMessage());// Добавлю в сообщение детали, чтобы можно было понять Где допущена ошибка
        } catch (Throwable ex) {
            System.out.println(ex.getMessage());                                                // в catch (Throwable ex) { меняю сообщение на ex.getMessage() чтобы была возможность понять в чем ошибка
        }
    }
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

}
