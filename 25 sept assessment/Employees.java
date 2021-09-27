package exception;

class Employees
{
    int No;
    String Name;
    int Age;
    String Location;

    Employees(int i,String nm,int a,String l)           // Parameterize Constructor
    {
        No = i;
        Name = nm;
        Age = a;
        Location = l;
    }

    void PutData()
    {
        System.out.print("\n\tEmployee No       : "+No);
        System.out.print("\n\tEmployee Name     : "+Name);
        System.out.print("\n\tEmployee Age      : "+Age);
        System.out.print("\n\tEmployee Location : "+Location);
    }

    public static void main(String args[])
    {

        Employees E = new Employees(4143,"Yashika Rohilla",22,"Hisar");
        // Creating object and passing values to constructor.

        E.PutData();          // Calling PutData()  to print

    }
}