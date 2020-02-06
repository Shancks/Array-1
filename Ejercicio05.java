
package ejerciciosarray;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
           Scanner reader=new Scanner(System.in);
        int [] num = new int [10];
        //lee una cadena de numeros
            for (int j=0;j<num.length;j++){
                System.out.println("ingrese un numero para la posicion"+j);
                num[j]=reader.nextInt();          
                
            } 
            //busca cual es el minimo y cual es el maximo del arreglo
            int min=num[0],max=num[0];
         for (int i=0;i<num.length;i++){          
             if(min>num[i]){
                 min=num[i];
             }
             if(max<num[i]){
                 max=num[i];
             }
        }
         //divide el minimo del maximo
         for (int i=0;i<num.length;i++){
             if(num[i]==min){                 
                System.out.println(num[i]+ "Minimo");                   
             }
             if(num[i]==max){                 
                System.out.println(num[i]+ "Maximo");                   
             }
             else{                 
                System.out.println(num[i]+ " ");   
             }
        }

    }
    
}
