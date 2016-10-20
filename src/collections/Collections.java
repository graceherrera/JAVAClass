/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;
import java.util.ArrayList;
import static kiss.API.*;
/**
 *
 * @author grace
 */
public class Collections {
    void testRun(){
        outExpect("Hello Collections");
        run();
        outClose();
    }
    
    void run(){
        println("Hello Collections");
    }
    
    void testcreateApplications(){
       ArrayList<String> applications = new ArrayList<String>();
       
       applications.add("CU Georgia");
       applications.add("AU Alabama");
       applications.add("FIU Florida");
       applications.add("UND North Dakota");
       applications.add("SFI New Mexico");
       applications.add("UB California");
       applications.add("UNT Texas");
       applications.add("UM Maryland");
       applications.add("USF Florida");
       applications.add("UM Massachusetts");
       applications.add("UM Minnesotta");
       applications.add("NCU North Carolina");
       applications.add("BSU Idaho");
       applications.add("NMSU New Mexico");
       applications.add("RIT New York");
       applications.add("SU Maryland");
       applications.add("CM Pennsylvania");
       applications.add("LSU Lousiana");
       applications.add("UA Arizona");
       applications.add("MU Wisconsin");
       applications.add("OSU Oregon");
       
       for(String application : applications){
          println(application);
           
       }
       
    }
}