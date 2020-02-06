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
public class Ejercicio03 {
     public static void main(String[] args) {       
         Scanner reader=new Scanner(System.in);
        int [] num = new int [2];
            for (int j=0;j<num.length;j++){
                System.out.println("ingrese un numero para la posicion"+j);
                num[j]=reader.nextInt();                
            }   
         for (int i=num.length;i>0;i++){
                System.out.println(num[i]+ " ");  
        }

    } 
}
