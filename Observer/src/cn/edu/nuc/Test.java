package cn.edu.nuc;

/**
 * Created by Administrator on 2017/4/22.
 */
public class Test {


    public static void main(String[] args) {

        Observable mObservable=new ObservableImp();
        Observer mObserver=new ObserverImp1();
        Observer mObserver1=new ObserverImp2();
        Observer mObserver2=new Observer() {
            @Override
            public void next(Observable mObservable) {
                System.out.println("this is  myself"+mObservable.getNumber());
            }

            @Override
            public void complete() {

            }

            @Override
            public void wrong() {

            }
        };
        mObservable.addObserver(mObserver);
        mObservable.addObserver(mObserver1);
        mObservable.addObserver(mObserver2);

        mObservable.execute();

        mObservable.removeAll();

        mObservable.execute();

    }
}
