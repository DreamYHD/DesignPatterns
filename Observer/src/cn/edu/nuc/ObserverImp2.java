package cn.edu.nuc;

/**
 * Created by Administrator on 2017/4/22.
 */
public class ObserverImp2 implements Observer {
    @Override
    public void next(Observable mObservable) {
        System.out.println("Observer2"+mObservable.getNumber());
    }
    @Override
    public void complete() {
        System.out.println("Observer2 complete");
    }
    @Override
    public void wrong() {
        System.out.println("something wrong");
    }
}
