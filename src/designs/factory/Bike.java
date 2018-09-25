package designs.factory;

/**
 * @ProjectName: design_mode
 * @Author: swang
 * @Date: 2018/9/21 11:58
 * @Description: 定义实际的产品类，总共定义两个，bike 和bus 分别表示不同的交通工具类
 */
public class Bike implements Car{

    @Override
    public void getWork() {
        System.out.println("骑自行车上班");
    }

}
