package LambdaPackage;

import java.util.*;
import java.util.stream.*;

public class PrimeNumber {
   public static void main(String[] args) {
	   ArrayList<Integer> al = new ArrayList<Integer>();
	   al = (ArrayList<Integer>) PrimeNumber.al(9);
	
      System.out.println("Prime numbers upto 25 are: "+al);
   }
   public static List<Integer> al(int series) {
      Set<Integer> set = new TreeSet<>();
      return Stream.iterate(1, i -> ++i)
              .filter(i -> i %2 != 0) // lambda expression
              .filter(i -> {
                  set.add(i);
                  return 0 == set.stream()
                           .filter(p -> p != 1)
                           .filter(p -> !Objects.equals(p, i))
                           .filter(p -> i % p == 0)
                           .count();
              })
              .limit(series)
            .collect(Collectors.toList());
   }
}