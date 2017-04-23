package cn.edu.nuc;

/**
 * Created by Administrator on 2017/4/23.
 */
public class LeaderComputer extends AbstractComputer {

    @Override
    protected void login() {
        System.out.println("leader的电脑要指纹操作");
    }
}
