package app;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {
        // Create Alphabet
        int n = 'z'-'a'+1;
        int start = 'a';
        int end = 'z';
        int k=0;
        char [] ascii_alphabet =new char[26];
        for (int i = start; i <= end; i++) {
            char c = (char)(i);
            ascii_alphabet[k] = c;
            k++;
        }
        System.out.println(Arrays.toString(ascii_alphabet));
    }
}
