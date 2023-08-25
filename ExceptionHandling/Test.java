package ExceptionHandling;

import java.util.Arrays;

public class Test {
    public static void main(String[] args){
        int [] a = new int[]{12, 8, 16};
        int [] b = new int[]{4, 2, 4};
        divArrays(a,b);

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
