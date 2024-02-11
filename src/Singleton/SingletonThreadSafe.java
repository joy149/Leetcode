package Singleton;

public class SingletonThreadSafe {
    private volatile static SingletonThreadSafe instance;

    private SingletonThreadSafe() {}

    // 1st version: creates multiple instances if two thread 
    // access this method simultaneously 
    public static SingletonThreadSafe getInstance1()
    {
        if (instance == null) {
            instance = new SingletonThreadSafe();
        }

        return instance;
    }

    // 2nd version : this is thread-safe and only 
    // creates one instance of SingletonThreadSafe on concurrent 
    // environment but it is unnecessarily expensive due to 
    // cost of synchronization at every call. 
    public static synchronized SingletonThreadSafe getInstance2()
    {
        if (instance == null) {
            instance = new SingletonThreadSafe();
        }
        return instance;
    }

    // 3rd version : An implementation of double checked 
    // locking of SingletonThreadSafe. Intention is to reduce cost 
    // of synchronization and improve performance, by only 
    // locking critical section of code, the code which 
    // creates instance of SingletonThreadSafe class. 
    public static SingletonThreadSafe getInstance3()
    {
        if (instance == null) {
            synchronized (SingletonThreadSafe.class)
            {
                if (instance == null) {
                    instance = new SingletonThreadSafe();
                }
            }
        }
        return instance;
    }
}
