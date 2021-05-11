package prepa;
/**
 *
 * @author Irene
 */
public class Docente extends Personal  implements IHorasFacultad{
    private Asignatura mAsignaturas[];
    
    public Docente (String nom,String ape, String cf,Asignatura mAsi[]){
        super(nom,ape,cf);// llama al constructor padre (clase personal)
        this.mAsignaturas = mAsi;
    }
    
    @Override
    public double CantHorasMensuales() {
         double horas=0;
        for (int i = 0; i < this.mAsignaturas.length; i++) {
          horas = horas + this.mAsignaturas[i].getHorasCursadas();
       }
        return horas+40;//es 40 pq son 10 hs semanales de investigación en un mes son 40
    }

    public Asignatura[] getmAsignatura() {
        return mAsignaturas;
    }

    public void setmAsignatura(Asignatura[] mAsignatura) {
        this.mAsignaturas = mAsignatura;
    }

}
