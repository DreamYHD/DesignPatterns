/**
 * Created by Administrator on 2017/4/19.
 */
public class SingletonTwoSync {

    private static SingletonTwoSync mSingletonSync=null;

    private SingletonTwoSync(){

    }

    public static SingletonTwoSync mSingletonTwoSync(){
        if (mSingletonSync == null) {
            synchronized (SingletonTwoSync.class){
                if (mSingletonSync == null) {
                    mSingletonSync=new SingletonTwoSync();
                }
            }
        }
        return mSingletonSync;

    }

}
