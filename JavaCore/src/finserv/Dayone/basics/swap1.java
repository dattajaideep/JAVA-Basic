package finserv.Dayone.basics;

import java.util.Scanner;

public class swap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		sc.close();
		int tmp=a;
		a=b;
		b=tmp;
		System.out.println(a+" "+b);
	}

}