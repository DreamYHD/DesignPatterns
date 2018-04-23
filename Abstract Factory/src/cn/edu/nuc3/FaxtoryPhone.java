package cn.edu.nuc3;

/**
 * Created by Administrator on 2018/4/22.
 */
public class FaxtoryPhone implements BaseFactory{
    @Override
    public Apple createAppleStyle() {
        return new Iphone();
    }

    @Override
    public Sumsung createSumsung() {
        return new Glaxy();
    }
}
