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

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public long getDni() {
        return Dni;
    }

    public void setDni(long Dni) {
        this.Dni = Dni;
    }

    public Asignatura[] getmAsignaturas() {
        return mAsignaturas;
    }

    public void setmAsignaturas(Asignatura[] mAsignaturas) {
        this.mAsignaturas = mAsignaturas;
    }

    @Override
    public double CantHorasMensuales() {
        double horas=0;
        for (int i = 0; i < this.mAsignaturas.length; i++) {
          horas = horas + this.mAsignaturas[i].getHorasCursadas();
       }
        return horas;
    }
    
    @Override  
    protected void finalize()   
    {   
        System.out.println("finalize method called");   
    }   
    
    public String ToString (){
        String resultado="";
        for (int i = 0; i < mAsignaturas.length; i++) {
            if(mAsignaturas[i].getNota()>=7)
              resultado= resultado+"\n" + "MATERIA: "+ mAsignaturas[i].getNombre()+ " NOTA: "+ mAsignaturas[i].getNota();       
        }
        return resultado;
    }
    /**no realizamos el punto e pq nos pide volver a usar el método ToString 
     que ya utilizamos para el punto d.e- Mostrar para cada alumno su promedio 
     y las horas cursadas(utilizar el método
       toString) .
     */
}
