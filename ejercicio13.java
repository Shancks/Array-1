/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author Shancks
 */
public class ejercicio13{
    public static void main(String[] args) {
           
        Scanner reader=new Scanner(System.in);
        int [] numero = new int [500];      
          for(int i=0; i<numero.length;i++){
                numero[i]=(int)(Math.random()*500);
            }
        for (int i=0;i<numero.length;i++){
                System.out.print(numero[i]+ " ");
                if(i%10==0){
                        System.out.println("");
                    }
        }
        int minimo=numero[0];        
        int maximo=numero[0];
        
      System.out.println("\n ¿Que quieres destacar?(1 -minimo 2- maximo:) \n");
      int selec=reader.nextInt();
      for (int j=0;j<numero.length;j++){
          if(minimo>numero[j]){
              minimo=numero[j];
           }
          else if(maximo<numero[j]){
              maximo=numero[j];
          }
      }
          switch(selec){
          case 1:              
            for (int k=0;k<numero.length;k++){
                  if(numero[k]==minimo){                      
                  System.out.print("****"+numero[k]+ "*** ");
                   if(k%10==0){
                        System.out.println("");
                    }
                  }
                  else{                      
                  System.out.print(numero[k]+ " ");
                   if(k%10==0){
                        System.out.println("");
                    }
                  }
           }                      
           break;
          case 2:              
            for (int k=0;k<numero.length;k++){
                  if(numero[k]==maximo){                      
                    System.out.print("***"+numero[k]+ "*** ");
                    if(k%10==0){
                        System.out.println("");
                    }
                  }
                  else{                      
                  System.out.print(numero[k]+ " ");
                  if(k%10==0){
                        System.out.println("");
                    }
                  }
           }         
              break;
          }                    
    }    
}
