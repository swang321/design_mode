package designs.singleton;

/**
 * @ProjectName: design_mode
 * @Author: swang
 * @Date: 2018/9/20 14:59
 * @Description:  懒汉模式
 */
public class Singleton2 {

    public Singleton2() {
    }

    private static Singleton2 instance;

    public static Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }

}
