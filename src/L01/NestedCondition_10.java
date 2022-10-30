package L01;

public class NestedCondition_10 {
    public static void main(String[] args) {
        int age = 7;
        boolean IsWinePerson = false;

        if (age < 0 || age > 120) {
            // "age" < 0   OR  "age" > 120
            System.out.println("Invalid age!!!!");
        } else if (age < 25) {
            // "age" >= 0   AND   "age" < 25
            System.out.println("You can only drink soft drink");
        } else {
            // "age" >= 25   AND   "age" <= 120

            //------------nested condition-(תנאי בתוך תנאי)------------
            if (IsWinePerson) {
                System.out.println("You can drink wine!!!");
            } else {
                System.out.println("You can drink beer");
            }
        }
    }
}
