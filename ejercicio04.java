
package ejerciciosarray;

public class ejercicio04 {
    public static void main(String[] args) {             
        int [] numero = new int [20];                    
        int [] cuadrado = new int [20];                    
        int [] cubo = new int [20];   
        
         for(int i=0; i<numero.length;i++){
                numero[i]=(int)(Math.random()*100);
                cuadrado[i]=numero[i]*numero[i];                
                cubo[i]=numero[i]*numero[i]*numero[i];
            }
         System.out.println("arreglo de numeros");
         for (int i=0;i<numero.length;i++){
                System.out.print(numero[i]+ " ");    
        }
         System.out.println("");
         System.out.println("arreglo de numeros al cuadrado");
         
          for (int i=0;i<cuadrado.length;i++){                
                System.out.print(cuadrado[i]+ " ");
        }          
         System.out.println("");
         System.out.println("arreglo de numeros al cubo");
         
           for (int i=0;i<cubo.length;i++){                
                System.out.print(cubo[i]+ " "); 
        }
           
    }
}
