package cn.edu.nuc2;

/**
 * Created by Administrator on 2018/4/22.
 */
public class Client {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Produce produce = factory.createProduce(AProduce.class);
        produce.produce();
        produce = factory.createProduce(BProduce.class);
        produce.produce();



    }
}
