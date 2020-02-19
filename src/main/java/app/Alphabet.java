package app;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {
        // Create Alphabet
        int start = 'a';
        int end = 'z';
      //  String [] ascii_alphabet =new String[26];
        for (int i=start; i<=end; i++) {
            char c = (char)(i);
            System.out.print(c);
        }

        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int second=1;
        int[] b = new int[5];
        for (int i = 0; i < 10; i=i+2) {
           b[i]=Math.max(a[i],a[second]);
            second=second+2;
        }
        System.out.println(Arrays.toString(b));



    }
}
