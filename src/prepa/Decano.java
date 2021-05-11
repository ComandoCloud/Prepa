
package prepa;

public class Decano extends Personal implements IHorasFacultad {
    
    public Decano(String nom, String ape, String cf){
        super(nom,ape,cf);        
    }

    @Override
    public double CantHorasMensuales() {
        return 120;
    }
}

