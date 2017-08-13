package cn.edu.nuc;

/**
 * Created by Administrator on 2017/8/13.
 */
public class SubjectImp implements Subject {
    @Override
    public void visit() {
        System.out.println("hello Subject");
    }
}
