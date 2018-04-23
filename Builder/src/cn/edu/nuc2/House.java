package cn.edu.nuc2;

/**
 * Created by Administrator on 2018/4/22.
 */
public class House {
    private String name;
    private double height;
    private int num;
    private String location;

    public House(Builder builder) {
        this.name = builder.name;
        this.height = builder.height;
        this.num = builder.num;
        this.location = builder.location;
    }

    @Override
    public String toString() {
        return "这个房子的名字是"+name+
                "\n这个房子有多高"+height+
                "\n这个房子里面有多少人"+num+
                "\n这个房子的位置是"+location;
    }

    public static class Builder {
        private String name;
        private double height;
        private int num;
        private String location;

        public House build(){
            return new House(this);
        }
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setHeight(double height) {
            this.height = height;
            return this;
        }

        public Builder setNum(int num) {
            this.num = num;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = location;
            return this;
        }
    }
}
