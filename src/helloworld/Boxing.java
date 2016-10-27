/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.io.IOException;
import static java.lang.reflect.Array.set;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kiss.API.Close;
import static kiss.API.EOL;
import static kiss.API.outClose;
import static kiss.API.outExpect;
import static kiss.API.println;

/**
 *
 * @author grace
 */
public class Boxing {
    void testRun() {
        outExpect("Hello World!");
        run();
        outClose();
    }
    void run() {
        println ("Hello World!");
    }
    
    
    void testBoxing(){
        Integer x = new Integer(3);
        Integer y = x;
        //++x; same thing 
        x = new Integer(x.intValue() +1);
        assert x.intValue() == 4;
        assert y.intValue() == 3;
        assert y != new Integer(3);// references a new box that references 3
        assert y.equals(new Integer(3));
        assert y.compareTo(new Integer(3)) == 0;
    }
    
    public class Reverse implements Comparator<Integer>{
        //called an inner class 
    @Override
    public int compare(Integer a, Integer b){
        return -a.compareTo(b);
    }
    }
    
    void testArrayListInt() {
        ArrayList<Integer> ages = new ArrayList<Integer>();
        //This is an empty list for integers 
        ages.add(3);
        ages.add(17);
        ages.add(100);
        
       
        
        for(int age : ages){
            println(age);
        }
        
        ages.sort(new IntegerReverse());
        //good idea if you are going to use this a bunch of time or the ordering is difficult
        //usefully named class -- just a class
        ages.sort(new Reverse());
        //using an inner class -- does the same thing as the one before. 
        ages.sort(new Comparator<Integer>(){ // anonymous inner class
        @Override
        public int compare(Integer a, Integer b){
            return -a.compareTo(b);
        }
    });
        
        ages.sort((a, b) -> {return -a.compareTo(b);}); //lambda (anon function) small steps 
        //shorter is not always better -- in this instancce it is...
        //If it's a complicated thing seperate it out and give it its own name
        //within the curly brackets you can put in all the actions you want?
        //JDK8 only feature
        
        
          for(int age : ages){
            println(age);
        }
       
    }
    
    void testSet(){// adds a hash code
        Set<String> pets = new HashSet<String>();
        pets.add("fluffy");
        pets.add("pookie");
        pets.add("pupper");
        pets.add("doge");
        pets.add("pepe");
        
        for (String pet : pets){
            println(pet);
        }
    }
      void testTreeSet(){//orders everything in such a nice way.
        Set<String> pets = new TreeSet<String>();
        pets.add("fluffy");
        pets.add("pookie");
        pets.add("pupper");
        pets.add("doge");
        pets.add("pepe");
        
        for (String pet : pets){
            println(pet);
        }
    }
      
      void testHashMap(){
          Map<String, Integer> petAges = new HashMap<String, Integer>();
          
          petAges.put("fluffy", 7);
          petAges.put("pookie", 2);
          petAges.put("pupper", 100);
          petAges.put("doge", 3);
          petAges.put("pepe", 83);
          
          try (Close out = outExpect("petAges[pupper]=100", EOL, "petAges[doge]=3", EOL, 
                  "petAges[pookie]=2", EOL, "petAges[fluffy]=7", EOL, "petAges[pepe]=83", EOL)){
               
              for (String key : petAges.keySet()){
              println("petAges["+ key +"]="+ petAges.get(key));
              //don't make your own hashcode 
          }
          }
          
         
          for (String key : petAges.keySet()){
             petAges.put(key, petAges.get(key)+1);
             println("petAges["+ key +"]="+ petAges.get(key));
          }
          petAges.keySet().stream().forEach((key)-> {
          petAges.put(key, petAges.get(key)+1);
      });
          
         //Hash maps store a hash table -- 
         //Tree maps needs a compareto 
      }
    
         void testTreeMap(){
          Map<String, Integer> petAges = new TreeMap<String, Integer>();
          
          petAges.put("fluffy", 7);
          petAges.put("pookie", 2);
          petAges.put("pupper", 100);
          petAges.put("doge", 3);
          petAges.put("pepe", 83);
          
          try (Close out = outExpect("petAges[doge]=3", EOL, "petAges[fluffy]=7", EOL, 
                  "petAges[pepe]=83", EOL, "petAges[pookie]=2", EOL, "petAges[pupper]=100", EOL)){
               
              for (String key : petAges.keySet()){
              println("petAges["+ key +"]="+ petAges.get(key));
              //don't make your own hashcode 
          }
          }
          

          
          //string is both comparable and has hash code
           try (Close out = outExpect("petAges[doge]=4", EOL, "petAges[fluffy]=8", EOL, 
                  "petAges[pepe]=84", EOL, "petAges[pookie]=3", EOL, "petAges[pupper]=101", EOL)){
                
               for (String key : petAges.keySet()){
             petAges.put(key, petAges.get(key)+1);
             println("petAges["+ key +"]="+ petAges.get(key));
          }
              //don't make your own hashcode 
          }
         
          petAges.keySet().stream().forEach((key)-> {
          petAges.put(key, petAges.get(key)+1);
      });
          
         //Hash maps store a hash table -- 
         //Tree maps needs a compareto 
      }
         
         
         //HW Do Something with Collections --- hackerRank need a bag to solve this problem
   
  /* void doStuff() {};     
    void testException(){
        try{
            doStuff();
        } catch (IOException ex){   
        }
    }     
    void testException2() throws IOException {
        doStuff();
    } */
         
         
      
    void testLinkeAdList(){
        List<String> names = new LinkedList<String>();
        // this would break you can't something you didn't add -- names.get(0);
      boolean pass = false;
      try {
          println(names.get(0));
      } catch (IndexOutOfBoundsException ex){
          pass = true;
      }
      assert pass == true;
      
        names.add("doge");
        names.add("fluffy");
        names.add("pepe");
        
       //how to get the last element on that list
       assert names.get(names.size()-1).equals("pepe");
       //don't use the square brackets on lists
       //notation for an array of a string list -- use brackets
       String[] a = new String[3];
       a[0] = "doge";
       assert (a[0].equals("doge"));
       assert (a[1] == null);
       assert (a[2]== null);
       
       
    }
    
    void testCollection(){
        Collection<Integer> c = new LinkedList<Integer>();
        c.add(3);
        c.add(1);
        c.add(7);
        c.add(10);
        
        assert c.contains(3) == true;
        c.remove(3);
        assert c.contains(3) == false;
        
        try(Close out=outExpect(1, EOL, 7, EOL, 10, EOL)){
           Iterator<Integer> i = c.iterator();
            while(i.hasNext()){
            Integer value = i.next();
            println(value); 
            }
        }
        
        try(Close out=outExpect(1, EOL, 7, EOL, 10, EOL)){
            for(Integer value : c){
                println(value);
            }
        }
        
    }
}
