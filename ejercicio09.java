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
public class ejercicio09 { 
    public static void main(String[] args) {
    Scanner reader=new Scanner(System.in);
    int [] numero = new int [8];
    
    for (int i=0;i<numero.length;i++){
      System.out.println("Ingrese valores ");
      int num1=reader.nextInt();
      numero[i]=num1;
    }
    
       for (int i=0;i<numero.length;i++){
          if(numero[i]%2==0){
              System.out.println(numero[i]+ " par");
            }
          else{
                 System.out.println(numero[i]+ " inpar");
            }
        }
   }
}
        