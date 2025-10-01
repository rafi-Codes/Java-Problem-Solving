import java.util.Scanner;
 
public class codeforces{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long num1 = sc.nextLong();
		long num2 = sc.nextLong();
		num1 %= 10;
		num2 %= 10;
		System.out.println(num1+num2);
		sc.close();
	}
}
