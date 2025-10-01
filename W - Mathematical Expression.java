import java.util.Scanner;
 
public class codeforce {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int num1 = sc.nextInt();
        char ch = sc.next().charAt(0);
        int num2 = sc.nextInt();
        sc.next().charAt(0);
        int result = sc.nextInt();
        boolean check = false;
        switch (ch){
            case '+' :
            if (num1 + num2 == result){
                check = true;
            } else {
                System.out.println(num1 + num2);
            } break;
            case '-' :
            if (num1 - num2 == result){
                check = true;
            } else {
                System.out.println(num1 - num2);
            } break;
            case '*' :
            if (num1 * num2 == result){
                check = true;
            } else {
                System.out.println(num1 * num2);
            } break;
        }
        if (check){
            System.out.println("Yes");
        } 
        sc.close();
    }
}
