import java.util.Scanner;
 
public class codeforces{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long sum = (n * (n + 1))/2;
		System.out.println(sum);
		sc.close();
	}
}
