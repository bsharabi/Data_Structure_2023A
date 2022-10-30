package L01;

public class JuggedArray_08 {
    public static void main(String[] args) {

        String[][] childrenMatrix = new String[2][];

        childrenMatrix[0] = new String[] { "Naor", "Gil" };
        childrenMatrix[1] = new String[] { "Bob", "Alice", "Tom" };

        String[][] childrenMatrix2={new String[] { "Naor", "Gil" },new String[] { "Bob", "Alice", "Tom" }};
        for (String[] matrixItem : childrenMatrix)
        {
            System.out.println("This parent has the following children");
            for (String arrItem : matrixItem)
            {
                System.out.printf(arrItem+" ");
            }

            System.out.println();
        }
    }
}
