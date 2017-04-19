/**
 * Created by Administrator on 2017/4/19.
 */

/**
 * 方法锁
 */
public class SingletonSync {

    private static SingletonSync mSingletonSync=null;

    private SingletonSync(){

    }

    public static synchronized SingletonSync getSingletonSync(){
        if (mSingletonSync == null) {
            mSingletonSync=new SingletonSync();
        }
        return mSingletonSync;
    }

}
