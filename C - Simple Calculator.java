import java.util.Scanner;
 
public class codeforces{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long num1 = sc.nextInt();
		long num2 = sc.nextInt();
		System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
		System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
		System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
		sc.close();
	}
}
