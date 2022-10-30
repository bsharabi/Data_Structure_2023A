package L01.inheritance;

public class Food {

    private double price;
    private boolean IsVeg;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isVeg() {
        return IsVeg;
    }

    public void setVeg(boolean veg) {
        IsVeg = veg;
    }
}

class Pizza extends Food {

    private int numOfSlices;
    public int NumOfSlices;

    public int getNumOfSlices() {
        return numOfSlices;
    }
    public void setNumOfSlices(int numOfSlices) {
        this.numOfSlices = numOfSlices;
    }
}
class Main{
    public static void main(String[] args) {
        Pizza p = new Pizza();
        p.setVeg(true);
        p.NumOfSlices = 8;
        p.setPrice(90);


        System.out.println("our pizza has "+p.NumOfSlices+" slices and costs "+p.getPrice());

        System.out.println("the pizza is: " + ((p.isVeg()) ? "veg" : "non-veg"));
    }
}