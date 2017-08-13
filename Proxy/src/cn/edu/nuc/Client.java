package cn.edu.nuc;

/**
 * Created by Administrator on 2017/8/13.
 */
public class Client {
    public static void main(String[] args) {
        SubjectImp subjectImp = new SubjectImp();
        ProxySubject  proxySubject = new ProxySubject(subjectImp);
        proxySubject.visit();

    }
}
