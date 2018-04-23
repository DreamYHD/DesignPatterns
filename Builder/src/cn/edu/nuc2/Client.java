package cn.edu.nuc2;

/**
 * Created by Administrator on 2018/4/22.
 */
public class Client {
    public static void main(String[] args) {
        House house = new House.Builder()
                .setHeight(15.00)
                .setLocation("陕西省")
                .setName("中北大学")
                .build();
        System.out.println(house.toString());
    }
}
