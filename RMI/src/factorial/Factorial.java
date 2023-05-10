/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package factorial;

import java.rmi.*;
public interface Factorial extends Remote
{
    public int factorial(int n) throws RemoteException;
}
