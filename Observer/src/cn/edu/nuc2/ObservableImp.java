package cn.edu.nuc2;

/**
 * Created by Administrator on 2018/4/23.
 */
public class ObservableImp extends Observable {
    public void execute(String s){
        notifyObserver(s);
    }
}
