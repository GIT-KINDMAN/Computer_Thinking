import java.util.*;

public class sweaCT1 {

    /*
       private int[] fill52() {
           int[] array = new int[10];
           for (int i = 0; i < 10; i++)
               array[i] = i + 1;
           return array;
       }
   */
    public static int combi(int n, int r){
        if(r==0 || r==n)
            return 1;
        else
            return combi(n-1, r-1) + combi(n-1, r);
    }


    public static void main(String[] args) {

        // sweaCT sc = new sweaCT();
        // int[] arr = sc.fill52();

        // int z = ;

        int a = combi(52,5);

        System.out.println(a);

    }
}
