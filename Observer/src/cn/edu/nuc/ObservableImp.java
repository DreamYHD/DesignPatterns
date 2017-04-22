package cn.edu.nuc;

/**
 * Created by Administrator on 2017/4/22.
 */
public class ObservableImp extends  Observable {
    @Override
    public int getNumber() {
        return 1;
    }

    @Override
    public void execute() {

        notifyObservers();
    }
}
