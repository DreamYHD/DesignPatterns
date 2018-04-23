package cn.edu.nuc2;

import java.util.concurrent.*;

/**
 * Created by Administrator on 2018/4/23.
 */
public class Client {
    public static void main(String[] args) {
       Observable observable = new ObservableImp();
       observable.attach(new ObserverImp1());
       observable.attach(new ObserverImp2());
       FutureTask<String> future = new FutureTask<String>(new Callable<String>() {
            @Override
            public String call() throws Exception {
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
                return "hello";
            }
        });
        ExecutorService  executorService = new ThreadPoolExecutor(
                5,
                10,
                10,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>());
        executorService.execute(() -> observable.attach(new ObserverImp1()));
        try {
            if (future.get().equals("hello")){
                observable.notifyObserver("hi baby i am your father");
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }



    }
}
