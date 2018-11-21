/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poliformismo;

/**
 *
 * @author soporte
 */
public class Edificio {
    private String direccion;
    private int piso;

    public Edificio(String direccion, int piso) {
        this.direccion = direccion;
        this.piso = piso;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }
    public String getDatos(){
        return "direccion: " + direccion + "pisos: " + piso ;
    }
 
    
    
}
