package cn.edu.nuc2;

/**
 * Created by Administrator on 2018/4/23.
 */
public class ObserverImp1 implements Observer {

    @Override
    public void next(String s) {
        System.out.println("this is imp1 " + s);
    }

    @Override
    public void complete() {
        System.out.println("1 complete");
    }
}
