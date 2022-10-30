package L01;

public class Loops_13 {
    public static void main(String[] args) {

        int limit = 4;
        System.out.println("-------------while------------------");
        int whileCounter = 0;
        while (whileCounter < limit) {
            System.out.println(whileCounter);
            whileCounter++;
        }


        System.out.println("------------do-while------------------");
        int doCounter = 0;
        do {
            System.out.println(doCounter);
            doCounter++;
        } while (doCounter < limit);


        System.out.println("-------------for------------------");
        for (int forCounter = 0; forCounter < limit; forCounter++) {
            System.out.println(forCounter);
        }
    }
}
