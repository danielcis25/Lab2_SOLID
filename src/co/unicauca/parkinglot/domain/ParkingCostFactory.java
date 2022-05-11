/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.parkinglot.domain;

/**
 * Factoria del cobro de parqueo.
 *
 * @author danielc
 * @version 1.0
 * @since 08/05/2022
 */
public class ParkingCostFactory {

    /**
     * Instancia del cobro de parqueo
     */
    private static ParkingCostFactory instance;

    /**
     * Metodo que devuelve la instancia del cobro por el parqueo
     *
     * @return La instancia del cobro de parqueo actual
     */
    public static ParkingCostFactory getInstance() {
        if (instance == null) {
            instance = new ParkingCostFactory();
        }
        return instance;
    }
}
