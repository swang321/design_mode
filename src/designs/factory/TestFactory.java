package designs.factory;

/**
 * @ProjectName: design_mode
 * @Author: swang
 * @Date: 2018/9/21 12:03
 * @Description:
 */
public class TestFactory {

    public static void main(String[] args) {

        ICarFactory factory = null;
        // bike
        factory = new BickFactory();
        Car bike = factory.getCar();
        bike.getWork();

        //  bus
        factory = new BusFactory();
        Car bus = factory.getCar();
        bus.getWork();

    }

}
