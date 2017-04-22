package cn.edu.nuc1;

/**
 * Created by Administrator on 2017/4/21.
 */
public class Test {
    public static void main(String[] args) {

        Aggregate<Employee>mEmployeeAggregate=new AgreegateImp<>();
        mEmployeeAggregate.add(new Employee("yanghaodong",18,180,"nan"));
        mEmployeeAggregate.add(new Employee("yanghaodon",18,180,"nan"));
        mEmployeeAggregate.add(new Employee("yanghaodo",18,180,"nan"));
        Iterator mIterator=mEmployeeAggregate.iterator();
        while (mIterator.hasNext()){
            System.out.println(mIterator.next());
        }



    }

}
