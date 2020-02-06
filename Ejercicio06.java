/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosarray;

import java.util.Scanner;

/**
 *
 * @author alumnot
 */
public class Ejercicio06 {
    public static void main(String[] args) {        
           Scanner reader=new Scanner(System.in);
        int [] num = new int [10];        
        int [] aux = new int [10];
            for (int j=0;j<num.length;j++){
                System.out.println("ingrese un numero para la posicion "+j);
                num[j]=reader.nextInt(); 
            }
             for (int j=0,i=num.length;j<num.length;j++){
                 i--;
                aux[i]=num[j]; 
            }             
         for (int i=0;i<aux.length;i++){
                System.out.print(aux[i]+ " ");  
        }
            
    }
}
