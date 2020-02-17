package app;

import java.util.Arrays;
import java.util.Random;

public class randomString {
   // public String generateString(int length)
    //{

   // }

    public static void main(String[] args) {

        // Creating

        StringBuilder stringBuildervowel = new StringBuilder();
        StringBuilder stringBuilder = new StringBuilder();

        int [] ascii_nums = new Random().ints(26,97,122).toArray();

        System.out.println(Arrays.toString(ascii_nums));

        String string = null;

        // Process

        for (int i = 0; i < ascii_nums.length ; i++) {
            char c = (char) (ascii_nums[i]);
            if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
            stringBuildervowel.append(c); }
            else stringBuilder.append(c);
        }

        //Printing

        System.out.println(stringBuildervowel);
        System.out.println(stringBuilder);
    }
}
