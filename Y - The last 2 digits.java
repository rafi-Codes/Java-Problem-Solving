import java.util.Scanner;
 
public class Main{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    long num1 = sc.nextLong();
	    long num2 = sc.nextLong();
	    long num3 = sc.nextLong();
	    long num4 = sc.nextLong();
	    long numOneTwo = (num1 * num2) % 100;
	    long numThreeFour = (num3 * num4) % 100;
	    long r = (((numOneTwo * numThreeFour) % 100) % 100);
	    String tempResult = String.valueOf(r);
	    String result = String.format("%2s", tempResult).replace(' ', '0');
	    System.out.println(result);
		sc.close();
	}
}
