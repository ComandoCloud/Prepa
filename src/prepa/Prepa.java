package prepa;

public class Prepa {

    public static void main(String[] args) {
        
        Asignatura vecAsigAlum[] = new Asignatura[3];
        Asignatura vecAsigAlum2[] = new Asignatura[3];
        Asignatura vecAsigAlum3[] = new Asignatura[3];
        
        Asignatura oAsi1 = new Asignatura("Matemática I",8,2);
        Asignatura oAsi2 = new Asignatura("Química II",7,3);
        Asignatura oAsi3 = new Asignatura("Literatura I",6,4);
        vecAsigAlum[0] = oAsi1;
        vecAsigAlum[1] = oAsi2;
        vecAsigAlum[2] = oAsi3;
        
        vecAsigAlum2[0] = oAsi1;
        vecAsigAlum2[1] = oAsi2;
        vecAsigAlum2[2] = oAsi3;
        
        vecAsigAlum3[0] = oAsi1;
        vecAsigAlum3[1] = oAsi2;
        vecAsigAlum3[2] = oAsi3;
        
        Asignatura vecAsigDocen[] = new Asignatura[2];
        vecAsigDocen[0]=oAsi1;
        vecAsigDocen[1]=oAsi1;
        
        Asignatura vecAsigDocen2[] = new Asignatura[1];
        vecAsigDocen2[0]=oAsi3;
        
     
        Decano oDecano = new Decano("Liliana","Rathmann","Decana");
        
        Alumno vecAlumnos[] = new Alumno[3];
        
        
        Alumno oAlu1 = new Alumno("Martín","Ruiz",35257969, vecAsigAlum);
        Alumno oAlu2 = new Alumno("Nicolas","Loperz",36625796, vecAsigAlum2);
        Alumno oAlu3 = new Alumno("Maia","Baudry",46625796, vecAsigAlum3);
        vecAlumnos[0]=oAlu1;
        vecAlumnos[1]=oAlu2;
        vecAlumnos[2]=oAlu3;
        
        Docente oDocente= new Docente("Marcos","González","Profesor",vecAsigDocen);
        Docente oDocente2= new Docente("Marina","kiss","Profesora",vecAsigDocen2);
        
        for (int i = 0; i < vecAlumnos.length; i++) {
             System.out.println(vecAlumnos[i].ToString());
        }       
        
    }
    
}
