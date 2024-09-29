package com.Strings;

import java.util.Scanner;

public class StringAnagram {
    public static void main(String[] args) {
//        Check if strings are anagram
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String s1 : ");
        String s1 = sc.next();
        System.out.println("Enter String s2 : ");
        String s2 = sc.next();
//        char [] c1 = s1.toCharArray();
//        char [] c2 = s2.toCharArray();
        if(s1.length()==s2.length()) {
//            **************************************************
//            // counting logic (Fail)
//            int count = 0;
//            for (int i = 0; i < s1.length(); i++) {
//                for (int j = 0; j < s2.length(); j++) {
//                    if (s1.charAt(i) == s2.charAt(j)) {
//                        count++;
//                        break;
//                    }
//                }
//            }
//            if (count == s1.length())
//                System.out.println("The Strings are anagram");
//            else
//                System.out.println("Not anagram");
//         ******************************************************
            // ChatGPT logic of counting character
            int[] charCount = new int[256];
            for(int i=0; i<s1.length(); i++){
                charCount[s1.charAt(i)]++;
            }
            for(int i=0; i<s2.length(); i++){
                charCount[s2.charAt(i)]--;
            }
            boolean flag = true;
            for(int i =0; i<256; i++){
                if (charCount[i] != 0)
                    flag = false;
            }
            if (flag)
                System.out.println("String s1 : "+ s1 + " and String s2 : " + s2 + " are Anagram.");
            else
                System.out.println("String s1 : "+ s1 + " and String s2 : " + s2 + " are NOT Anagram.");
        }
        else
        {
            System.out.println("Not Anagram");
        }

    }
}
