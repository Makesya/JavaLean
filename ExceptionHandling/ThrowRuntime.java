package ExceptionHandling;

public class ThrowRuntime {
    public static void main(String[] args) {
        Integer [] arr = {1,4,null,3,5,11,42,null,25};
        checkNull(arr);

    }
    public static void checkNull(Integer[] array){
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null){
                out.append(i + " ");
            }
        }
        if (!out.isEmpty()){
            throw new RuntimeException("Empty cells in array: " + out);
        } else {
            System.out.println("There are no empty cells in the array, everything is fine!");
        }
    }
}
