/**
 * Created by Administrator on 2017/4/19.
 */
public class Car {
    private String name;
    private int seat;
    private double money;
    private String color;

    public Car(Builder mBuilder) {
        name=mBuilder.name;
        seat=mBuilder.seat;
        money=mBuilder.money;
        color=mBuilder.color;
    }

    @Override
    public String toString() {
        return name+seat+money+color;
    }

    public static class Builder{
        private String name;
        private int seat;
        private double money;
        private String color;

        public Builder setName(String mName){
            this.name=mName;
            return this;
        }

        public Builder setSeat(){
            this.seat=4;
            return this;
        }

        public Builder setMoney(double mMoney){
            this.money=mMoney;
            return this;
        }

        public Builder setColor(String mColor){
            this.color=mColor;
            return  this;
        }

        public Car build(){
            return  new Car(this);
        }

    }
}
