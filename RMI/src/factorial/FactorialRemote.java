/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorial;

import java.rmi.*;
import java.rmi.server.*;

public class FactorialRemote extends UnicastRemoteObject implements Factorial{
   FactorialRemote() throws RemoteException{
       super();
   }
   
    public int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
}
