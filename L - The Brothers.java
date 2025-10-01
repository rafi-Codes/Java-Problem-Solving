import java.util.Scanner;
 
public class codeforces {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String b1FirstName = sc.next();
        String b1SecondName = sc.next();
        sc.nextLine();
        String b2 = sc.nextLine();
        if (b2.contains(b1SecondName)){
            System.out.println("ARE Brothers");
        } else {
            System.out.println("NOT");
        }
        sc.close();
    }
}
