package cn.edu.nuc;

/**
 * Created by Administrator on 2017/4/23.
 */
public class CodeComputer extends AbstractComputer {
    @Override
    protected void login() {
        System.out.println("程序员的电脑需要密码");
    }
}
