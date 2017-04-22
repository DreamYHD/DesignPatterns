package cn.edu.nuc.test2;

/**
 * Created by Administrator on 2017/4/22.
 */
public class Request2 extends BaseRequest{
    public Request2(Object mObject) {
        super(mObject);
    }

    @Override
    protected int getRequestLevel() {
        return 2;
    }
}
