package cn.edu.nuc.test1;

/**
 * Created by Administrator on 2017/4/21.
 */
public class Manager extends Leader {
    @Override
    public int limit() {
        return 10000;
    }

    @Override
    public void handle(int money) {
        System.out.println("manager"+money);

    }
}
