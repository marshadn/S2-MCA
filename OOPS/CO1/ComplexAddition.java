class ComplexNum {
    double real;
    double imaginary;

    ComplexNum(double r, double i) {
        real = r;
        imaginary = i;
    }

    ComplexNum add(ComplexNum c) {
        double realPart = this.real + c.real;
        double imaginaryPart = this.imaginary + c.imaginary;

        return new ComplexNum(realPart, imaginaryPart);
    }

    void display() {
        System.out.print(real + " + " + imaginary + "i");
    }
}

public class ComplexAddition {
    public static void main(String[] args) {
        ComplexNum num1 = new ComplexNum(4.5, 3.2);
        ComplexNum num2 = new ComplexNum(2.3, 5.8);
        ComplexNum sum = num1.add(num2);
        num1.display();
        System.out.print(" + ");
        num2.display();
        System.out.print(" = ");
        sum.display();
    }
}
