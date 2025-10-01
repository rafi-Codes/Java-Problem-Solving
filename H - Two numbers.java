import java.util.Scanner;
 
public class codeforces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        double ans = (double) num1 / num2;
        System.out.printf("floor %d / %d = %d\n", num1, num2, (int)Math.floor(ans));
        System.out.printf("ceil %d / %d = %d\n", num1, num2, (int)Math.ceil(ans));
        System.out.printf("round %d / %d = %d\n", num1, num2, Math.round(ans));
        sc.close();
    }
}
