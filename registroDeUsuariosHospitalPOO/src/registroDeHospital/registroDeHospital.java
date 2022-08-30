package registroDeHospital;
import Persona.Doctor;
import Persona.Enfermera;
import Persona.Paciente;
import java.util.Scanner;
import java.util.ArrayList;

public class registroDeHospital {

    /**
     *
     */
    public static ArrayList<Doctor> listapersonas2 = new ArrayList<>();
    public static ArrayList<Paciente> listapersonas3 = new ArrayList<>();
    public static ArrayList<Enfermera> listapersonas4 = new ArrayList<>();

    
    
    public static void main(String[] args) {
  
        int opcion;
                      
        Scanner scan = new Scanner (System.in);
        
        do{
            System.out.println("1. Registrar Doctor");
            System.out.println("2. Registrar Enfermero/a");
            System.out.println("3. Registrar Paciente");
            System.out.println("4. Mostrar Lista");
            System.out.println("5. Salir\n");
            System.out.println("INGRESE UNA OPCION");
            opcion= scan.nextInt();
            switch (opcion) {
                case 1:
                    registrarDoctor();
                    break;
                case 2:
                    registrarEnfermer();
                    break;
                case 3:
                    registrarPaciente();
                    break;
                case 4:
                   mostrarLista();
            }
        }while (opcion !=5);

    }
          public static void registrarPaciente(){

          int opcion24=0;
            do{

            String ID, nombre, correo, direccion, telefono, cumple,tipoSangre, altura, peso;

            Scanner scan = new Scanner (System.in);
            System.out.println("Ingrese ID");
            ID=scan.nextLine();
            System.out.println("Ingrese Nombre");
            nombre=scan.nextLine();
            System.out.println("Ingrese Correo");
            correo=scan.nextLine();
            System.out.println("Ingrese Direccion");
            direccion=scan.nextLine();
            System.out.println("Ingrese Telefono");
            telefono=scan.nextLine();
            System.out.println("Ingrese fecha de cumpleanos");
            cumple=scan.nextLine();
            System.out.println("Ingrese Tipo de sangre el letras");
            tipoSangre=scan.nextLine();
            System.out.println("Ingrese peso en libras");
            peso=scan.nextLine();
            System.out.println("Ingrese altura en metros");
            altura=scan.nextLine();

           Paciente paciente = new Paciente(cumple, Integer.parseInt(peso), Integer.parseInt(altura), tipoSangre, Integer.parseInt(ID), nombre, correo, direccion,telefono);
           
            listapersonas3.add(paciente);
            System.out.println("1. Desea iniciar un nuevo registro");
            System.out.println("2. Regresar al menu anterior");
                System.out.println("ELIJA UNA OPCION (1-2)");
            opcion24 =scan.nextInt();
            
            }while(opcion24!=2);
             
        }
          
          public static void registrarEnfermer(){
          int opcion22=0;
            do{

            String ID, nombre, correo, direccion, telefono,especialidad;

            Scanner scan = new Scanner (System.in);
            System.out.println("Ingrese ID");
            ID=scan.nextLine();
            System.out.println("Ingrese Nombre");
            nombre=scan.nextLine();
            System.out.println("Ingrese Correo");
            correo=scan.nextLine();
            System.out.println("Ingrese Direccion");
            direccion=scan.nextLine();
            System.out.println("Ingrese Telefono");
            telefono=scan.nextLine();
            System.out.println("Ingrese Especialidad");
            especialidad=scan.nextLine();

            Enfermera enfermer = new Enfermera (especialidad, Integer.parseInt(ID), nombre, correo, direccion, telefono);        
                    
            listapersonas4.add(enfermer);
            System.out.println("1. Desea iniciar un nuevo registro");
            System.out.println("2. Regresar al menu anterior");
                System.out.println("ELIJA UNA OPCION (1-2)");
            opcion22 =scan.nextInt();
            
            }while(opcion22 == 1);
             
            
            
        }
          
        public static void registrarDoctor(){
          int opcion23=0;
            do{

            String ID, nombre, correo, direccion, telefono, especialidad;

            Scanner scan = new Scanner (System.in);
            System.out.println("Ingrese ID");
            ID=scan.nextLine();
            System.out.println("Ingrese Nombre");
            nombre=scan.nextLine();
            System.out.println("Ingrese Correo");
            correo=scan.nextLine();
            System.out.println("Ingrese Direccion");
            direccion=scan.nextLine();
            System.out.println("Ingrese Telefono");
            telefono=scan.nextLine();
            System.out.println("Ingrese Especialidad");
            especialidad=scan.nextLine();
            
         Doctor doctor = new Doctor (especialidad, Integer.parseInt(ID), nombre, correo, direccion, telefono);  

            listapersonas2.add(doctor);
            System.out.println("1. Desea iniciar un nuevo registro");
            System.out.println("2. Regresar al menu anterior");
                System.out.println("ELIJA UNA OPCION (1-2)");
            opcion23 =scan.nextInt();
            
            }while(opcion23!=2);
        }
        public static void mostrarLista(){
            
            if (!listapersonas2.isEmpty()){
                System.out.println("------------------ DOCTORES REGISTRADOS----------------");
                for (Doctor doctor : listapersonas2){
                    System.out.println(doctor);
                }
                System.out.println("------------------ ENFERMEROS REGISTRADOS----------------");
                for (Enfermera enfermera : listapersonas4){
                    System.out.println(enfermera);
                }
                System.out.println("------------------ PACIENTES REGISTRADOS----------------");
                
                for (Paciente paciente : listapersonas3){
                    System.out.println(paciente);
                }
            }else{
                System.out.println("NO SE ENCUENTRAN PERSONAS REGISTRADAS");
            }
        }

}