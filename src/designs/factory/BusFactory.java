package designs.factory;

/**
 * @ProjectName: design_mode
 * @Author: swang
 * @Date: 2018/9/21 12:03
 * @Description:
 */
public class BusFactory implements ICarFactory {
    @Override
    public Car getCar() {
        return new Bus();
    }
}
