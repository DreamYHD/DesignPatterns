/**
 * Created by Administrator on 2017/12/17.
 */
public class Test {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                new Thread(){
                    @Override
                    public void run() {
                        super.run();
                        System.out.println("sino");
                    }
                }.start();


                System.out.println("best");
            }
        }).start();
    }
}
