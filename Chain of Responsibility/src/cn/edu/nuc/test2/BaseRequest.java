package cn.edu.nuc.test2;

/**
 * Created by Administrator on 2017/4/21.
 */
public abstract class BaseRequest {
    private Object mObject;

    public BaseRequest(Object mObject){
        this.mObject=mObject;
    }

    public Object getContent() {
        return mObject;
    }

    protected abstract int getRequestLevel();
}
