/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.parkinglot.domain;

import java.time.LocalDateTime;
import java.util.Random;

/**
 * Cobro de parqueadero para un vehiculo de tipo Camion. Utiliza el patrón de diseño Strategy
 *
 * @author danielc
 * @version 1.0
 * @since 08/05/2022
 */
public class TruckParkingCost implements IParkingCost {

    /**
     * Metodo que devuelve el cobro de parqueado para un vehiculo Camion
     *
     * @param input Fecha de entrada del vehiculo Camion
     * @param output Fecha de salida del vehiculo Camion
     * @return El cobro de parqueo para el vehiculo Camion según la logica del
     * negocio
     */
    @Override
    public int calculateCost(LocalDateTime input, LocalDateTime output) {
        Random rnd = new Random();
        int camionero = rnd.nextInt(10);
        int rifa = rnd.nextInt(10);

        int Tarifa = 0;
        int d_inicio = input.getDayOfMonth();
        int d_fin = output.getDayOfMonth();
        int h_inicio = input.getHour();
        int h_fin = output.getHour();
        int tmparqueo_d = d_fin - d_inicio;
        int tmparqueo_h = h_fin - h_inicio;
        int tmparqueo_t = (tmparqueo_h * 15000) / 24;
        if (Math.floorMod(tmparqueo_t, 100) != 0) {
            double parteEntera = tmparqueo_t / 100;
            tmparqueo_t = ((int) parteEntera + 1) * 100;
        }
        if (tmparqueo_h <= 12 && tmparqueo_d == 0) {
            Tarifa = 10000;
        } else if (tmparqueo_h >= 12 && tmparqueo_h < 24) {
            Tarifa = 15000;
        } else if (tmparqueo_d > 0 && tmparqueo_h > 0) {
            System.out.println("Boleta #: " + camionero + " | Boleto ganador: " + rifa);
            if (camionero == rifa) {
                Tarifa = 0;
                //System.out.println("Boleto del camión: " + camionero + " | Boleto ganador: " + baloto );
                System.out.println("Ganador del Sorteo,No debe pagar nada por el servicio de parqueo.");
            } else {
                Tarifa = (15000 * tmparqueo_d) + tmparqueo_t;
                System.out.println("Sigue intentando.");
            }
        }
        return Tarifa;
    }
}
