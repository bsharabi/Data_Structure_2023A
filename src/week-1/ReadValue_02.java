package L01;

import java.util.Scanner;

public class ReadValue_02 {
    public static void main(String[] args) {

        String str;
        int num;
        float f_num;

        Scanner sc = new Scanner(System.in);

        System.out.println("Say somthing:");
        // `nextLine()' - a function that returns the input from the keyboard as a string
        str = sc.nextLine();
        System.out.println("Insert number:");
        // `nextInt()' - a function that returns the input from the keyboard as a Integer
        num = sc.nextInt();
        System.out.println("Insert number:");
        // `nextFloat()' - a function that returns the input from the keyboard as a Float
        f_num = sc.nextFloat();

        System.out.println("Your number is "+num);
        System.out.println("Your number is "+f_num);
        System.out.println("you said: "+str);


    }
}
