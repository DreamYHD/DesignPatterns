package cn.edu.nuc.test2;

/**
 * Created by Administrator on 2017/4/21.
 */
public class Test {

    public static void main(String[] args) {

        //构造三个处理者
        BaseHandle mBaseHandle1=new Handler1();
        BaseHandle mBaseHandle2=new Handler2();
        BaseHandle mBaseHandle3=new Handler3();

        //设置下一个节点的矗处理者对象
        mBaseHandle1.mNextBaseHandle=mBaseHandle2;
        mBaseHandle2.mNextBaseHandle=mBaseHandle3;
        mBaseHandle3.mNextBaseHandle=mBaseHandle1;

        //构造三个请求者对象
        BaseRequest mRequest1=new Request1("Requese1");
        BaseRequest mRequest2=new Request2("Request2");
        BaseRequest mRequest3=new Request3("Request3");

        //总是从链式的首端发起请求
        mBaseHandle1.handleRequest(mRequest1);
        mBaseHandle2.handleRequest(mRequest2);
        mBaseHandle3.handleRequest(mRequest3);

    }
}
