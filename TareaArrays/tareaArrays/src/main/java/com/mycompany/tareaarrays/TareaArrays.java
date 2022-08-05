package com.mycompany.tareaarrays;
import java.util.Scanner;
/**
 *
 * @author gaort
 */
public class TareaArrays {
    static int[] a= new int[10];
    public static void main(String[] args) {
        int opcion=0; 
        
        do{
                System.out.println("1. Llenar arreglo aleatoriamente");
                System.out.println("2. Mostrar arreglo ascendente");
                System.out.println("3. Mostrar arreglo descendente");
                System.out.println("4. Salir");

                System.out.println("Seleccione una opcion: ");
                Scanner scanner=new Scanner(System.in);

                opcion=scanner.nextInt();
                switch (opcion) {
                        case 1 -> llenar();
                        case 2 -> ordenarAsc();
                        case 3 -> ordenarDesc();
                        case 4 -> salir();      
        }
    }while (opcion != 4);
}       
    public static void llenar(){ //Funcion para llenar arreglo con numeros aleatorios
        System.out.println("Numeros Seleccionados Correctamente");
               
        for (int y = 0; y < 10; y++){
            a[y]=(int)(Math.random()*99+1);
            System.out.println(a[y]);
        }
    }
    public static void ordenarAsc(){ //Funcion para ordenar arreglo de forma ascendente
        System.out.println("Numeros Ordenados Ascendentemente");
        
        for (int ii=0; ii<a.length;ii++){
            for(int j=0; j< a.length; j++){
                
                if (j<a.length-1){
                    if(a[j]>=a[j+1]){
                        
                        int tmp=0;
                        tmp = a[j];
                        a[j]=a[j+1];
                        a[j+1]=tmp;
                        }
                    }
                }
            }

         for (int ii=0; ii<a.length-1;ii++){
             System.out.println(a[ii]);           
             }
        }
    public static void ordenarDesc(){  //Funcion para ordenar arreglo de forma descendente
        System.out.println("Numeros Ordenados Descendentemente");
        
        for (int ii=0; ii<a.length;ii++){
            for(int j=0; j< a.length; j++){
                
                if (j<a.length-1){
                    if(a[j]<=a[j+1]){
                        
                        int tmp=0;
                        tmp = a[j];
                        a[j]=a[j+1];
                        a[j+1]=tmp;
                        }
                    }
                }
            }
         for (int ii=0; ii<a.length-1;ii++){
             System.out.println(a[ii]);           
         
             }   
    }  
    static void salir(){ 
        System.out.println("Vuelva pronto");
    }
}
