package LambdaPackage;

interface Addable{

    //with 3 parameters a,b,c with data types
    int add(int a,int b ,int c);
}
 

public class LambdaMultiParameters {
 
    public static void main(String[] args) {
 
        Addable d1 =(a,b,c)->(a+b+c);     //without data type

        System.out.println(d1.add(2, 3, 4));


        Addable d2 =(a,b,c)->(a+b+c);        //without data type in Addable (int,etc)

        System.out.println(d2.add(10,20,30));
 

    }
 
}