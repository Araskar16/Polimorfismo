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
public class Poliformismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Edificio edificio = new Edificio ("celaya", 10);
        System.out.println(edificio.getDatos());
        
        Edificio edificio_poli = new Departamento ("celaya", 12, 10, 4);
        System.out.println(edificio_poli.getDatos());
        
        
    }
    
    
    
}
