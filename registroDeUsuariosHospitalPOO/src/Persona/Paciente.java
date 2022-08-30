package Persona;

public class Paciente extends Persona {
    private String  Cumpleaños;
    private int peso;
    private int altura;
    private String tipoDeSangre;

    public Paciente(String Cumpleaños, int peso, int altura, String tipoDeSangre, int id, String nombre, String correo, String direccion, String telefono) {
        super(id, nombre, correo, direccion, telefono);
        this.Cumpleaños = Cumpleaños;
        this.peso = peso;
        this.altura = altura;
        this.tipoDeSangre = tipoDeSangre;
    }

    public String getCumpleaños() {
        return Cumpleaños;
    }

    public void setCumpleaños(String Cumpleaños) {
        this.Cumpleaños = Cumpleaños;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getTipoDeSangre() {
        return tipoDeSangre;
    }

    public void setTipoDeSangre(String tipoDeSangre) {
        this.tipoDeSangre = tipoDeSangre;
    }

    @Override
    public String toString() {
        return super.toString() + "Cumpleaños: " + Cumpleaños + "    " + "peso: " + peso + "libras" + "    " + ", altura: " + altura + "metros "+ "    " + "tipoDeSangre: " + tipoDeSangre;
    }

}
