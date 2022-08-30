package Persona;


public abstract class Persona {
    
    private int id;
    private String nombre;
    private String correo;
    private String direccion;
    private String telefono;
    
    public Persona(int id, String nombre, String correo, String direccion, String telefono){
        
        this.id=id;
        this.nombre=nombre;
        this.correo=correo;
        this.telefono=telefono;
        this.direccion=direccion;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return  "ID: " + id + "    " + "nombre: " + nombre + "    " + ", correo: " + correo + "    " + ", direccion: " + direccion + "    " + ", telefono: " + telefono;
    }
    
    
    

}
