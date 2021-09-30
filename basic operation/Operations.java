package com;


import java.util.*;

class Complex{
  int real;
  int imag;
  public Complex(int r, int i){
    real = r;
    imag = i;
  }

  public static Complex add(Complex a, Complex b){
    return new Complex((a.real+b.real),(a.imag+b.imag));
  }

  public static Complex diff(Complex a, Complex b){
    return new Complex((a.real-b.real),(a.imag-b.imag));
  }

  public static Complex product(Complex a, Complex b){
    return new Complex(((a.real*b.real)-(a.imag*b.imag)),((a.real*b.imag)+(a.imag*b.real)));
  }

  public void printComplex(){
    if(real == 0 && imag!=0){
      System.out.println(imag+"i");
    }
    else if(imag == 0 && real!=0){
      System.out.println(real);
    }
    else{
      System.out.println(real+"+"+imag+"i");
    }
  }

}

class Operations{
  @SuppressWarnings("resource")
public static void main(String[] args){

		Scanner sc =new Scanner(System.in);////Input from keyboard
		int num1,num2,num3,num4;
		System.out.print("Enter first real number ");
		num1=Integer.parseInt(sc.nextLine());// Input first real number
		System.out.print("Enter imaginary number ");
		num2=Integer.parseInt(sc.nextLine());// Input imaginary number
		System.out.print("Enter second real number ");
		num3=Integer.parseInt(sc.nextLine());// Input second real number
		System.out.print("Enter imaginary number ");
		num4=Integer.parseInt(sc.nextLine());// Input imaginary number
		
    Complex c = new Complex(num1,num2);
    Complex d = new Complex(num3,num4);

    Complex e = Complex.add(c,d);
    Complex f = Complex.diff(c,d);
    Complex g = Complex.product(c,d);
    e.printComplex();
    f.printComplex();
    g.printComplex();
  }
}
