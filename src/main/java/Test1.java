import 单例.HungrySingleton;
import 单例.LazySingleton;

/**
 * @Author whh
 */
public class Test1 {


    public static void main(String[] args) {


        LazySingleton.getInstance();
        LazySingleton.getInstance();
        HungrySingleton.getInstance();
        HungrySingleton.getInstance();

    }

}
