package com.airport.service;

import com.airport.model.Aircraft;
import com.airport.model.Airport;
import com.airport.model.StatusEnum;

public class AirportService {
    private static Aircraft[] lista = Airport.getListAircraft();

    static {

        Aircraft aircraft = new Aircraft("hola",
                10,
                StatusEnum.IN_MAINTENANCE,
                5);

        Aircraft aircraft2 = new Aircraft("holadw2",
                10,
                StatusEnum.IN_MAINTENANCE,
                5);

        Aircraft aircraft3 = new Aircraft("hola",
                10,
                StatusEnum.IN_FLIGHT,
                5);

        lista[0] = aircraft;
        lista[1] = aircraft2;
        lista[2] = aircraft3;

    }

    public static void aircraftAvailability() {

        for (int i = 0; i < lista.length; i++) {
            if (lista[i] != null) {
                System.out.println();
                System.out.println("The aircrafts status\n"
                        + "ID: " + lista[i].getId() + " " + lista[i].getCurrentStatus());
            }
        }
    }
}
