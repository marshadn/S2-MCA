import java.util.*;

public class Checkarrelem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr;
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int flag = 0;
        int num = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                flag = 1;
                System.out.println(num + " is present in array");
                break;
            }
        }
        if (flag == 0) {
            System.out.println(num + " is not present in array");
        }
    }
}