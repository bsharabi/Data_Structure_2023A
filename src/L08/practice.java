package L08;
import java.util.Stack;

public class practice {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(6);
        st.push(12);
        st.push(2);
        st.push(10);
        st.push(7);
        st.push(5);

        System.out.println(st);

        sortByAvg(st);

        System.out.println(st);

        Stack<Integer> st1 = new Stack<>();

        int[] arr = {7, 22, 10, 12, 21, 25, 4, 13, 14, 3, 18};
        for (int i = 0; i < arr.length; i++) {
            st1.push(arr[i]);
        }

        System.out.println(st1);
      boolean ans2=  equalsSum(st1);
        System.out.println(ans2);

    }

    //O(n)
    private static void sortByAvg(Stack<Integer> st) {
        if (st == null) //O(1)
            return;

        Stack<Integer> belowAvg = new Stack<>();//O(1)
        Stack<Integer> aboveAvg = new Stack<>();//O(1)

        int sum = 0;//O(1)
        int size = 0;//O(1)
        int currentItem = 0;//O(1)

        Stack<Integer> temp = new Stack<>();//O(1)

        //O(n)
        while (!st.empty()) {
            currentItem = st.pop();
            sum += currentItem;
            temp.push(currentItem);
            size++;
        }

        double avg = (double) sum / size;//O(1)

        //O(n)
        while (!temp.empty()) {
            currentItem = temp.pop();
            if (currentItem < avg)
                belowAvg.push(currentItem);
            else
                aboveAvg.push(currentItem);
        }

        //O(n)
        while (!belowAvg.empty())
            st.push(belowAvg.pop());
        //O(n)
        while (!aboveAvg.empty())
            st.push(aboveAvg.pop());

    }

    //O(n)
    private static boolean equalsSum(Stack<Integer> st) {
        if (st == null)//O(1)
            return false;

        int size=0;//O(1)
        Stack<Integer> copy = new Stack<>();//O(1)
        Stack<Integer> temp = new Stack<>();//O(1)

        while(!st.empty()){//O(n)
            temp.push(st.pop());
            size++;
        }
        while(!temp.empty()){//O(n)
            int currentItem = temp.pop();
            st.push(currentItem);
            copy.push(currentItem);
        }

        if(size%2==0)//O(1)
            return false;


        int middleIndex= size/2;
        while(middleIndex!=0) {//O(n)
            temp.push(copy.pop());
            middleIndex--;
        }


        int middle= copy.pop();

        while (!copy.empty())//O(n)
        {
            if(copy.pop()+temp.pop()!=middle)
                return false;
        }

        return true;
    }
}