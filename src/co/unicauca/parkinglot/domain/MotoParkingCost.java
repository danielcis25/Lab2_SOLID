/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.parkinglot.domain;

import java.time.LocalDateTime;

/**
 * Cobro del parqueadero para Moto. Utiliza el patrón de diseño Strategy
 *
 * @author danielc
 * @version 1.0
 * @since 08/05/2022
 */
public class MotoParkingCost implements IParkingCost {

    /**
     * Metodo que devuelve el cobro generado por el parqueadero para el vehiculo de tipo Moto
     *
     * @param input Fecha de entrada del vehiculo Moto
     * @param output Fecha de salida del vehiculo Moto
     * @return El cobro de parqueo para el vehiculo Moto según la logica del negocio
     * 
     */
    @Override
    public int calculateCost(LocalDateTime input, LocalDateTime output) {
        int Tarifa = 0;
        int h_inicio = input.getHour();
        int h_fin = output.getHour();
        int min_inicio = input.getMinute();
        int min_fin = output.getMinute();
        int tmparqueo_h = h_fin - h_inicio;
        int tmparqueo_m = (Math.abs(min_inicio - min_fin) * 1000) / 60;
        if (Math.floorMod(tmparqueo_m, 100) != 0) {
            double parteEntera = tmparqueo_m / 100;
            tmparqueo_m = ((int) parteEntera + 1) * 100;
        }
        if (tmparqueo_h < 1) {
            Tarifa = 1000;
        } else if (tmparqueo_h == 1 && tmparqueo_m == 0) {
            Tarifa = 2000;
        } else if (tmparqueo_h == 1 && tmparqueo_m != 0) {
            Tarifa = 2000 + tmparqueo_m;
        } else if (tmparqueo_h > 1) {
            Tarifa = 2000 + (tmparqueo_h - 1) * 1000 + tmparqueo_m;
        }
        return Tarifa;
    }
}
