/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonaccideivis;

import java.util.Scanner;


/**
 *
 * @author David
 */
public class FibonacciDeivis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
     
        int n = scanner.nextInt();
        int variable = 0;
        int variable1 = 1;
        int variable2 = 1;
        for (int i = 0; i <= n; i++) {
            System.out.println("Fibonacci es: " + variable);  
            variable2 = variable + variable1;
            variable = variable1;
            variable1 = variable2;
        }

        
        }              
         
                 
        }
            
        
    
    
    

