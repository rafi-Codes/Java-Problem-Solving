import java.util.Scanner;
 
public class codeforces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        String temp = String.valueOf(num.charAt(0));
        int n = Integer.parseInt(temp);
        if (n % 2 == 0) System.out.println("EVEN");
        else System.out.println("ODD");
        sc.close();
    }
}
