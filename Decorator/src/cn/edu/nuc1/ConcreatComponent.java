package cn.edu.nuc1;

/**
 * Created by Administrator on 2018/4/22.
 */
public class ConcreatComponent extends Component {
    @Override
    public void invoke() {
        System.out.println("我要被装饰了  hhhhhhh");
    }
}
