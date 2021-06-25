package models;

public class ShippingDetails {
    private String flightNumber;
    private int arrivalTime;
    private int customDuty;
    private int containerNumber;

    public ShippingDetails(String flightNumber,int arrivalTime,int customDuty,int containerNumber){
        this.flightNumber=flightNumber;
        this.arrivalTime=arrivalTime;
        this.customDuty=customDuty;
        this.containerNumber=containerNumber;



    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getCustomDuty() {
        return customDuty;
    }

    public void setCustomDuty(int customDuty) {
        this.customDuty = customDuty;
    }

    public int getContainerNumber() {
        return containerNumber;
    }

    public void setContainerNumber(int containerNumber) {
        this.containerNumber = containerNumber;
    }
}
