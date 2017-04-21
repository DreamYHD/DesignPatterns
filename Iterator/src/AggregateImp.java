import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/4/21.
 */
public class AggregateImp<T> implements Aggregate<T> {
    private List<T>mTList=new ArrayList<>();

    @Override
    public void add(T mO) {

        mTList.add(mO);
    }

    @Override
    public void delete(T mO) {
        mTList.remove(mO);
    }

    @Override
    public Iterator<T> iterator() {
        return new IteratorImp<T>(mTList);
    }
}
