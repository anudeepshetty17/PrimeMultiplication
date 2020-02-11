package com.bio.prime;

import java.util.Scanner;
import java.util.stream.IntStream;

public class PrimeNumbers {
	
	public static void main(String[] args) 
    {
        //Read input from console - optional
        Scanner scan= new Scanner(System.in);
        System. out.println("Enter a number : ");
        int number = scan.nextInt();
        scan.close();
    }
	
	static Integer[] getAllPrimes(int number) {
		 Integer[] primeArray = IntStream.range(2, Integer.MAX_VALUE)
                 .filter(n -> isPrime(n))
                 .limit(number)      //Limit the number of primes here
                 .boxed()
                 .toArray(Integer[]::new);
      
     return primeArray;
	}
     
    static boolean isPrime(int number) {
        if(number <= 2)
            return number == 2;
        else
            return  (number % 2) != 0
                    &&
                    IntStream.rangeClosed(3, (int) Math.sqrt(number))
                    .filter(n -> n % 2 != 0)
                    .noneMatch(n -> (number % n == 0));
    }

}
