package prepa;
/**
 *
 * @author Irene
 */
public class Docente extends Personal  implements IHorasFacultad{
    private Asignatura mAsignatura[];
    
    public Docente (String nom,String ape, String cf,Asignatura mAsi[]){
        super(nom,ape,cf);// llama al constructor padre (clase personal)
        this.mAsignatura = mAsi;
    }
    
    @Override
    public double CantHorasMensuales() {
        return 0;
    }

    public Asignatura[] getmAsignatura() {
        return mAsignatura;
    }

    public void setmAsignatura(Asignatura[] mAsignatura) {
        this.mAsignatura = mAsignatura;
    }
    
}
