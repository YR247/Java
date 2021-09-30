package LambdaPackage;

interface Sayable2 {

  String Say(String str);  //single parameter

}

public class LambdaSingleParameter {

  public static void main(String[] args) {
      Sayable2 s = (str) -> {               //single parameter in lambda

          return "This is lambda " + str;
      };

      System.out.println(s.Say("with single parameter."));

  }

}