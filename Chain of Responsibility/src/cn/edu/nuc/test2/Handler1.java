package cn.edu.nuc.test2;

/**
 * Created by Administrator on 2017/4/22.
 */
public class Handler1 extends BaseHandle {
    @Override
    protected int getHandleLevel() {
        return 1;
    }

    @Override
    protected void handle(BaseRequest mBaseRequest) {

        System.out.println("Handler1 handle request :"+mBaseRequest.getRequestLevel());
    }
}
