package prepa;

public class Asignatura {
    private String Nombre;
    private double Nota;
    private int HorasCursadas;  

    public Asignatura(String nom,double nota,int horas){
       
        this.Nombre=nom;
        this.Nota=nota;
        this.HorasCursadas=horas;
    }
    
    public String getNombre() {
        return Nombre;
    }
    
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getNota() {
        return Nota;
    }

    public void setNota(double Nota) {
        this.Nota = Nota;
    }

    public int getHorasCursadas() {
        return HorasCursadas;
    }

    public void setHorasCursadas(int HorasCursadas) {
        this.HorasCursadas = HorasCursadas;
    }
}
