import java.util.Scanner;
 
public class codeforces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exp = sc.next();
        char ch = '0';
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                ch = c;
                break;
            }
        }
        String num[] = exp.split(String.valueOf("\\" + ch));
        int num1 = Integer.parseInt(num[0]);
        int num2 = Integer.parseInt(num[1]);
        switch(ch){
           case '+' :
             System.out.println(num1+num2);
             break;
           case '-' :
             System.out.println(num1-num2);
             break;
           case '*' :
             System.out.println(num1*num2);
             break;
           case '/' :
             System.out.println(num1/num2);
             break;
        }
        sc.close();
    }
}
