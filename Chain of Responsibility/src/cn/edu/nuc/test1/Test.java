package cn.edu.nuc.test1;

/**
 * Created by Administrator on 2017/4/21.
 */
public class Test {
    public static void main(String[] args) {
        DireLeader mDireLeader=new DireLeader();
        GroupLrader mGroupLrader=new GroupLrader();
        Manager mManager=new Manager();

        mDireLeader.mNextLeader=mGroupLrader;
        mGroupLrader.mNextLeader=mManager;
        mManager.mNextLeader=mDireLeader;

        mDireLeader.handleRequest(4000);
    }

}
