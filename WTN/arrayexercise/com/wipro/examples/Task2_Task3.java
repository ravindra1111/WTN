package com.wipro.examples;

import java.util.Arrays;
import java.util.Scanner;

public class Task2_Task3 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:-");
		int number=sc.nextInt();
        String str=String.valueOf(number);
        StringBuilder sb=new StringBuilder(str);
        number=Integer.valueOf(sb.reverse().toString());
		int r=number;
		int a[]=new int[(int)Math.log10(r)+1];
		int duplicatedigit=-1,i=0;
		while(r!=0) {
			a[i]=r%10;
			r=r/10;
			i++;
		}
		Arrays.sort(a);
		for(int j=0;j<a.length;j++)
		{
			for(int h=0;h<a.length;h++)
			{
				
				if(h!=j) {
					if(a[j]==a[h])
					{
						duplicatedigit=a[h];
						break;
					}
				}
			}
			if(duplicatedigit>-1)
			{
				break;
			}
		}
		
		System.out.println("duplicate digit:"+duplicatedigit);
		sc.close();
	}

}
