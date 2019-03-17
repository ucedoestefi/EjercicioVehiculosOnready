package ejercicioonready.vehiculo.auto;

import ejercicioonready.vehiculo.Vehiculo;

/**
 *
 * @author Mayra Estefania Ucedo
 */
public class Auto extends Vehiculo{
    private int puertas;
   
    public Auto(String marca, String modelo, int puertas, double precio) {
        super(marca, modelo, precio);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    
    public String toString() {
        return "Marca: " + this.getMarca() + "//"+ "Modelo: "+ this.getModelo() + "//"+ "Puertas: " +
                this.getPuertas() + "//"+ "Precio: "+ this.getPrecio();
    }

}
