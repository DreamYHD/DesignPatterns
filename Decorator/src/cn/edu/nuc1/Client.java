package cn.edu.nuc1;

/**
 * Created by Administrator on 2018/4/22.
 */
public class Client {
    public static void main(String[] args) {

        new ComponentA(new ConcreatComponent()).invoke();
    }
}
