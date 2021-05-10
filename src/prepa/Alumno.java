/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepa;

/**
 *
 * @author Maximiliano Kiss
 */
public class Alumno implements IHorasFacultad {
    private String Nombre;
    private String Apellido;
    private long Dni;
    private Asignatura mAsignaturas[];

    public Alumno(){
        
    }
    
    public Alumno(String nom, String ape, long dni, Asignatura mAsig[]){
        Nombre = nom;
        Apellido = ape;
        Dni = dni;
        mAsignaturas = mAsig;
    }
    
    public double Promedio(){
        
        double acumulador=0;
         for (int i = 0; i < this.mAsignaturas.length; i++){
           acumulador = acumulador + this.mAsignaturas[i].getNota();
       }
       return acumulador / this.mAsignaturas.length;
     
    }
    
   public void AsignaturaAprobada(){
       
       for (int i = 0; i < this.mAsignaturas.length; i++) {
           if(this.mAsignaturas[i].getNota()>=7)
               System.out.println("Aprobado");
           else
                System.out.println("Desaprobado");
       }
   }
    
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Apellido
     */
    public String getApellido() {
        return Apellido;
    }

    /**
     * @param Apellido the Apellido to set
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    /**
     * @return the Dni
     */
    public long getDni() {
        return Dni;
    }

    /**
     * @param Dni the Dni to set
     */
    public void setDni(long Dni) {
        this.Dni = Dni;
    }

    /**
     * @return the mAsignaturas
     */
    public Asignatura[] getmAsignaturas() {
        return mAsignaturas;
    }

    /**
     * @param mAsignaturas the mAsignaturas to set
     */
    public void setmAsignaturas(Asignatura[] mAsignaturas) {
        this.mAsignaturas = mAsignaturas;
    }

    @Override
    public double CantHorasMensuales() {
        double horas=0;
        for (int i = 0; i < this.mAsignaturas.length; i++) {
          horas = horas + this.mAsignaturas[i].getHorasCursadas();
       }
        return horas+40;
    }
    
    @Override  
    protected void finalize()   
    {   
        System.out.println("finalize method called");   
    }   
    
    
   
    
}
