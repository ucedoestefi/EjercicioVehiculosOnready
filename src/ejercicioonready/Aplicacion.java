package ejercicioonready;

import ejercicioonready.vehiculo.Vehiculo;
import ejercicioonready.vehiculo.auto.Auto;
import ejercicioonready.vehiculo.motocicleta.Motocicleta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Mayra Estefania Ucedo
 * 
 */

    public class Aplicacion {
        private List<Vehiculo> listaVehiculo = new ArrayList<>();
        private List<Vehiculo> listaVehiculoModeloY = new ArrayList<>();
        
        private final String Y = "Y";
    /**
     * Funcion que ejecuta el programa
     */
    public void ejecutar() {
        //Creo lista de vehiculos
        crearListaVehiculo();
        
        //Muestro lista de vehiculos
        mostrarVehiculo();
        //Muestro maximo y minimo por vehiculo mas caro y barato
        System.out.println("=============================");
        Vehiculo maxVehiculo = Collections.max(listaVehiculo);
        System.out.println("Vehiculo mas caro: " + maxVehiculo.getMarca() + " " + maxVehiculo.getModelo());
        Vehiculo minVehiculo = Collections.min(listaVehiculo);
        System.out.println("Vehiculo mas barato: " + minVehiculo.getMarca() + " " + minVehiculo.getModelo());
        
        mostrarVehiculoModeloY();
        System.out.println(" ");
        
        Collections.sort(listaVehiculo, Collections.reverseOrder());
        
        mostrarVehiculo();
    }
    
    public void mostrarVehiculosOrdenados() {
       System.out.println("=============================");
       
       mostrarVehiculosOrdenados();
    }

    //mostrar vehiculos ordenados
    
    public void mostrarVehiculoModeloY() {
        for(int i = 0; i< listaVehiculoModeloY.size(); i++) {
            System.out.println("Vehiculo que contiene en el modelo la letra Y:" + listaVehiculoModeloY.get(i).getMarca() + " " +
            		listaVehiculoModeloY.get(i).getModelo() + " " + listaVehiculoModeloY.get(i).getPrecio());
        }    
    }
    
    public void crearListaVehiculo() {

         listaVehiculo.add(new Auto("Peugeot", "206", 4, 200000));
         listaVehiculo.add(new Motocicleta("Honda", "Titan", 125, 60000));
         listaVehiculo.add(new Auto("Peugeot", "208", 5, 250000));
         listaVehiculo.add(new Motocicleta("Yamaha", "YBR", 160, 80500.50));
         
    }
    
    public void mostrarVehiculo() {
        for(int i = 0; i< listaVehiculo.size(); i++) {
            System.out.println(listaVehiculo.get(i));
            if (listaVehiculo.get(i).getModelo().contains(Y)) {
                listaVehiculoModeloY.add(listaVehiculo.get(i));
            }
        }
    }
}