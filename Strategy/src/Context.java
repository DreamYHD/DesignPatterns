/**
 * Created by Administrator on 2017/4/20.
 */
public class Context {
    private BubbleSort mBubbleSort;

    public void setSort(BubbleSort mBubbleSort) {
        this.mBubbleSort = mBubbleSort;
    }

    public void sort(){
        mBubbleSort.sort();
    }
}
