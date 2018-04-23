package cn.edu.nuc3;

/**
 * Created by Administrator on 2018/4/22.
 */
public class Client {
    public static void main(String[] args) {
        BaseFactory baseFactory = new FaxtoryPhone();
        baseFactory.createAppleStyle();
        baseFactory.createSumsung();
        baseFactory = new PadFactory();
        baseFactory.createSumsung();
        baseFactory.createAppleStyle();
    }
}
