/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepa;

/**
 *
 * @author Irene
 */
public class Asignatura {
    private String Nombre;
    private double Nota;
    private int HorasCursadas;  

    /**
     * @return the Nombre
     */
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
     * @return the Nota
     */
    public double getNota() {
        return Nota;
    }

    /**
     * @param Nota the Nota to set
     */
    public void setNota(double Nota) {
        this.Nota = Nota;
    }

    /**
     * @return the HorasCursadas
     */
    public int getHorasCursadas() {
        return HorasCursadas;
    }

    /**
     * @param HorasCursadas the HorasCursadas to set
     */
    public void setHorasCursadas(int HorasCursadas) {
        this.HorasCursadas = HorasCursadas;
    }
}
