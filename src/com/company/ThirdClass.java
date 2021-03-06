package com.company;

import java.util.Arrays;

public class ThirdClass {
    //Task 3.1
    public static void solutions(int a, int b, int c)
    {
        if ((b*b - 4*a*c) > 0) System.out.println(a+", "+b+", "+c+" -> "+2);
        else if ((b*b - 4*a*c) == 0) System.out.println(a+", "+b+", "+c+" -> "+1);
        else  System.out.println(a+", "+b+", "+c+" -> "+0);
    }
    // Task 3.2
    public static void findZip(String str)
    {
        String zipstring = new String("zip");
        if (str.indexOf(zipstring) > -1) {
            String substr = str.substring(str.indexOf(zipstring) + zipstring.length());
            if (substr.indexOf(zipstring) > -1) {
                System.out.println(str + " - second zip: " + (Integer.valueOf(str.indexOf(zipstring)) + Integer.valueOf(substr.indexOf(zipstring)) + zipstring.length()));
            } else System.out.println(str + " - non second zip: "+substr.indexOf(zipstring) );
        } else System.out.println(str + " - non first zip: "+str.indexOf(zipstring) );
    }
    // Task 3.3
    public static void checkPerfect(int num)
    {
        int pernum = 0;
        String strpernum = "0";
        for (int i = 1; i <= num; i++)
        {
            pernum+=i;
            strpernum = strpernum+"+"+Integer.toString(pernum);
            if (pernum == num)
            {
                System.out.println(strpernum+" -> "+num+" is perfect number");
                return;
            } else if (pernum > num)
            {
                System.out.println(strpernum+" -> "+num+" is not perfect number");
                return;
            }
        }
    }
    // Task 3.4
    public static void flipEndChars (String str)
    {
            char[] chastr = str.toCharArray();
            char symbol = chastr[0];
            if(str.length() < 2)
            {
                System.out.println(str+" -> Incompatible.");
                return;
            }
            else if (chastr[0] == chastr[chastr.length-1])
            {
                System.out.println(str+" -> Two's a pair.");
                return;
            }
            else if(chastr[0] != chastr[chastr.length-1])
            {
                chastr[0] = chastr[chastr.length-1];
                chastr[chastr.length-1] = symbol;
                System.out.println(str+" -> "+String.valueOf(chastr));
            }
    }
    //Task 3.5
    public static void isValidHexCode(String str)
    {
        char[] chastr = str.toCharArray();
        if (chastr[0] != '#')
        {
            System.out.println(str+" -> "+"Missing #");
            return;
        }
        if (chastr.length != 7)
        {
            System.out.println(str+" -> "+"Length exceeds 6");
            return;
        }
        for(int i = 1; i < chastr.length; i++)
        {
            if( ((int)chastr[i] < 48)||(((int)chastr[i] > 57)&&((int)chastr[i] < 65))||(((int)chastr[i] > 70)&&((int)chastr[i] < 97))||((int)chastr[i] > 102))
            {
                System.out.println(str+" -> Contains unacceptable character");
                return;
            }
        }
        System.out.println(str+" -> is valid hex code");
    }
    //Task 3.6
    public static void same(int[] arr1, int[] arr2)
    {
        int count2 = 0;
        int count1 = 0;
        boolean tf;
        for (int i = 0; i < arr1.length; i++)
        {
                for (int j = i + 1; j < arr1.length; j++) {
                    if (arr1[i] == arr1[j])
                    {
                        count1++;
                        break;
                    }

                }
        }
        int result1 = arr1.length - count1;
        for (int i = 0; i < arr2.length; i++)
        {
            for (int j = i + 1; j < arr2.length; j++) {
                if (arr2[i] == arr2[j])
                {
                    count2++;
                    break;
                }
            }
        }
        int result2 = arr2.length - count2;
        if (result1 == result2) tf = true;
        else tf = false;
        System.out.println(Arrays.toString(arr1)+" - "+result1+" unical symbol, "+Arrays.toString(arr2)+" - "+result2
                +" unical symbol -> "+tf);
    }
    //Task 3.7
    public static void isKaprekar(Integer num)
    {
        Integer numsq = num*num;
        String strnumsq = numsq.toString();
        if (strnumsq.length() == 1)
        {
            System.out.println(num+" -> "+numsq+" -> "+0+" + "+numsq+" = "+numsq+" -> "+numsq.equals(num));
            return;
        }
        String strnumsq1 = strnumsq.substring(0,(strnumsq.length())/2);
        String strnumsq2 = strnumsq.substring((strnumsq.length())/2);
        Integer result = Integer.parseInt(strnumsq1) + Integer.parseInt(strnumsq2 );
        System.out.println(num+" -> "+numsq+" -> "+strnumsq1+" + "+strnumsq2+" = "+result+" -> "+result.equals(num));
    }
    //Task 3.8
    public static void longestZero(String num)
    {
        char[] charnum = num.toCharArray();
        String strzero = "";
        int zero = 0;
        int longestzero = 0;
        for (int i = 0; i < charnum.length; i++)
        {
            if (charnum[i] == '0') zero++;
            else if (longestzero < zero)
            {
                longestzero = zero;
                zero = 0;
            }
        }
        for (int j = 0; j < longestzero; j++) strzero = strzero+ "0";
        System.out.println(num+" -> "+strzero);
    }

    //Task 3.9
    public static int nextPrime(int num)
    {
        for (int i = 2; i<num; i++) if (num % i == 0) return nextPrime(num+1);
        return num;
    }

    //Task 3.10
    public static void rightTriangle(int a, int b, int c)
    {
        if ((a*a+b*b) == c*c) System.out.println("a = "+a+", b = "+b+", c = "+c+" -> "+
                "a, b - sides of a right triangle");
        else if ((a*a+c*c) == b*b) System.out.println("a = "+a+", b = "+b+", c = "+c+" -> "+
                "a, c - sides of a right triangle");
        else if ((b*b+c*c) == a*a) System.out.println("a = "+a+", b = "+b+", c = "+c+" -> "+
                "b, c - sides of a right triangle");
        else System.out.println("a = "+a+", b = "+b+", c = "+c+" -> is not sides of a right triangle");
    }
}
