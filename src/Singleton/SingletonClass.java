package Singleton;

public final class SingletonClass implements Cloneable{
    private static SingletonClass obj = null;

    private SingletonClass () {

    }

    public static SingletonClass getSingletonObj() {
        if (obj == null) {
            obj = new SingletonClass();
            return obj;
        }
        else
            return obj;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
class SingletonImpl {

    public static void main(String[] args) throws CloneNotSupportedException {
        SingletonClass obj1 = SingletonClass.getSingletonObj();
        SingletonClass obj2 = SingletonClass.getSingletonObj();
        //SingletonClass obj3 = (SingletonClass) obj1.clone();
        System.out.println("Object1: " + obj1.hashCode());
        System.out.println("Object2: " + obj2.hashCode());
    }



}
