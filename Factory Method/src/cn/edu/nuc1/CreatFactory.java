package cn.edu.nuc1;

/**
 * Created by Administrator on 2017/4/23.
 */
public class CreatFactory extends Factory {
    @Override
    public <T extends Product> T creatProduct(Class<T> mTClass) {
        Product p=null;
        try {
            p= (Product) Class.forName(mTClass.getName()).newInstance();
        } catch (InstantiationException mE) {
            mE.printStackTrace();
        } catch (IllegalAccessException mE) {
            mE.printStackTrace();
        } catch (ClassNotFoundException mE) {
            mE.printStackTrace();
        }

        return (T) p;
    }
}
