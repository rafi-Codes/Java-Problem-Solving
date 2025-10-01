import java.util.Scanner;

public class codeforces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (Character.isLetter(ch)){
            System.out.println("ALPHA");
            if (Character.isUpperCase(ch)){
                System.out.println("IS CAPITAL");
            } else {
                System.out.println("IS SMALL"); 
            }
        } else {
            System.out.println("IS DIGIT");
        }
        sc.close();
    }
}
