package Testjava;

public class reversenumber {

	public static void main(String[] args) {
		int num = 1234,rev=0;
		while(num!=0) {
			int i=num%10;
			rev=rev*10+i;
			num/=10;
			}
System.out.println(rev);
	}

}
