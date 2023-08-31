package ExceptionHandling.SecondLesson.Homework;

public class Exercise_2 {
    public static void main(String[] args) {
//        try {
//            int d = 0;
//            double catchedRes1 = intArray[8] / d;                     intArray - переменная не объявлена
//            System.out.println("catchedRes1 = " + catchedRes1);
//        } catch (ArithmeticException e) {
//            System.out.println("Catching exception: " + e);
//        }
        try {
            int d = 0;
            double[] intArray = {1,3,5,6,1,2,5,6,64,87,1,321,132,3,5,1,3,2,3,1,321,21,123};
            double catchedRes1 = (intArray[8] / d); //Деление с типом float или double даёт Infinity - незнаю надо ли обрабатывать, т.к. программа не падает
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e.getMessage());
        }

    }
}
