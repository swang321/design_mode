package designs.singleton;

/**
 * @ProjectName: design_mode
 * @Author: swang
 * @Date: 2018/9/20 14:55
 * @Description:   饿汉模式
 */
public class Singleton {

    private Singleton() {
    }

    private static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }

}
