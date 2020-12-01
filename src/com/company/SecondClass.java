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
    public static void getDecimalPlaces(String strnum)
    {
        char[] charnum = strnum.toCharArray();
        for (int i = 0; i < charnum.length; i++)
        {
            int afterpoint = 0;
            if(charnum[i] == '.')
            {
                for (int j = i+1; j < charnum.length; j++) afterpoint++;
                System.out.println("num is "+strnum+", numbers after point - "+afterpoint);
            }
        }
    }
    //Task 2.6
    public static void Fibonacci(int num)
    {
        int fibnum = 0;
        for (int i = 0; i<num; i++) fibnum +=i;
        System.out.println("number is "+num+", fibonacci number is "+fibnum);
    }
    //Task 2.7
    public static void isValid(String strnum)
    {
        char[] charnum = strnum.toCharArray();
        if (charnum.length != 5)
        {
            System.out.println("number "+strnum+" is not valid.");
            return;
        }
        for(int i = 0; i<charnum.length; i++)
        {
            if ( ( (int)charnum[i] > 57 )||( (int)charnum[i] < 48 ) )
            {
                System.out.println("number "+strnum+" is not valid.");
                return;
            } else if(i >= charnum.length-1) System.out.println("number "+strnum+" is  valid.");
        }
    }
    //Task 2.8
    public static void isStrangePair(String str1, String str2)
    {
        if (((str1 == "")&&(str1 ==""))||( (str1 == " ")&&(str2 == " ") ))
        {
            System.out.println(str1+" "+str2+" -> "+true);
            return;
        }
        char[] chastr1 = str1.toCharArray();
        char[] chastr2 = str2.toCharArray();
        if ( ( ( chastr1[0] == chastr2[chastr2.length-1] )&&( chastr1[chastr1.length-1] == chastr2[0] ) )/*||((str1 == " ")&&(str2 ==  " ")   )*/ )
            System.out.println(str1+" "+str2+" -> "+true);
        else System.out.println(str1+" "+str2+" -> "+false);
    }
    //Task 2.9
    public static void isPrefix(String word, String prefix)
    {
        char[] wordchar = word.toCharArray();
        char[] prefixchar = prefix.toCharArray();
        String newstrpref = "";
        String newstrpref1 = "";
        for(int i = 0; i<prefixchar.length; i++)
        {
            newstrpref = newstrpref + Character.toString(wordchar[i]);
            newstrpref1 = newstrpref1 + Character.toString(prefixchar[i]);
        }
        if ((prefix == "")||(prefix == " "))
        {
            System.out.println(word+" "+prefix+" -> "+false);
            return;
        }
        System.out.println(word+" "+prefix+" -> "+(newstrpref.equals(newstrpref1)));
    }
}
