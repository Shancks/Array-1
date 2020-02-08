
package ejercicio11;

import java.util.Scanner;


public class Ejercicio11 {
    
 public static boolean esPrimo(int numero){
  int contador = 2;
  boolean primo=true;
  while ((primo) && (contador!=numero)){
    if (numero % contador == 0)
      primo = false;
    contador++;
  }
  return primo;
}

    public static void main(String[] args) {
     Scanner reader=new Scanner(System.in);
    int [] numero = new int [4];               
    int [] aux = new int [4];
    int inicio = 0,fin=aux.length;
    //crea arreglo ingresando numeros
    for (int i=0;i<numero.length;i++){
      System.out.println("Ingrese valores ");
      int num1=reader.nextInt();
      numero[i]=num1;     
    }
    
    //muestra arreglo
    System.out.print("Indice ");
      for (int i=0;i<numero.length;i++){
                System.out.print(i+ " ");  
        }
      
    System.out.print("\n Valor ");
      for (int i=0;i<numero.length;i++){
                System.out.print(numero[i]+ "|");  
        }
      //rellenar con los valores primos al principio y el resto al final             
       for (int j=0;j<numero.length;j++){
               if(esPrimo(numero[j])){
               aux[inicio]=numero[j];
               inicio++;
               }
               else{
               aux[fin]=numero[j];
               fin--;
               }              
            }
      //muestra arreglo
        System.out.print("Indice ");
          for (int i=0;i<numero.length;i++){
                    System.out.print(i+ " ");  
            }

        System.out.print("\n Valor ");
          for (int i=0;i<aux.length;i++){
                    System.out.print(aux[i]+ "|");  
            }

    }    
}
