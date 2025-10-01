import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
 
public class codeforces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> num = new ArrayList <Integer> ();
        for (int i = 0; i < 3; i++){
            int n = sc.nextInt();
            num.add(n);
        }
        ArrayList <Integer> copy = new ArrayList <Integer> (num);
        num.sort(Comparator.naturalOrder());
        for (int i : num){
            System.out.println(i);
        }
        System.out.println();
        for (int i : copy){
            System.out.println(i);
        }
        sc.close();
    }
}
