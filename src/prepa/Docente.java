package prepa;
/**
 *
 * @author Irene
 */
public class Docente extends Personal  implements IHorasFacultad{
    private Asignatura mAsignatura[];
    
    public Docente (String nom,String ape, String cf,Asignatura mAsi[]){
        
    }
    
    @Override
    public double CantHorasMensuales() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Asignatura[] getmAsignatura() {
        return mAsignatura;
    }

    public void setmAsignatura(Asignatura[] mAsignatura) {
        this.mAsignatura = mAsignatura;
    }
    
}
