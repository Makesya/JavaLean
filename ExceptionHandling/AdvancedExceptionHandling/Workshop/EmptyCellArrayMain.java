package ExceptionHandling.AdvancedExceptionHandling.Workshop;

public class EmptyCellArrayMain {
    public static void main(String[] args) {
        try {
            Integer[] arr = {null,3,2,1,null,3,1,1,null,3,31};
            for (Integer a : arr){
                System.out.println(a/2);
            }

        } catch (NullPointerException e){
            throw new EmptyCellArrayException();
        }
    }
}
