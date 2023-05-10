/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorial;

import java.rmi.*;
public class MyClient {
    public static void main(String[] args) {
         try{
    Factorial stub=(Factorial)Naming.lookup("rmi://localhost:5003/demo");
    
             System.out.println("The Factorial is "+stub.factorial(5));
}catch(Exception e){
             System.err.println(e);
}
    }
}
