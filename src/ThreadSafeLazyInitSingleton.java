public class ThreadSafeLazyInitSingleton {
    // volatile -
    private static volatile ThreadSafeLazyInitSingleton instance;

    private ThreadSafeLazyInitSingleton() {
    }

    public static synchronized ThreadSafeLazyInitSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeLazyInitSingleton();
        }
        return instance;
    }
}
