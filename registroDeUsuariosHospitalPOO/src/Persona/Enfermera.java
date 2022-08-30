package Persona;

public class Enfermera extends Persona{
    
    private String Especialidad;

    public Enfermera(String Especialidad, int id, String nombre, String correo, String direccion, String telefono) {
        super(id, nombre, correo, direccion, telefono);
        this.Especialidad = Especialidad;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    @Override
    public String toString() {
        return super.toString() + "    " +  "Especialidad: " + Especialidad;
    }
    
}
