package L03;

import java.util.Random;

public class complexity {
    public static void main(String[] args) {
        Random rd = new Random();
        int n;
        System.out.println("---------------------Q01-----------------------");
        int i = 0;
        if (i == 0)
            System.out.println("Hello");
        for (int j = 0; j < 10; j++) {
            System.out.println(j);
        }
        System.out.println("---------------------Q02-----------------------");
        n = rd.nextInt(100);
        //O(n)
        //1+n+n+2n =4n+2
        // 1+1+2+1+1+2+1+1+2+1+1+2+1+1+2+1+1+2+1+1+2
        for (int j = 0; j < n; j++) {
            System.out.print("Hello ");
            System.out.println("World");
        }
        System.out.println("---------------------Q03-----------------------");
        n = 100;
        int x = n * n;
        int y = n;
        //O()
        //x=100*100=10,000
        //y=100;
        //1+2+1+2
        while (x > y) {
            x -= 100;
            y += 20;
        }
        System.out.println("---------------------Q04-----------------------");
        for (int j = 0; j < n; j *= 2) {
            for (int k = j; k < n; k++) {
                System.out.println("Hello iter " + k);
            }
        }
        System.out.println("---------------------Q05-----------------------");
        for (int j = 0; j < n; j *= 2) {
            for (int k = j; k < n; k *= 2) {
                System.out.println("Hello iter " + k);
            }
        }
        System.out.println("---------------------Q06-----------------------");
        for (int j = 0; j < n; j += 2) {
            for (int k = j; k < n; k += 3) {
                System.out.println("Hello iter " + k);
            }
        }
        System.out.println("---------------------Q07-----------------------");
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n - j; k += 3) {
                System.out.println("Hello iter " + k);
            }
        }
        System.out.println("---------------------Q08-----------------------");
        for (int j = 0; j < n; j *= 2) {
            System.out.println("Hello");
        }

    }
}
