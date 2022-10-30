package L01;


public class Conditions_09 {


    public static void main(String[] args) {
        boolean flag = true;
        int num = 7;


        //----------------------אופציה 1 לשימוש בתנאים - עם משתנה בוליאני----------------------------

        //true כאשר נשתמש בטיפוס בוליאני אין צורך להשוותו לערך
        //true כי בצורה דיפולטיבית המשתנה נבדק האם הוא מכיל בתוכו
        if (flag) {
            //if "flag" contains "true"
            System.out.println("flag is true");

        } else {
            //if "flag" contains "false"
            System.out.println("flag is false!");
        }

        // (!flag) is equal to (flag==false)
        if (!flag) {
            //if "flag" contains "false"
            System.out.println("flag is false");
        } else {
            //if "flag" contains "true"
            System.out.println("flag is true");
        }



        //----------------------אופציה 2 לשימוש בתנאים - עם ביטוי שמחזיר ערך בוליאני----------------------------
        if (num < 8) {
            //if num<8
            System.out.println("num " + num + " is lt 8");

        } else {
            //if num is not smaller than 8
            System.out.println("num " + num + " is gt 8");
        }


        //--------------------- (true / false) אופציה 3 לשימוש בתנאים - עם ערך בוליאני ישיר----------------------------
        if (true) {
            System.out.println("I am true");

        } else {
            System.out.println("I am false");
        }
    }
}
