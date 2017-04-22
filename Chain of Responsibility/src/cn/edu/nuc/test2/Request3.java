package cn.edu.nuc.test2;

/**
 * Created by Administrator on 2017/4/22.
 */
public class Request3 extends BaseRequest {

    public Request3(Object mObject) {
        super(mObject);
    }

    @Override
    protected int getRequestLevel() {
        return 3;
    }
}
