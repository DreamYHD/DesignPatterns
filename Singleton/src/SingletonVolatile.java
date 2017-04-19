/**
 * Created by Administrator on 2017/4/19.
 */
public class SingletonVolatile {

    private volatile static SingletonVolatile mSingletonVolatile=null;

    private SingletonVolatile(){

    }
    public static  SingletonVolatile getSingletonVolatile(){

        if (mSingletonVolatile == null) {
            synchronized (SingletonVolatile.class){
                mSingletonVolatile=new SingletonVolatile();
            }
        }
        return mSingletonVolatile;
    }


}

