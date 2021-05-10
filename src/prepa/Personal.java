package prepa;

/**
 *
 * @author Irene
 */
public class Personal {
    private String Nombre;
    private String Apellido;
    private String CargoFuncion;

    
    public Personal(String nom,String ape,String cf){//Contructor
    this.Nombre=nom;
    this.Apellido=ape;
    this.CargoFuncion=cf;
    }
   
    public double Sueldo(){
        return 0;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCargoFuncion() {
        return CargoFuncion;
    }

    public void setCargoFuncion(String CargoFuncion) {
        this.CargoFuncion = CargoFuncion;
    }
    
    
}
