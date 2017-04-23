package cn.edu.nuc;

/**
 * Created by Administrator on 2017/4/23.
 */
public abstract class AbstractComputer {

    protected void powerOn (){
        System.out.println("开启电源");

    }
    protected void checkHardware(){
        System.out.println("检查硬件");
    }
    protected void loadOs(){
        System.out.println("载入操作系统");
    }
    protected void login(){

        System.out.println("小白的计算机无验证，直接进入操作系统");
    }
    public final void startUp(){
        System.out.println("--开机 START--");
        powerOn();
        checkHardware();
        loadOs();
        login();
        System.out.println("--关机 END--");
    }

}
