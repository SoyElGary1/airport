package com.airport.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Airport {

    private int totalCapacity;
    private static final Aircraft[] listAircraft = new Aircraft[100];
    private int numberOfGates;
    private String operatingStatus;

    public Airport() {

    }

    public Airport(int totalCapacity, int numberOfGates, String operatingStatus) {
        this.totalCapacity = totalCapacity;
        this.numberOfGates = numberOfGates;
        this.operatingStatus = operatingStatus;
    }

    public int getTotalCapacity() {
        return totalCapacity;
    }

    public void setTotalCapacity(int totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

    public static Aircraft[] getListAircraft() {
        return listAircraft;
    }

    public int getNumberOfGates() {
        return numberOfGates;
    }

    public void setNumberOfGates(int numberOfGates) {
        this.numberOfGates = numberOfGates;
    }

    public String getOperatingStatus() {
        return operatingStatus;
    }

    public void setOperatingStatus(String operatingStatus) {
        this.operatingStatus = operatingStatus;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "totalCapacity=" + totalCapacity +
                ", listAricraft=" + Arrays.toString(listAircraft) +
                ", numberOfGates=" + numberOfGates +
                ", operatingStatus='" + operatingStatus + '\'' +
                '}';
    }
}
