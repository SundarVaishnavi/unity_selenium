package Testjava;

public class specialjunkchar {

	public static void main(String[] args) {
		String str ="*&%%%(&sundar";
		str= str.replaceAll("[^a-z,0-9,A-z]","");
		System.out.println(str);

	}

}
