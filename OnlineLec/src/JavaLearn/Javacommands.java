package JavaLearn;

import java.util.Arrays;
import java.util.Scanner;

public class Javacommands {
	
	public static void main(String[] args) {
		
			// 1. PRIMITIVE TYPE (simple)
		
		/* byte - 1 [-128 to 127]		eg:	byte age = 30;
		*  short - 2						int phone = 1234567890;
		*  int - 4 (1,2,3)					long phone = 12345678900L;
		*  long - 8							float pi = 3.14F;
		*  float - 4 (3.14)					char letter = '@';
		*  double - 8						boolean isAdult = true;
		*  char - 2 (a,b,c,d)
		*  boolean - 1 (true/false)
		*/
		//HelloWorld
		System.out.println("Hello World");
		
		//Strings
		String name = "Apu";
		System.out.println(name.length());
		
		//concatenate
		String name1 = "Aman";
		String name2 = "Akku";
		String name3 = name1 +" and "+ name2;
		System.out.println(name3);
		
		//charAt
		System.out.println(name.charAt(1));
		
		//length
		System.out.println(name.length());
		
		//replace
		String name4 = name1.replace('a', 'b');
		System.out.println(name4);
		
		//substring
		System.out.println(name3.substring(0,4));
		
		//Arrays
		int[] marks = new int[3];
		marks[0] = 97;
		marks[1] = 98;
		marks[2] = 95;
		System.out.println(marks[0]);
		
		//lengths
		System.out.println(marks.length);
		
		//sort
		Arrays.sort(marks);
		System.out.println(marks[0]);
	
		//2D Arrays
		int[][] finalmarks = {{97, 98, 95}, {95, 95, 98}};
		System.out.println(finalmarks[0][1]);
		
		//casting
		// 1. Implicit casting (small to big size)
		int p = 100;
		double fp = p + 18.0;
		System.out.println(fp);
		
		// 2. Explicit casting (big to small size)
		double price = 100.5;
		int finalprice = (int)price + (int)18.5;
		System.out.println(finalprice);
		
		//constants
		final float PI = 3.14F;
		System.out.println(PI);
		
		//Operators
		//1. Arithmetic Operators ( + - * / % )
		int a = 4;
		int b = 2;
		int sum = a+b;
		System.out.println(sum);
		
		//2. Assignment Operators ( = ++ -- )
		int numb = 1;
		System.out.println(numb);
		System.out.println(numb++);		//+1 in next output
		System.out.println(numb--);
		System.out.println(++numb);		//+1 in current output
		System.out.println(--numb);
		
		//3. Comparison Operators ( == != < > <= >= )
		// conditional statement ( if - else )
		boolean isSunUp = true;
		if (isSunUp == true)
			System.out.println("day");
		else
			System.out.println("night");
		
		int age = 30;
		if (age >= 18)
			System.out.println("Adult");
		else
			System.out.println("Minor");
		
		//4. Logical Operators ( && || ! )	[ &&-and, ||-or, !-not] type of gates
		int c = 60;
		int d = 40;
		
		if (c < 50 && d < 50)								//&&
			System.out.println("both less than 50");
		else
			System.out.println("one greater than 50");
		
		if (c < 50 || d < 50)								//||
			System.out.println("one less than 50");
		else
			System.out.println("both greater than 50");
		
		boolean isAdult = false;
		if(!isAdult)										//!
			System.out.println("is Adult");
		else
			System.out.println("not Adult");
	
		//Math
		//1. Max
		System.out.println(Math.max(5,6));
		
		//2. Min
		System.out.println(Math.min(5, 6));
		
		//3. random (print random values from 0 to 99)
		System.out.println((int)(Math.random()*100));
		
		//Input Commands
		//Scanner
		Scanner sc = new Scanner(System.in);			//age
		System.out.println("Input Your Birth Year: ");
		int year = sc.nextInt();
		System.out.println(year);
		
		Scanner scn = new Scanner(System.in);			//name
		System.out.println("Input Your Name: ");
		String name5 = sc.next();
		System.out.println(name5);
		
		Scanner scr = new Scanner(System.in);			//pen 10 notebook 40
		System.out.println("Enter your Cash:");
		
		int cash = scr.nextInt();
		if(cash<10) 
			System.out.println("Need more cash");
		
		else if(cash>=10 && cash<40)
			System.out.println("Can buy one thing");
		
		else
			System.out.println("Can buy both");
		
		// conditional statement-Switch
		int day = 1;
		
		switch(day) { 
		case 1 :
			System.out.println("Monday");
			break;
		case 2 :
			System.out.println("Tuesday");
			break;
		case 3 :
			System.out.println("Wednesday");
			break;
		case 4 :
			System.out.println("Thursday");
			break;
		case 5 :
			System.out.println("Friday");
			break;
		default:
			System.out.println("Weekend");
		}
		
		//Loops
		//1. for loop
		for (int i = 1; i <=100; i++)			//1-100
			System.out.println(i);
				
		for (int i = 100; i >=1; i--) 			//100-1
			System.out.println(i);
		
		//2. while loop
		int i = 100;
		while (i >=1) {
			System.out.println(i);
		i=i-1;
		}
		
		//3.do-while loop
		int j = 100;
		do {
			System.out.println(j);
			j = j-1;
		} while(j>=1);
		
		Scanner scan = new Scanner (System.in);
		int number = 0;
		do {
			System.out.println("input a number");
			number = sc.nextInt();
			System.out.print("here's your number: ");
			System.out.println(number);
		} while (number >=0);
		
		System.out.println("THE END");
		
		//Continue and Break
		int k = 0;
		while (true) {
			if (k==3) {
				k = k+1;
				continue;
			}
			System.out.println(k);
			k = k+1;
			if (k > 5) {
				break;
			}
		}
		
		//Try - Catch Exception Handling
		int [] marksheet = {97,98,95};
		try {
			System.out.println(marksheet[5]);
		} catch (Exception except) {
			System.out.println("Error");
		}
		System.out.println("The name is Aman");
		
		//Methods - Functions
		
		printJava();
		printName("Aman");
		printName("Akku");
		printSum(1,6);
	}
		public static void printJava() {				//class for above commands
			System.out.println("Hello Java");
		}
		
		public static void printName(String name) {
			System.out.println(name);
		}
		
		public static void printSum(int a,int b) {
			int sum = a + b;
			System.out.println(sum);
		}
	}
