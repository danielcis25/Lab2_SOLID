/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.parkinglot.domain;

import java.time.LocalDateTime;

/**
 * Interfaz de Cobro de parqueadero. Utiliza el patrón de diseño Strategy
 *
 * @author danielc
 * @version 1.0
 * @since 08/05/2022
 */
public interface IParkingCost {

    int calculateCost(LocalDateTime input, LocalDateTime output);
}
