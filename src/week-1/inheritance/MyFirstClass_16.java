package L01.inheritance;

import java.text.*;

//הגדרת תבנית שלא תופסת מקום בפועל בזיכרון
//אלא מאפשרת ליצור ממנה מופעים לפי הגדרתה
class Car {

    //-------------Properties--------------
    public int NumOfWheels;
    public long Price;

    //-------------Methods--------------
    public String GetDescription() {
        return MessageFormat.format("Car costs: {0}, and has {1} wheels", Price, NumOfWheels);
    }

    //------------Constructor------------
    public Car(int numOfWheels, long price) {
        NumOfWheels = numOfWheels;
        Price = price;
    }

    //------------polymorphism - Constructor------------
    public Car() {
    }

    ;

//------------- Getter + Setter --------------

    public int getNumOfWheels() {
        return NumOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        if (numOfWheels < 15 && numOfWheels >= 4)
            NumOfWheels = numOfWheels;
    }

    public long getPrice() {
        return Price;
    }

    public void setPrice(long price) {
        Price = price;
    }

}

public class MyFirstClass_16 {

    public static void main(String[] args) {

        //new Car() - this creates in the heap a new object of tha "Car" class
        //and the address of this object is stored to the "myCar1"
        Car myCar1 = new Car();
        myCar1.Price = 1000;
        myCar1.NumOfWheels = 4;

        System.out.println(MessageFormat.format("Car 1 costs: {0}, and has {1} wheels", myCar1.Price, myCar1.NumOfWheels));
        System.out.println(myCar1.GetDescription());

        //new Car() - this creates in the heap a new object of tha "Car" class
        //and the address of this object is stored to the "myCar2"
        Car myCar2 = new Car();
        myCar2.Price = 2000;
        myCar2.NumOfWheels = 5;

        System.out.println(MessageFormat.format("Car 1 costs: {0}, and has {1} wheels", myCar2.Price, myCar2.NumOfWheels));
        System.out.println(myCar2.GetDescription());

        if (new Car() instanceof Object)
            System.out.println("yes");
    }

}
