
package ejerciciosarray;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {  
           
           Scanner reader=new Scanner(System.in);
        int [] numero = new int [100];      
          for(int i=0; i<numero.length;i++){
                numero[i]=(int)(Math.random()*20);
            }
        for (int i=0;i<numero.length;i++){
                System.out.print(numero[i]+ " ");  
        }
      System.out.println("Ingrese dos valores ");
      int num1=reader.nextInt();
      int num2=reader.nextInt();
      for (int i=0;i<numero.length;i++){
          if(numero[i]==num1){
              numero[i]=num2;
          }          
      }
      for (int i=0;i<numero.length;i++){
        if(numero[i]==num2){
          System.out.print("\""+numero[i]+ "\" ");
        }
      else{
             System.out.print(numero[i]+ " ");
                }
          }
    }
}
