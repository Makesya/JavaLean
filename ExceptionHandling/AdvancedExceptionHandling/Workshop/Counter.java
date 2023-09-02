package ExceptionHandling.AdvancedExceptionHandling.Workshop;

public class Counter implements AutoCloseable {
    private int count;
    private boolean isOpen = false;
//===================================================

    public Counter() {
        count = 0;
        isOpen = true;
    }

    //===================================================
    public void add() {
        if (!isOpen) {
            throw new RuntimeException("Экземпляр закрыт, проверьте данные");
        }
        count++;
    }

    public void add(int counter) {
        if (!isOpen) {
            throw new RuntimeException("Экземпляр закрыт, проверьте данные");
        }
        count += counter;

    }

    public void getCount() {
        if (!isOpen) {
            throw new RuntimeException("Экземпляр закрыт, проверьте данные");
        }
        System.out.println("Counter: " + count);
    }

    @Override
    public void close() throws Exception {
        isOpen = false;
    }
}
