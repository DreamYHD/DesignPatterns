package cn.edu.nuc2;

/**
 * Created by Administrator on 2018/4/23.
 */
public class Client {
    public static void main(String[] args) {
       Observable observable = new ObservableImp();
       observable.attach(new ObserverImp1());
       observable.attach(new ObserverImp2());
       observable.attach(new Observer() {
           @Override
           public void next(String s) {
               System.out.println("this is nononono");
           }

           @Override
           public void complete() {
               System.out.println("this is nonono complete");
           }
       });
       observable.notifyObserver("hi baby i am your father");




    }
}
