//package TestExample;
//
//import org.junit.jupiter.api.Test;
//
//import java.util.Random;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class NumbersFunctionTest {
//
//    Random rd = new Random();
//
//    @Test
//    void Test_sum() {
//        for (int i = 0; i < 20; i++) {
//            double a= rd.nextDouble();
//            double b = rd.nextDouble();
//        assertEquals(NumbersFunction.sum(a,b), (a+b));
//        }
//    }
//
//    @Test
//    void Test_mul() {
//        for (int i = 0; i < 20; i++) {
//            double a= rd.nextDouble();
//            double b = rd.nextDouble();
//            assertEquals(NumbersFunction.mul(a,b),a*b);
//        }
//    }
//
//    @Test
//    void Test_div() {
//        for (int i = 0; i < 20; i++) {
//            double a= rd.nextDouble();
//            double b = rd.nextDouble();
//            assertEquals(NumbersFunction.div(a,b),a/b);
//        }
//    }
//
//    @Test
//    void Test_diff() {
//        for (int i = 0; i < 20; i++) {
//            double a= rd.nextDouble();
//            double b = rd.nextDouble();
//            assertEquals(NumbersFunction.diff(a,b),a-b);
//        }
//    }
//
//    @Test
//    void Test_max() {
//        for (int i = 0; i < 20; i++) {
//            double a= rd.nextDouble();
//            double b = rd.nextDouble();
//            assertEquals(NumbersFunction.max(a,b),Math.max(a,b));
//        }
//    }
//
//    @Test
//    void Test_min() {
//        for (int i = 0; i < 20; i++) {
//            double a= rd.nextDouble();
//            double b = rd.nextDouble();
//            assertEquals(NumbersFunction.min(a,b),Math.min(a,b));
//        }
//    }
//    @Test
//    void Test_pow() {
//        for (int i = 0; i < 20; i++) {
//            int a= rd.nextInt(20)+1;
//            int b = rd.nextInt(4)+1;
//            assertEquals(NumbersFunction.pow(3,3),(int)Math.pow(3,3));
//        }
//    }
//}