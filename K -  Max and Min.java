import java.util.Scanner;

public class codeforces {

    public static void maxMinGetter(int[] array){
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < 3; i++){
            if (max < array[i]){
                max = array[i];
            }
            if (min > array[i]){
                min = array[i];
            }
        }
        System.out.println(min + " " + max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[3];
        for (int i = 0; i < 3; i++){
            num[i] = sc.nextInt();
        }
        maxMinGetter(num);
        sc.close();
    }
}
