public class EagerInitSingleton {
    private static final EagerInitSingleton INSTANCE = new EagerInitSingleton();

    // Private constructor
    private EagerInitSingleton(){}
    public static EagerInitSingleton getInstance(){
        return INSTANCE;
    }
}
