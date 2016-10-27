/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primes;



import kiss.API.Close;
import static kiss.API.EOL;
import static kiss.API.inProvide;
import static kiss.API.outExpect;
import static kiss.API.outVerify;
import static kiss.API.println;
import static kiss.API.readInteger;

/**
 *
 * @author grace
 */
public class Primes {
    //test driven design
    /*void testIO(){
        try (Close out = outOPen("sum.dat")){
            println("x+y=35");
        }
        try (Close vfy = outVerify("sum.dat")){
            int x = 11;
            int y = 24;
            println("x+y="+(x+y));
        }
        }
    */
    
    // Things to test 
    /*
    happy middle cases
    known bad cases -- typical failures
    fuzzing cases
    Thinking about cases 
    Boundary cases
    Known bugs
    
    */
    void testSum(){
        try (Close in = inProvide(13, EOL, 22, EOL)){
            try(Close out = outExpect("x+y=35")){
                printSum();
            }
        }
    }
    
    void printSum(){
       int x = readInteger();
       int y = readInteger();
        println("x+y=" +(x+y));
    }
    
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
    
    void testBigPrimes(){
        Primes primes = new Primes();
        assert primes.isPrime(1_000_000_007)== true;
    }
    
    boolean isPrime(int x){
      for (int factor = 2; factor <= x/2; ++factor){
          if (x % factor == 0) return false;
      }
      return true;
    }
        
    
    void testHi(){
        println("Hi");
    }

    private Close outOPen(String sumdat) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
