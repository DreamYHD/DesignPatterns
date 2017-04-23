package cn.edu.nuc;

/**
 * Created by Administrator on 2017/4/23.
 */
public class Client {
    public static void main(String[] args) {

        AbstractComputer mComputer=new CodeComputer();
        mComputer.startUp();
        AbstractComputer mComputer1=new LeaderComputer();
        mComputer1.startUp();




    }
}
