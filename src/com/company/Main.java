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
	FirstClass.ctoa(' ');
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
		//Task 2.5
		System.out.println("----Task 2.5---");
	SecondClass.getDecimalPlaces("20.43");
	SecondClass.getDecimalPlaces("0.1504");
	SecondClass.getDecimalPlaces("7.000");
		//Task 2.6
		System.out.println("----Task 2.6---");
	SecondClass.Fibonacci(3);
	SecondClass.Fibonacci(7);
	SecondClass.Fibonacci(12);
		//Task 2.7
		System.out.println("----Task 2.7---");
	SecondClass.isValid("12345");
	SecondClass.isValid("1234");
	SecondClass.isValid("123456");
	SecondClass.isValid("12e56");
	SecondClass.isValid("1 456");
		//Task 2.8
		System.out.println("----Task 2.8---");
	SecondClass.isStrangePair("ratio","orator");
	SecondClass.isStrangePair("bush","hubris");
	SecondClass.isStrangePair(" "," ");
	SecondClass.isStrangePair("","");
		//Task 2.9
		System.out.println("----Task 2.9---");
	SecondClass.isPrefix("automation", "auto");
	SecondClass.isPrefix("automation", "");
	SecondClass.isPrefix("automation", " ");
	SecondClass.isPrefix("automation", "autom");
	SecondClass.isSuffix("arachnophobia","phobia");
	SecondClass.isSuffix("vocation", "logy");
		//Task 2.10
		System.out.println("----Task 2.10--");
	SecondClass.boxSeq(0);
	SecondClass.boxSeq(1);
	SecondClass.boxSeq(2);
	SecondClass.boxSeq(3);
	SecondClass.boxSeq(4);
	SecondClass.boxSeq(5);
	SecondClass.boxSeq(6);
		//Task 3.1
		System.out.println("----Task 3.1---");
	ThirdClass.solutions(1,0,-1);
	ThirdClass.solutions(1,0,0);
	ThirdClass.solutions(1,0,1);
		//Task 3.2
		System.out.println("----Task 3.2---");
	ThirdClass.findZip("all zip files are zipped");
	ThirdClass.findZip("all zip files are compressed");
		//Task 3.3
		System.out.println("----Task 3.3---");
	ThirdClass.checkPerfect(28);
	ThirdClass.checkPerfect(6);
	ThirdClass.checkPerfect(496);
	ThirdClass.checkPerfect(12);
	ThirdClass.checkPerfect(97);
		//Task 3.4
		System.out.println("----Task 3.4---");
	ThirdClass.flipEndChars("Cat, dog, and mouse.");
	ThirdClass.flipEndChars("ada");
	ThirdClass.flipEndChars("adA");
	ThirdClass.flipEndChars("z");
		//Task 3.5
		System.out.println("----Task 3.5---");
	ThirdClass.isValidHexCode("#CD5C5C");
	ThirdClass.isValidHexCode("CD5C5C");
	ThirdClass.isValidHexCode("#CD5C5Cc");
	ThirdClass.isValidHexCode("#CD5z5C");
	ThirdClass.isValidHexCode("#CD5&5C");
		//Task 3.6
		System.out.println("----Task 3.6---");
	ThirdClass.same(new int[] {3, 2, 3, 3, 2, 1}, new int[] {1, 2, 3});
	ThirdClass.same(new int[] {9,8,7,6}, new int[] {4,4,3,1});
	ThirdClass.same(new int[] {2}, new int[] {3, 3, 3, 3, 3});
		//Task 3.7
		System.out.println("----Task 3.7---");
	ThirdClass.isKaprekar(3);
	ThirdClass.isKaprekar(1);
	ThirdClass.isKaprekar(5);
	ThirdClass.isKaprekar(297);
		//Task 3.8
		System.out.println("----Task 3.8---");
	ThirdClass.longestZero("111000101");
	ThirdClass.longestZero("01100001011000");
	ThirdClass.longestZero("11111");
		//Task 3.9
		System.out.println("----Task 3.9---");
	System.out.println(ThirdClass.nextPrime(12));
	System.out.println(ThirdClass.nextPrime(22));
	System.out.println(ThirdClass.nextPrime(30));
		//Task 3.10
		System.out.println("----Task 3.10---");
	ThirdClass.rightTriangle(3,4,5);
	ThirdClass.rightTriangle(145,105,100);
	ThirdClass.rightTriangle(70,130,110);

		//Task 4.1
		System.out.println("----Task 4.1---");
	System.out.println(FourthClass.BessiEssay(10, 7, "hello my name is Bessie and this is my essay"));
		//Task 4.2
		System.out.println("----Task 4.2---");
	System.out.println(FourthClass.split("((()))(())()()(()())"));
		//Task 4.3.1
		System.out.println("----Task 4.3.1---");
	System.out.println(FourthClass.toCamelCase("hello_edabit"));
		//Task 4.3.2
		System.out.println("----Task 4.3.2---");
	System.out.println(FourthClass.toSnakeCase("helloEdabit"));
		//Task 4.4
		System.out.println("----Task 4.4---");
	System.out.println(FourthClass.overTime(new double[] {9, 17, 30, 1.5}));
	System.out.println(FourthClass.overTime(new double[] {16, 18, 30, 1.8}));

		//Task 4.5
		System.out.println("----Task 4.5---");
	System.out.println(FourthClass.BMI("205 pounds", "73 inches"));
	System.out.println(FourthClass.BMI("55 kilos", "1.65 meters"));
	System.out.println(FourthClass.BMI("154 pounds", "2 meters"));

		//Task 4.6
		System.out.println("----Task 4.6---");
	System.out.println(FourthClass.bugger(39));
		//Task 4.7
		System.out.println("----Task 4.7---");
	System.out.println(FourthClass.toStarShorthand("abbccc"));
	System.out.println(FourthClass.toStarShorthand("77777geff"));
		//Task 4.8
		System.out.println("----Task 4.8---");
	System.out.println(FourthClass.doesRhyme("Sam I am!", "Green eggs and ham."));
	System.out.println(FourthClass.doesRhyme("and frequently do?", "you gotta move."));
		//Task 4.9
		System.out.println("----Task 4.9---");
	System.out.println(FourthClass.trouble(451999277,72289977));
		//Task 4.10
		System.out.println("----Task 4.10---");
	System.out.println(FourthClass.countUniqueBooks("AZYWABBCATTTA", 'A'));

	}



}
