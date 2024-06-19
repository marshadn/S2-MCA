// class Recursive {
//     public static void main(String[] args) {
//         int result = sum(10);
//         System.out.println(result);
//     }

//     public static int sum(int k) {
//         if (k > 0) {
//             return k + sum(k - 1);
//         } else {
//             return 0;
//         }
//     }
// }
// public class Recursive {
//     public static void main(String[] args) {
//         int result = sum(5, 10);
//         System.out.println(result);
//     }

//     public static int sum(int start, int end) {
//         if (end > start) {
//             return end + sum(start, end - 1);
//         } else {
//             return end;
//         }
//     }
// }

public class Recursive {
    public static void main(String[] args) {
        int z = fact(5);
        System.out.println(z);
    }

    public static int fact(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }
}