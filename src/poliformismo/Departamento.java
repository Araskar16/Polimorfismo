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
public class Departamento extends Edificio {
    
    private int numero_interior;
       private int numero_cuarto;

    public Departamento(String direccion, int piso,
                        int nuemero_interio,
                        int numero_cuarto) {
        super(direccion, piso);
        this.numero_interior = numero_interior;
        this.numero_cuarto = numero_cuarto;
        
    }

    public int getNumero_interior() {
        return numero_interior;
    }

    public void setNumero_interior(int numero_interior) {
        this.numero_interior = numero_interior;
    }

    public int getNumero_cuarto() {
        return numero_cuarto;
    }

    public void setNumero_cuarto(int numero_cuarto) {
        this.numero_cuarto = numero_cuarto;
    }
    @Override
    public String getDatos(){
            return "Direccion: " + getDireccion () +
                    " numero interio: " + numero_interior +"numero_cuarto: "+ 
                    numero_cuarto;        
    }
 
    
    
}
