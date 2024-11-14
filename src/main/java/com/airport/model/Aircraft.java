package com.airport.model;

public class Aircraft {

    private static int contador = 0;
    private int id;
    private String aircraftModel;
    private int totalSeatCapacity;
    private StatusEnum currentStatus;
    private int currentLocation;

    public Aircraft() {

    }

    public Aircraft(
            String aircraftModel,
            int totalSeatCapacity,
            StatusEnum currentStatus,
            int currentLocation) {

        this.id  = Aircraft.contador++;
        this.aircraftModel = aircraftModel;
        this.totalSeatCapacity = totalSeatCapacity;
        this.currentStatus = currentStatus;
        this.currentLocation = currentLocation;

    }

    public int getId() {
        return id;
    }

    public String getAircraftModel() {
        return aircraftModel;
    }

    public void setAircraftModel(String aircraftModel) {
        this.aircraftModel = aircraftModel;
    }

    public int getTotalSeatCapacity() {
        return totalSeatCapacity;
    }

    public void setTotalSeatCapacity(int totalSeatCapacity) {
        this.totalSeatCapacity = totalSeatCapacity;
    }

    public StatusEnum getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(StatusEnum currentStatus) {
        this.currentStatus = currentStatus;
    }

    public int getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(int currentLocation) {
        this.currentLocation = currentLocation;
    }

    private static int generarId() {
        return contador++;
    }

    @Override
    public String toString() {
        return "Aircraft{" + "id='" + id + '\'' + ", aircraftModel='" + aircraftModel + '\'' + ", totalSeatCapacity=" + totalSeatCapacity + ", currentStatus=" + currentStatus + ", currentLocation=" + currentLocation + '}';
    }
}
