class Overload {
    static int plusMethodInt(int x, int y) {
        return x + y;
    }

    static double plusMethodDouble(double x, double y) {
        return x + y;
    }

    static int plusMethodInt(int x, int y, int z) {
        return x + y + z;
    }

    public static void main(String[] args) {
        int myNum1 = plusMethodInt(8, 5);
        double myNum2 = plusMethodDouble(4.3, 6.26);
        int myNum3 = plusMethodInt(8, 5, 7);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
        System.out.println("int: " + myNum3);
    }
}