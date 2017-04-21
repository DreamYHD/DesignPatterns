package eg;

/**
 * Created by Administrator on 2017/4/21.
 */
public class Employee {
    private String name;

    private int age;

    private double height;

    private String sex;

    public Employee(String mName, int mAge, double mHeight, String mSex) {
        name = mName;
        age = mAge;
        height = mHeight;
        sex = mSex;
    }

    public String getName() {
        return name;
    }

    public void setName(String mName) {
        name = mName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int mAge) {
        age = mAge;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double mHeight) {
        height = mHeight;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String mSex) {
        sex = mSex;
    }

    @Override
    public String toString() {
        return "Employer"+"name:"+this.name+"height"+this.height+"sex"+this.sex+"age"+this.age;
    }
}
