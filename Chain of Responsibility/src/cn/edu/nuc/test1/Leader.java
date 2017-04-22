package cn.edu.nuc.test1;

/**
 * Created by Administrator on 2017/4/21.
 */
public abstract class Leader {

    protected Leader mNextLeader;

    /**
     * 处理请求
     * @param money
     */
    public final void handleRequest(int money){
        if (money <limit()) {
            handle(money);
        }else {
            if (mNextLeader != null) {
                mNextLeader.handleRequest(money);
            }
        }
    }

    /**
     * 自身能承受的最大额度
     * @return
     */
    public abstract int limit();

    /**
     * 处理报销
     * @param money
     */
    public abstract void handle(int money);




}
