import java.util.Scanner;
 
public class codeforce {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long D = sc.nextLong();
        
        double AB = (double) B * Math.log10((double)A);
        double CD = (double) D * Math.log10((double)C);
            
            if (AB > CD) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            
        sc.close();
    }
}
