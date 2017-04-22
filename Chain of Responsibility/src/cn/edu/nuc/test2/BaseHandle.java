package cn.edu.nuc.test2;

/**
 * Created by Administrator on 2017/4/21.
 */
public abstract class BaseHandle {

    protected BaseHandle mNextBaseHandle;

    protected abstract int getHandleLevel();

    protected abstract void handle(BaseRequest mBaseRequest);

    public final void handleRequest(BaseRequest mBaseRequest){
        if (getHandleLevel()==mBaseRequest.getRequestLevel()){
            handle(mBaseRequest);
        }else  {
            if (mNextBaseHandle != null) {
                mNextBaseHandle.handle(mBaseRequest);
            }else {
                System.out.println("every handler can not do this ");
            }
        }


    }

}
