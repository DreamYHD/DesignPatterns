package cn.edu.nuc.test1;

/**
 * Created by Administrator on 2017/4/21.
 */
public class GroupLrader extends Leader {

    @Override
    public int limit() {
        return 5000;
    }

    @Override
    public void handle(int money) {
        System.out.println("groupLeader"+money);

    }
}
