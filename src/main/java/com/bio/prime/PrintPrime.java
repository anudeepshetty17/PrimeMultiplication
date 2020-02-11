package com.bio.prime;

import java.util.Scanner;

public class PrintPrime{  
    
    public static void main(String[] args) {
        //Read input from console    	
        /*print the multiplication table*/
    	int number = readInputFromUser();
        printMultiplicationTable(number,PrimeNumbers.getAllPrimes(number));
    }
    
    public static int readInputFromUser()  {
    	int number = -1;
    	for(;;) {
    		Scanner scan= new Scanner(System.in);
        	System. out.println("Enter a number greater than 1: Enter 0 to exit");
        	try {
        		number =scan.nextInt();
        	}catch(Exception e) {
        		System. out.println("Invalid Number");
        		continue;
        	}
        	if(number == 0) {
            	scan.close();
            	System.exit(0);
            }
            if(number < 2) {
            	System. out.println("Invalid Number");
            	continue;
            }
        	scan.close();
        	break;
    	}
    	
    	return number;
    	
    }
     
    public static void printMultiplicationTable(int tableSize, Integer[] nonOffsetprimes) {
    	tableSize++;
    	Integer[] primes= new Integer[nonOffsetprimes.length+1];
    	primes[0] = nonOffsetprimes[0];
    	
        Integer[][] primeTable= new Integer[tableSize][tableSize];
        primeTable[0] = nonOffsetprimes;
        for(int i = 0; i<nonOffsetprimes.length;i++ ) {
        	primes[i+1] = nonOffsetprimes[i];
        }
         
        for(int i =0 ;i<tableSize;i++ ) {
        	for(int j=0;j<tableSize;j++) {
        		if(i==0&& j==0) {
        			System.out.print("\t");
        		}
        		else if(i==0) {
        			System.out.print(primes[j]+"\t");
        		}
        		else if(j==0) {
        			System.out.print(primes[i]+"\t");
        		} else {
            		System.out.print(primes[i] * primes[j]+"\t");
        		}
        	}
        	if(i==0) {
        		System.out.println("\n---");
        	}else {
        		System.out.println("\n");
        	}
        }
        
    }
}