/**
 * Created by Administrator on 2017/4/19.
 */
public class BuilderTest {

    public static void main(String[] args) {
        Car car=new Car.Builder()
                .setColor("green")
                .setMoney(100)
                .setName("lanbojini")
                .setSeat()
                .build();
        System.out.println(car.toString());

    }
}
