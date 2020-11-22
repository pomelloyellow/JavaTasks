package com.company;

public class FirstClass {
    //Task 1
    public static void remainder(int dividend, int divider) {
        System.out.println(dividend + " Mod " + divider + " = " + dividend % divider);
    }

    //Task 2
    public static void triArea(int base, int height) {
        System.out.println("Base = " + base + ", height = " + height + ", Area = " + base * height / 2);
    }

    //Task 3
    public static void animals(int chickens, int cows, int pigs) {
        System.out.println("chickens = " + chickens + ", cows = " + cows + ", pigs = " + pigs + ", foot = " + (chickens * 2 + cows * 4 + pigs * 4));
    }

    //Task 4
    public static void profitableGamble(double prob, int prize, int pay) {
        boolean tf;
        if (prob * prize > pay) tf = true;
        else tf = false;
        System.out.println("prob = " + prob + ", prize = " + prize + ", pay = " + pay + " -> " + tf);
    }

    //Task 5
    public static void operation(int N, int a, int b) {
        if (a + b == N) System.out.println("N = " + N + ", a = " + a + ", b = " + b + " -> added");
        else if (a - b == N) System.out.println("N = " + N + ", a = " + a + ", b = " + b + " -> subtracted");
        else if (a / b == N) System.out.println("N = " + N + ", a = " + a + ", b = " + b + " -> divided");
        else if (a * b == N) System.out.println("N = " + N + ", a = " + a + ", b = " + b + " -> multiplied");
        else System.out.println("N = " + N + ", a = " + a + ", b = " + b + " -> none");
    }

    //Task 6
    public static void ctoa(char symbol) {
        System.out.println("'" + symbol + "' -> " + (int) symbol);
    }

    //Task 7
    public static void addUpTo(int number) {
        int progr = 0;
        for (int i = 1; i <= number; i++) progr = progr + i;
        System.out.println("number = " + number + ", progression = " + progr);
    }

    public static void nextEdge(int Edge1, int Edge2)
    {
        System.out.println("Edge 1 = "+Edge1+", Edge 2 = "+Edge2+", Edge 3 ="+(Edge1+Edge2-1));
    }

    public static void sumOfCubes(int[] Array1)
    {

        int length = Array1.length;
        int sum = 0;
        for(int i = 0; i < length; i++) sum = sum+Array1[i]*Array1[i]*Array1[i];
        System.out.println(sum);
    }

    public static void abcmath(int a, int b, int c)
    {
        int sum = a;
        boolean divc;
        for(int i = 0; i<b; i++) sum = sum + sum;
        if(sum%c == 0) divc = true;
        else divc = false;
        System.out.println("a = "+a+", b = "+b+", c = "+c+", sum = "+sum+" -> "+divc);

    }
}
