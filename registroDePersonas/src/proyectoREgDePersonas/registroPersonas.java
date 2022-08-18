package proyectoREgDePersonas;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author gaort
 */
public class registroPersonas {
    
    /*en nuestro ArrayList de la clase Persona
    se almacenaran los datos de registro 
    */
    
    ArrayList<Persona> listapersonas;
    
    public static void main(String[] args) {
        
        /*la variable opción será la encargada de definir la selección del usuario 
        cuando se encuentre en el menú*/
      
        int opcion;
        
        registroPersonas proyectoPersonas = new registroPersonas();
        
        proyectoPersonas.listapersonas=new ArrayList ();
        
        Scanner scan = new Scanner (System.in);
        
        do{
            System.out.println("1. Registrar Persona");
            System.out.println("2. Mostrar Listado");
            System.out.println("3. Salir\n");
            System.out.println("INGRESE UNA OPCION");
            opcion= scan.nextInt();
            switch (opcion) {
                case 1:
                    proyectoPersonas.registrarPersona();
                    break;
                case 2:
                   proyectoPersonas.mostrarLista();
                    break;
            }
        }while (opcion !=3);
        
    }    
        public void registrarPersona(){
          int opcion2=0;
            do{

            String DPI, nombres, apellidos;
            int Nit;
            Scanner scan = new Scanner (System.in);
            System.out.println("Ingrese Nombres");
            nombres=scan.nextLine();
            System.out.println("Ingrese Apellidos");
            apellidos=scan.nextLine();
            System.out.println("Ingrese DPI");
            DPI=scan.next();
            System.out.println("Ingrese NIT");
            Nit=scan.nextInt();
            
            Persona persona = new Persona (DPI, nombres, apellidos, Nit);
            
            listapersonas.add(persona);
            System.out.println("1. Desea iniciar un nuevo registro");
            System.out.println("2. Regresar al menu anterior");
                System.out.println("ELIJA UNA OPCION (1-2)");
            opcion2 =scan.nextInt();
            
            }while(opcion2!=2);
             
        }
        
        public void mostrarLista(){
            
            if (listapersonas.size()>0){
                for (Persona persona : listapersonas){
                    System.out.println(persona);
                }
                
            }else{
                System.out.println("NO SE ENCUENTRAN PERSONAS REGISTRADAS");
            }
        }
    }
    

