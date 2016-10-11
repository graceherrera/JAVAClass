/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primes;

import static kiss.API.println;

/**
 *
 * @author grace
 */
public class Primes {
    //test driven design
    void testSmallPrime(){
       Primes primes = new Primes(); //new object
       //How would you use it? If you're trying to sell this one the open market
      //Prime # between two values or the next prime #
      //The thing we really want to know is it a prime? boolean= is and the ?
    
      // println(primes.isPrime(2)); poor choice because the person will see is true 
   
      //the test will not be monitored so we need a test that will just run. 
    
     /* try (Close out = outExpect("yes")){
         primes.isPrime(2);
     }
      println(primes.isPrime(2)); */
      
      //as much as you can separate the user interaction and the business part 
      //Better choice:
    
      assert primes.isPrime(2) == true;
      assert primes.isPrime(3) == true;
      assert primes.isPrime(5) == true;
      
      
      /*
      is now a test that you create a primes thing and I can ask it about things 
      this is the API for the primes thing
      Good tests should test the object that you're using
      your test shoudl illustrate how the thing should work 
      As mucha as you can you want the tests to be separate of each other. 
      
      If you are checking multiple cases its good to be explicit with the cases
      so that we know exactly in which case it broke on
      */
    }
    
    void testSmallComposites(){
        Primes primes = new Primes();
        assert primes.isPrime(4)== false;
        assert primes.isPrime(6) == false;
        assert primes.isPrime(8) == false;
        
        /* In a big project people are effectively looking at reports on test
        and it's strange for tests to go in and out of working for different reasosn
        at different times- it causes regressions -- hard to keep track of regressions
        if the tests keep moving -- so keep the tests alone
        If you find a new case -- create a new test
        */
    }
    
    boolean isPrime(int x){
        return true;
    }
    
    void testHi(){
        println("Hi");
    }
}
