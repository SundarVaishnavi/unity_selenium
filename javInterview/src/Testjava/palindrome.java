package Testjava;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class palindrome {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int n = sc.nextInt();
		int temp_num=n,rev=0;
		while(n!=0) {
			rev=rev*10+n%10;
			n=n/10;
		}
		
if(temp_num==rev) {
	System.out.println(temp_num+" is a palndrome number");
}else {
	System.out.println(temp_num+"not a palndrome number");
}
	}
	

}
