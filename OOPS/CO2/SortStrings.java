// 1. Program to Sort strings

public class SortStrings {

    public static void main(String[] args) {

        String[] arr = { "hello", "world", "java", "code", "sell" };
        int n = arr.length;

        System.out.print("Array of Strings: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("Array after Sorting: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

    }

}

// import java.util.Scanner;

// public class SortStrings {
// public static void main(String[] args) {

// Scanner sc = new Scanner(System.in);
// System.out.print("Enter number of strings: ");
// int n = sc.nextInt();
// sc.nextLine();

// String[] arr = new String[n];
// System.out.print("Enter array of strings:");
// for (int i = 0; i < n; i++) {
// arr[i] = sc.nextLine();
// }

// System.out.print("Before sorting: ");
// for (int i = 0; i < n; i++) {
// System.out.print(arr[i] + " ");
// }

// for (int i = 0; i < n; i++) {
// for (int j = i + 1; j < n; j++) {
// if (arr[i].compareTo(arr[j]) > 0) {
// String temp = arr[i];
// arr[i] = arr[j];
// arr[j] = temp;
// }
// }
// }

// // Print array after sorting
// System.out.print("After sorting: ");
// for (int i = 0; i < n; i++) {
// System.out.print(arr[i] + " ");
// }

// sc.close();
// }
// }

// // Scanner sc = new Scanner(System.in);
// // int n = sc.nextInt();
// // String[] arr = new String[n];
// // for (int i = 0; i < n; i++) {
// // arr[i] = sc.next();
// // }
// // Arrays.sort(arr, new Comparator<String>() {
// // public int compare(String s1, String s2) {
// // return s1.compareTo(s2);
// // }
// // });
// // for (int i = 0; i < n; i++) {
// // System.out.println(arr[i]);
// // }

// // String[] arr = { "hello", "world", "java", "code", "sell" };