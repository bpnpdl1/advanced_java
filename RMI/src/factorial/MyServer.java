/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorial;

import java.rmi.*;
import java.rmi.registry.*;
public class MyServer {
    
    public static void main(String[] args) {
        
        try{
            Registry registry=LocateRegistry.createRegistry(5003);
            
            Factorial stub=(Factorial) new FactorialRemote();
            Naming.rebind("rmi://localhost:5003/demo", stub);
            
            System.out.println("Server is running");
            
            
        }catch(Exception e){
            System.err.println(e);
        }
    }
    
}
