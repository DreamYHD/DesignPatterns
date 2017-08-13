package cn.edu.nuc;

/**
 * Created by Administrator on 2017/8/13.
 */
public class ProxySubject implements Subject {
    private Subject subject;
    public ProxySubject(Subject subject){
        this.subject = subject;
    }
    @Override
    public void visit() {
        System.out.println("pre Subject");
        subject.visit();
        System.out.println("post Subject");
    }
}
