package cn.edu.nuc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2017/4/22.
 */
public abstract class Observable{

    private List<Observer>mObservers=new ArrayList<>();

    public  void addObserver(Observer mObserver){
        if (mObserver != null) {

            mObservers.add(mObserver);
        }else {
            throw new NullPointerException("mObserver not exists");
        }
    }
    public void deleteObserver(Observer mObserver){
        if (mObserver != null) {
            mObservers.remove(mObserver);
        }else {
            throw new NullPointerException("mObserver not exists");
        }
    }
    public void removeAll(){
        if (mObservers == null||mObservers.size()==0) {
            return;
        }else{
            mObservers.clear();
        }

    }
    public void notifyObservers(){
        Iterator mIterator=mObservers.iterator();
        while (mIterator.hasNext()){
            Observer mObserver= (Observer) mIterator.next();
            mObserver.next(this);
        }

    }
    public abstract int getNumber();

    public abstract void execute();





}
