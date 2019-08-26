/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package He;


/**
 *
 * @author Omar
 */
public class Pcgaming extends PC {
    private String tarjetag;
    private int gbram;
    private int vram;
    private double velpro;
    
    
public Pcgaming(String modelo,
    String marca,
    String procesador,
    String almacenamiento,
    String tarjetag,
     int gbram,
     int vram,
     double velpro){
    super(modelo,marca,procesador,almacenamiento);
    this.tarjetag=tarjetag;
    this.gbram=gbram;
    this.vram=vram;
    this.velpro=velpro;
    
    
}

    public void mostrar() {
        System.out.println("Modelo: "+getModelo()+
                "\nModelo: "+getModelo()+
                "\nProcesador: "+getProcesador()+
                "\nAlmacenamiento: "+getAlmacenamiento()+
                "\nTarjeta Grafica: "+tarjetag+
                "\nRAM: "+gbram+
                "\nVideo RAM: "+vram+
                "\nVelocidad Procesador: "+velpro);//To change body of generated methods, choose Tools | Templates.
    }
}
