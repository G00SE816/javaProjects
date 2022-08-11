package prograuspg.project1;
import java.util.Scanner;
/**
 *
 * @author gaort
 */
public class Project1 {
    static int[] numeroAleat= new int[10];
    public static String medio(String palabraMedio)    {
        int pos;
        int len;
        if (palabraMedio.length() % 2 == 0)
        {
            pos = palabraMedio.length() / 2 - 1;
            len = 2;
        }
        else
        {
            pos = palabraMedio.length() / 2;
            len = 1;
        }
        return palabraMedio.substring(pos, pos + len);
    }
    public static int validadorDeVocales(String str)    {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u'||
                    str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I'
                    || str.charAt(i) == 'O' || str.charAt(i) == 'U')
            {
                count++;
            }
        }
        return count;
    }  
    public static boolean approvedPassword(String password){
       if (password.length()>=8){
           boolean digito = false;
           boolean letra = false;
           boolean ReqNum=false;
           int contadorDeNumeros=0;
           char c;
           for(int i=0; i<password.length();i++){
               c = password.charAt(i);
               if(Character.isDigit(c))
                   contadorDeNumeros++;
                   digito=true;
                   ReqNum=true;
                   if (Character.isLetter(c))
                       letra=true;

           }
                   
           if (digito && contadorDeNumeros >=2)
               return true;
           else
               return false;           
       }else{
           return false;
       }
   }
   public static void main(String[] args) {

        int opcion=0;

        do{
                System.out.println("1. Verificar el número más pequeño de tres");
                System.out.println("2. Verificar el caracter de en medio");
                System.out.println("3. Contador de vocales");
                System.out.println("4. Verificar password");
                System.out.println("5. Promedio de un arreglo de 10 numeros random");
                System.out.println("6. Valor Máximo y Minimo de un arreglo de 10 números Random");
                System.out.println("7. Salir");

                System.out.println("Seleccione una opcion: ");
                Scanner scanner=new Scanner(System.in);
                opcion=scanner.nextInt();
                
                switch (opcion) {
                        case 1 -> verifyShortestNumber();
                        case 2 -> verifyMiddleChar();
                        case 3 -> vowelsCounter();
                        case 4 -> validatePassword();
                        case 5 -> checkAverage();
                        case 6 -> checkMinAndMax();
                        case 7 -> salir();             
        }
    }while (opcion != 7);
}       
    static void verifyShortestNumber(){ 
                Scanner scanner=new Scanner(System.in);
                System.out.println("Ingrese la cantidad de numeros a evaluar");
                int numerosAEvaluar=scanner.nextInt();
                int numeroMenor=0;
                
                for (int i=0; i < numerosAEvaluar; i++) {
                    System.out.println("Ingrese el número en la posición " + (i+1));
                    int tmp=scanner.nextInt();
                    if (i==0){
                        numeroMenor=tmp;
                    }else if (tmp<numeroMenor) {
                        numeroMenor=tmp;
                    }
                    
        }
                System.out.println("El numero menor es " + numeroMenor);
    }
    static void verifyMiddleChar(){ 
        
        Scanner scanner=new Scanner(System.in);
                System.out.println("escriba una palabra");
                String palabraMedio=scanner.nextLine();
                System.out.println("El caracter de enmedio del string "+ palabraMedio + " es " + medio(palabraMedio));
        }
    static void vowelsCounter(){  
        Scanner scanner=new Scanner(System.in);
                System.out.println("escriba una palabra");
                String palabraVocales=scanner.nextLine();
                        int ii = 0;
                        for (int i = 0; i < palabraVocales.length(); i++) {
                            if (palabraVocales.charAt(i) == 'a' || 
                                    palabraVocales.charAt(i) == 'e'|| 
                                    palabraVocales.charAt(i) == 'i'|| 
                                    palabraVocales.charAt(i) == 'o'|| 
                                    palabraVocales.charAt(i) == 'u'||
                                    palabraVocales.charAt(i) == 'A'||
                                    palabraVocales.charAt(i) == 'E'||
                                    palabraVocales.charAt(i) == 'I'||
                                    palabraVocales.charAt(i) == 'O'||
                                    palabraVocales.charAt(i) == 'U'){  
                                ii++;
                                }
                            }

        System.out.println("El total de vocales en: " +palabraVocales + " es " + ii);

    }  
    static void validatePassword(){ 
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese su contraseña: ");
        String contraseña=scanner.nextLine();
        if (approvedPassword(contraseña))
            System.out.println("La contraseña es segura");
        else
            System.out.println("La contraseña no es segura");

    }
    static void checkAverage(){
        System.out.println("Numeros aleatorios seleccionados correctamente");
               
        for (int i = 0; i < 10; i++){
            numeroAleat[i]=(int)(Math.random()*100);
            System.out.println(numeroAleat[i]);
        }
        double total = 0;
        for(int i=0; i<numeroAleat.length;i++){
            total = total + numeroAleat[i];
        }
        double promedio=total/numeroAleat.length;
        System.out.println("El promedio del arreglo es "+promedio);
    }
    static void checkMinAndMax(){
        
        for (int i = 0; i < 10; i++){
            numeroAleat[i]=(int)(Math.random()*100);
            System.out.println(numeroAleat[i]);
        }
        {
                int maximo = numeroAleat[0];
                int minimo = numeroAleat[0];
                for (int j : numeroAleat){
                    if (j>maximo)
                        maximo=j;
                    if (j<minimo)
                        minimo = j;
                    }
                                System.out.println("El valor maximo del arreglo es "+ maximo);
                                System.out.println("El valor minimo del arreglo es "+ minimo);
                }
}
    static void salir(){
        
        System.out.println("El programa ha finalizado");
        
    }

}