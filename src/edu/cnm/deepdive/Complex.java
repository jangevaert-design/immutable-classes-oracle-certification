package edu.cnm.deepdive;

public class Complex {

  private final double real;
  private final double imaginary;

  public Complex(double real, double imaginary) {
      this.real = real;
      this.imaginary = imaginary;
  }

  public double getReal() {
    return real;
  }

  public double getImaginary() {
    return imaginary;
  }

  public Complex plus(Complex b) {
    double newReal = real + b.real;
    double newImaginary = imaginary + b.imaginary;
    return new Complex(newReal, newImaginary);

  }

  public Complex minus(Complex c) {
    double newReal = real - c.real;
    double newImaginary = imaginary - c.imaginary;
    return new Complex(newReal, newImaginary);
  }

  public Complex times(Complex d) {
    double newReal = real * d.real - imaginary * d.imaginary;
    double newImaginary = real * d.imaginary + imaginary * d.real;
    return new Complex(newReal, newImaginary);
  }

  public static Complex plus(Complex a, Complex b) {
//    double real = a.real + b.real;
//    double imaginary = a.imaginary + b.imaginary;
//    return new Complex(real, imaginary); can be written as line 44
    return a.plus(b);
  }

  public static void main(String[] args) {
    Complex a = new Complex(5.0, 6.0);
    Complex b = new Complex(-3.0, 4.0);

    Complex bPlusA = b.plus(a);
    System.out.println("a real = " + a.real + " imaginary = " + a.imaginary);
    System.out.println("b real = " + b.real + " imaginary = " + b.imaginary);

    System.out.println("b + a real = " + bPlusA.real + " imaginary = " + bPlusA.imaginary);

  }



}
