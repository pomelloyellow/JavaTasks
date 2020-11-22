package com.company;

import java.util.Arrays;

public class SecondClass {
    //Task 2.1
    public static void repeat(String word, int iterations)
    {
        StringBuilder newWord = new StringBuilder();
        for(int i = 0; i < word.length(); i++)
            for (int j = 0; j < iterations; j++) newWord.append(word.charAt(i));
        System.out.println(word+", "+iterations+" -> "+newWord);
    }
    //Task 2.2
    public static void differenceMaxMin(int[] Array)
    {
        int Max = Array[0];
        int Min = Array[0];
        for(int i = 0; i < Array.length; i++)
        {
            if (Array[i] > Max) Max = Array[i];
            else if (Array[i] < Min) Min = Array[i];
           /* if (Array[i] > Max) Max = Array[i];
            if (Array[i] < Min) Min = Array[i];*/
        }
        System.out.println("Max = "+Max+", Min = "+Min+", difference = "+(Max-Min));
    }
    //Task 2.3
    public static void isAvgWhole(int[] Array)
    {
        int sumArr = 0;
        for (int i = 0; i < Array.length;i++) sumArr += Array[i];
        if(sumArr%Array.length == 0) System.out.println(true);
        else System.out.println(false);
    }
    //Task 2.4
    public static void cumulativeSum(int[] Array)
    {
        int[] newArr = new int[Array.length];
        for(int m = 0; m < Array.length; m++) newArr[m] = Array[m];
        for (int i = 1; i < Array.length;i++)
            for(int j = 1; j<=i; j++) newArr[i] = Array[j]+newArr[j-1];
        System.out.println(Arrays.toString(Array)+" -> "+Arrays.toString(newArr));
    }
    //Task 2.5
}
