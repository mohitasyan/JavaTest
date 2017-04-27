package Singleton;

public class EagerTest {
private static final EagerTest instance = new EagerTest();
    
    //private constructor to avoid client applications to use constructor
    private EagerTest(){}

    public static EagerTest getInstance(){
        return instance;
    }
}
