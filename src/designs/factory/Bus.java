package designs.factory;

/**
 * @ProjectName: design_mode
 * @Author: swang
 * @Date: 2018/9/21 11:59
 * @Description:
 */
public class Bus implements Car {
    @Override
    public void getWork() {
        System.out.println("做公交车上班");
    }
}
