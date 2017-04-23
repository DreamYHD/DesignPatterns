package cn.edu.nuc1;

/**
 * Created by Administrator on 2017/4/23.
 */
public class Client {

    public static void main(String[] args) {

        CreatFactory mCreatFactory=new CreatFactory();
        Product mProduct=mCreatFactory.creatProduct(Product1.class);
        mProduct.start();
        mProduct.end();
        Product mProduct1=mCreatFactory.creatProduct(Product2.class);
        mProduct1.start();
        mProduct1.end();



    }
}
