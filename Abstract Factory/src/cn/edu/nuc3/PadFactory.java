package cn.edu.nuc3;

/**
 * Created by Administrator on 2018/4/22.
 */
public class PadFactory implements BaseFactory {
    @Override
    public Apple createAppleStyle() {
        return new Ipad();
    }

    @Override
    public Sumsung createSumsung() {
        return new Note2();
    }
}
