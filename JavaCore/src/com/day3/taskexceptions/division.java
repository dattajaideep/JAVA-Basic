package com.day3.taskexceptions;
import java.util.*;
public class division {
	public static void main(String[]args) {
		try {
			Scanner sc=new Scanner(System.in);
			int a =sc.nextInt();
			int b =sc.nextInt();
			sc.close();
			try {
				int c=b/a;
				System.out.println(c);
			}catch(ArithmeticException e) {
				System.out.println("DivideByZeroException");
				e.printStackTrace();
			}finally {
				System.out.println(a+" "+b);
				System.out.println("Inside Finnaly Block");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
