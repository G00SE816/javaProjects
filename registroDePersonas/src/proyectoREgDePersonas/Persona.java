package proyectoREgDePersonas;

import java.util.Objects;


public class Persona {
    
    public String DPI, nombres, apellidos;
    public int Nit;
    
    public Persona (String DPI, String nombres, String apellidos, int Nit){
        
        this.DPI=DPI;
        this.nombres=nombres;
        this.apellidos=apellidos;
        this.Nit=Nit;
    }
    public Persona(String nombres){
        this.nombres=nombres;
    }

    //metodos getter y setter
    
    public String getDPI() {
        return DPI;
    }
    public void setDPI(String DPI) {
        this.DPI = DPI;
    }
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public int getNit() {
        return Nit;
    }
    public void setNit(int Nit) {
        this.Nit = Nit;
    }

    
    /*Metodo ToString que nos va a permitir imprimir en consola el 
    valor de los atributos del objeto Persona
    */
    
    
    @Override
    public String toString() {
        return  nombres +  "       " + apellidos + "       " + DPI + "       " + Nit;
    }
    
    
    /*metodos para comparación y verificación de objetos
    */

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.DPI);
        return hash;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        return Objects.equals(this.DPI, other.DPI);
    }

}
