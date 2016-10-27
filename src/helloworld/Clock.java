/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.util.ArrayList;
import static kiss.API.*;
/**
 *
 * @author grace
 */
public class Clock extends java.lang.Object implements Comparable<Clock>{
    
    // here is the change. 
    //instance variables
    private double hours=0;
    private double minutes=0;
    private double seconds=0;
    private boolean started=false;
    private double t0;
    
    void start(){
        started = true;
        t0 = time();
    }
    
    void setHours (double _hours) {
        hours = _hours;
        minutes = (hours-Math.floor(hours))*60.0;
        seconds = (minutes-Math.floor(minutes))*60.0;
    }
    Clock(){setHours(0);}
    Clock(double _hours) {setHours(_hours);}
    Clock(double _hours, double _minutes){setHours(_hours + _minutes / 60.0);}
 
    double getHours(){
        return started ? (hours + (time() - t0)/3600.0): hours;
    }
    
    double getMinutes(){
        double _hours = getHours();
        return (_hours-Math.floor(_hours))*60.0;
    }
    
    double getSeconds(){
        double _minutes = getMinutes();
        return (_minutes-Math.floor(_minutes))*60.0;
    }
    
     @Override
    public int compareTo(Clock clock) {
        double delta = getHours()-clock.getHours();
        if(delta < 0) return -1;
        if (delta == 0) return 0;
        return 1;
    }
       
    //overload of the definition of clock -- the types have to be different. 
    public boolean equals(Clock clock){
        return getHours() == clock.getHours(); // overloading allowed in Java
    }
    /*
       public boolean equals(Clock specialclock){
        return getHours() == specialclock.getHours(); // NOT ALLOWED 
    }
    */
   @Override //safety for the compiler it overrides the word equal to give it a new definition 
   //hint for us so that what we think is true is actually true at runtime
   
   
   public boolean equals(Object object){
           return (object instanceof Clock) && equals((Clock)object);
    }
   //compare clocks not are they equal but is one less than the other
   
   
    void testGetTime(){
        Clock clock = new Clock();
        double hours = clock.getHours();
        double minutes = clock.getMinutes();
        double seconds = clock.getSeconds();
    }
    void testGetCorrectTime(){
        Clock clock = new Clock();
        clock.setHours(6.50);
        assert clock.getHours() == 6.5;
        assert clock.getMinutes() == 30.0;
        assert clock.getSeconds() == 0.0;
               
    }
    void testGetFlowingTime(){
        Clock clock= new Clock();
        clock.setHours(1.00);
        clock.start();
        pause(1.0);
        double now = clock.getHours();
        double shouldBe = 1.0 + 1.0/3600.0;
        assert abs (now-shouldBe) < 0.1 / 3600.0;
    }
  
   
   
    void testEquals(){
        Clock clock1 = new Clock();
        Clock clock2 = clock1;
        Clock clock3 = new Clock();
        
        clock1.setHours(1.00);
        clock3.setHours(1.00);
        assert clock2.getHours() == 1.00;
        assert clock1.equals(clock2) == true;
        assert clock1.equals(clock3) == true; // we overrode what equals means so in this instance == will not mean equal anymore
        assert (clock1 == clock3) == false; //we cannot change the operator == are they referring to the same thing?
        
    }     
    @Override
            public String toString(){
                return String.format("%02d:%02d", (int)getHours(), (int)getMinutes());
            }
    void testSortClocks(){
        ArrayList<Clock> clocks = new ArrayList<Clock>();
        clocks.add(new Clock(1));
        clocks.add(new Clock(1, 30));
        clocks.add(new Clock(2));
        clocks.add(new Clock(1, 15));
        clocks.sort(null);
        for (Clock clock : clocks){
            println(clock);
        }
    }
   
}
