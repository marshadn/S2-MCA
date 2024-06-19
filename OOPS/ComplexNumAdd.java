import java.util.Scanner;

class Complex {
    double real;
    double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public static Complex add(Complex num1, Complex num2) {
        double realSum = num1.real + num2.real;
        double imaginarySum = num1.imaginary + num2.imaginary;
        return new Complex(realSum, imaginarySum);
    }
}

public class ComplexNumAdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter the real part of the first complex number:");
        double real1 = scanner.nextDouble();
        System.out.println("Enter the imaginary part of the first complex number:");
        double imaginary1 = scanner.nextDouble();

        Complex complex1 = new Complex(real1, imaginary1);

        
        System.out.println("Enter the real part of the second complex number:");
        double real2 = scanner.nextDouble();
        System.out.println("Enter the imaginary part of the second complex number:");
        double imaginary2 = scanner.nextDouble();

        Complex complex2 = new Complex(real2, imaginary2);

        
        Complex result = Complex.add(complex1, complex2);

        
        System.out.println("Resultant Complex Number (Sum of the two complex numbers):");
        System.out.println("Real Part: " + result.real);
        System.out.println("Imaginary Part: " + result.imaginary);

        scanner.close();
    }
}
