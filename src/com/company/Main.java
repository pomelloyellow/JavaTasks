package com.company;

public class Main {

    public static void main(String[] args) {
    	//Task 1.1
		System.out.println("----Task 1.1----");
	FirstClass.remainder(1, 2);
	FirstClass.remainder(3, 4);
	FirstClass.remainder(-9, 45);
	FirstClass.remainder(5, 5);
		//Task 1.2
		System.out.println("----Task 1.2----");
	FirstClass.triArea(3,2);
	FirstClass.triArea(7,4);
	FirstClass.triArea(10,10);
		//Task 1.3
		System.out.println("----Task 1.3----");
	FirstClass.animals(2,3,5);
	FirstClass.animals(1,2,3);
	FirstClass.animals(5,2,8);
		//Task 1.4
		System.out.println("----Task 1.4----");
	FirstClass.profitableGamble(0.2, 50, 9);
	FirstClass.profitableGamble(0.9, 1, 2);
	FirstClass.profitableGamble(0.9, 3, 2);
		//Task 1.5
		System.out.println("----Task 1.5----");
	FirstClass.operation(24,15,9);
	FirstClass.operation(24, 26, 2);
	FirstClass.operation(15, 11,11 );
	FirstClass.operation(6, 2, 3);
	FirstClass.operation(2, 14, 7);
		//Task 1.6
		System.out.println("----Task 1.6----");
	FirstClass.ctoa('A');
	FirstClass.ctoa('a');
	FirstClass.ctoa('m');
	FirstClass.ctoa('[');
	FirstClass.ctoa('\\');
		//Task 1.7
		System.out.println("----Task 1.7----");
	FirstClass.addUpTo(3);
	FirstClass.addUpTo(10);
	FirstClass.addUpTo(7);
		//Task 1.8
		System.out.println("----Task 1.8----");
	FirstClass.nextEdge(8,10);
	FirstClass.nextEdge(5,7);
	FirstClass.nextEdge(9,2);
		//Task 1.9
		System.out.println("----Task 1.9----");
	FirstClass.sumOfCubes(new int[] {1,5,9});
	    //Task 1.10
        System.out.println("----Task 1.10---");
    FirstClass.abcmath(42,5,10);
    FirstClass.abcmath(5,2,1);
    FirstClass.abcmath(1,2,3);
    	//Task 2.1
		System.out.println("----Task 2.1---");
	SecondClass.repeat("mice",5);
	SecondClass.repeat("hello",3);
	SecondClass.repeat("stop",1);
		//Task 2.2
		System.out.println("----Task 2.2---");
	SecondClass.differenceMaxMin(new int[] {-10, 7, 3, 14});
	SecondClass.differenceMaxMin(new int[] {10, 4, 1, 4, -10, -50, 32, 21});
	SecondClass.differenceMaxMin(new int[] {44, 32, 86, 19});
		//Task 2.3
		System.out.println("----Task 2.3---");
	SecondClass.isAvgWhole(new int[] {1,3});
	SecondClass.isAvgWhole(new int[] {1,2,3,4});
	SecondClass.isAvgWhole(new int[] {1,5,6});
	SecondClass.isAvgWhole(new int[] {1,1,1});
	SecondClass.isAvgWhole(new int[] {9,2,2,5});
		//Task 2.4
		System.out.println("----Task 2.4---");
	SecondClass.cumulativeSum(new int[] {1,2,3});
	SecondClass.cumulativeSum(new int[] {1, -2, 3});
	SecondClass.cumulativeSum(new int[] {3, 3, -2, 408, 3, 3});
    }
}