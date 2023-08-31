package ExceptionHandling;

import java.util.Arrays;

public class Test {
    public static void main(String[] args){

        ExceptionList.printExceptionList();
    }
    public static int[] divArrays(int[] a, int[] b){
        if (a.length != b.length){
            return new int[1];}
        int[] result = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            result[i] = a[i] / b[i];
        }
        return result;
    }
}
