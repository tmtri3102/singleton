public class StaticBlockSingleton {
    private static final StaticBlockSingleton INSTANCE;

    private StaticBlockSingleton() {
    }
    // Static block for exception handling
    static {
        try {
            INSTANCE = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return INSTANCE;
    }
}
