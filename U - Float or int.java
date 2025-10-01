import java.util.Scanner;

public class codeforces{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        if (num % 1 == 0){
            int intNum = (int) num;
            System.out.println("int " + intNum);
        } else {
            String input = String.valueOf(num); 
            String[] parts = input.split("\\.");
            System.out.println("float " + parts[0] + " " + "0."+parts[1]);
        } 
        sc.close();
    }
}
