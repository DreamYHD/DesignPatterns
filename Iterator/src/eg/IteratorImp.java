package eg;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/4/21.
 */
public class IteratorImp<T> implements Iterator<T> {
    private List<T>mEmployees=new ArrayList<>();
    private int index=0;

    public IteratorImp(List<T> mEmployees) {
        this.mEmployees = mEmployees;
    }

    @Override
    public boolean hasNext() {
        return !(index>mEmployees.size()-1||mEmployees.get(index)==null);
    }

    @Override
    public T next() {
        return mEmployees.get(index++);
    }
}
