import java.util.Scanner;
 
public class codeforces{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int intNum = sc.nextInt();
		long longNum = sc.nextLong();
		char ch = sc.next().charAt(0);
		float floatNum = sc.nextFloat();
		double doubleNum = sc.nextDouble();
 
		System.out.printf("%d\n%d\n%c\n%.2f\n%.1f",intNum,longNum,ch,floatNum,doubleNum);
		sc.close();
	}
}
