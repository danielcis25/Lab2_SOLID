
package co.unicauca.parkinglot.access;

import co.unicauca.parkinglot.domain.Vehicle;
import java.util.List;

/**
 * Interfaz de VehicleRepository
 *
 * @author danielc
 * @version 1.0
 * @since 08/05/2022
 */
public interface IVehicleRepository {

    /**
     * Metodo que guarda un vehiculo
     *
     * @param newVehicle un vehiculo que va a ser guardado
     * @return una respuesta booleana que indica elguardado existoso o con error
     * 
     */
    boolean save(Vehicle newVehicle);

    /**
     * Metodo que lista los vehiculos almacenados
     *
     * @return Un listado con todos los vehiculos almacenados
     */
    List<Vehicle> list();
}
