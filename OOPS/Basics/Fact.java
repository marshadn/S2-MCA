public class Fact {
    public static void main(String[] args) {
        int result = myFact(5);
        System.out.println(result);
    }

    static int myFact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
