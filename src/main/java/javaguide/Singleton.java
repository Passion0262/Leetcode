package javaguide;

public class Singleton {

    private volatile static Singleton resource;

    private Singleton(){}

    public static Singleton getResource() {
        if (resource == null){
            synchronized (Singleton.class){
                if (resource == null){
                    resource = new Singleton();
                }
                return resource;
            }
        }
        return resource;
    }
}
