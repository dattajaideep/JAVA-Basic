package com.day2.exception;

import java.util.Scanner;
public class Voter {
	public void validateage(int Age) {
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		try {
			if(Age>=18) {
				//Block of statements
			}
			else {
				throw new AgeInvalidException("Age needs to be above 17");
			}
		} catch (AgeInvalidException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	public void justFun() {
		System.out.println("No Problem");
	}
}
