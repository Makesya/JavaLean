package ExceptionHandling.AdvancedExceptionHandling.Workshop;

public class CounterMain {
    public static void main(String[] args) {
        try (Counter counter = new Counter();) {
            counter.add(32);
            counter.getCount();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static void doSomething() throws Exception {
        throw new Exception("Something error");
    }
}
