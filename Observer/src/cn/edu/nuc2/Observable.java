package cn.edu.nuc2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Administrator on 2018/4/23.
 */
public abstract class Observable {
    private List<Observer>list = new ArrayList<>();
    private ReentrantLock reentrantLock = new ReentrantLock();
    public void attach(Observer observer){
        if (observer == null)
            throw new NullPointerException();
        reentrantLock.lock();
            if (list.contains(observer)) {
              return;
            }
            list.add(observer);
        reentrantLock.unlock();
    }
    public void detach(Observer observer){
        if (observer == null)
           throw new NullPointerException();
        reentrantLock.lock();
        if (!list.contains(observer)){
            System.out.println("不包含当前观察者");
            return;
        }
        list.remove(observer);
        reentrantLock.unlock();
    }
    public void clean(){
        list.clear();
    }
    void notifyObserver(String s){
        for (Observer observer : list) {
           observer.next(s);
           observer.complete();
        }

    }
}
