package L01;

import java.text.MessageFormat;
import java.util.Date;

public class MyFirstProj_00 {

    public static void main(String[] args) {

        String str = "Bob";
        int mis1 = 1;
        float mis2 = (float) 1.2;
        double mis3 = 4.3;
        Date d = new Date();

        //This is the function that runs when we start the project
        //sout + press tab
        System.out.println("Hello world");

        //souf + press tab
        System.out.printf("Hello %s\n", str);

        System.out.printf("My number is: %d %n", mis1);

        System.out.printf("My number is: %.2f \n", mis2);

        System.out.printf("My number is: %.4f \n", mis3);

        System.out.printf("My number is: %c \n", 'C');

        System.out.printf("My number is: %tT \n", d);

        System.out.printf("hours %tH: minutes %tM: seconds %tS%n", d, d, d);

        System.out.printf("%1$tA, %1$tB %1$tY %n", d);

        System.out.println(MessageFormat.format("mis1= {0}, mis2= {0}",mis1,mis2));


      /*
                %c character
                %d decimal (integer) number(base 10)
                % e exponential floating -point number
                % f floating - point number
                % i integer(base 10)
                % o octal number (base 8)
                %s String
                %u unsigned decimal(integer) number
                % x number in hexadecimal(base 16)
                % t formats date/time
                %%print a percent sign
                \%print a percent sign
*/
    }

}
