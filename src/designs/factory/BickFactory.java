package designs.factory;

/**
 * @ProjectName: design_mode
 * @Author: swang
 * @Date: 2018/9/21 12:02
 * @Description:
 */
public class BickFactory implements ICarFactory {
    @Override
    public Car getCar() {
        return new Bike();
    }
}
