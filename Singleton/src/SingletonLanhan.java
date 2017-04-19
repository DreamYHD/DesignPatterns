/**
 * Created by Administrator on 2017/4/19.
 */

/**
 * 懒汉
 */
public class SingletonLanhan {

    private  static  SingletonLanhan mSingletonLanhan=null;


    private SingletonLanhan(){

    }

    public static SingletonLanhan getInstance(){

        if (mSingletonLanhan==null){
            mSingletonLanhan=new SingletonLanhan();
        }
        return mSingletonLanhan;
    }
}
