package com.company;

public class ThirdClass {
    //Task 3.1
    public static void solutions(int a, int b, int c)
    {
        if ((b*b - 4*a*c) > 0) System.out.println(a+", "+b+", "+c+" -> "+2);
        else if ((b*b - 4*a*c) == 0) System.out.println(a+", "+b+", "+c+" -> "+1);
        else  System.out.println(a+", "+b+", "+c+" -> "+0);
    }
}
