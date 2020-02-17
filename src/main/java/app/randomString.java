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
        StringBuilder stringBuilderconsonants = new StringBuilder();
        StringBuilder stringBuilderAll = new StringBuilder();

        final String VOW = "AEIOUaeiou";

        int [] ascii_nums = new Random().ints(52,65,122).toArray();


        System.out.println(Arrays.toString(ascii_nums));

        String string = null;

        // Process

        for (int i = 0; i < ascii_nums.length ; i++) {
            char c = (char) (ascii_nums[i]);
            if (VOW.contains(String.valueOf(c))) {
            stringBuildervowel.append(c); }
            else if (ascii_nums[i]<91 || ascii_nums[i]>96) stringBuilderAll.append(c);

        }

        //Printing
        System.out.println(stringBuilderAll.toString());
        System.out.println(stringBuildervowel.toString());
        System.out.println(stringBuilderconsonants.toString());
    }
}
