package designs.singleton;

/**
 * @ProjectName: design_mode
 * @Author: swang
 * @Date: 2018/9/20 15:09
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        // 饿汉模式
        Singleton s1 = Singleton.getInstance();
        Singleton s11 = Singleton.getInstance();
        if (s1==s11) {
            System.out.println("一样的");
        }

        // 懒汉模式
        Singleton2 s2 = Singleton2.getInstance();
        Singleton2 s22 = Singleton2.getInstance();
        if (s2==s22){
            System.out.println("一样得");
        }
    }

}
