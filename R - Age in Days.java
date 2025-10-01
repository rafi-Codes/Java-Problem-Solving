import java.util.Scanner;
 
public class codeforces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ageInDays = sc.nextInt();
        int year = ageInDays / 365;
        int month = (ageInDays % 365) / 30;
        int days = ((ageInDays%365)%30);
        System.out.printf("%d years\n%d months\n%d days\n", year,month,days);
        sc.close();
    }
}
