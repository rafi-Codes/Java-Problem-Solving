import java.util.Scanner;
 
public class codeforces{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long num1 = sc.nextInt();
		long num2 = sc.nextInt();
		long num3 = sc.nextInt();
		long num4 = sc.nextInt();
		long diff = (num1 * num2) - (num3 * num4);
		System.out.println("Difference = " + diff);
		sc.close();
	}
}
