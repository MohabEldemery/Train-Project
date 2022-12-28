/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myTest;

import java.time.LocalTime;

/**
 *
 * @author student
 */
public class Train {
    private String departsFrom;
    private String arrivesTo;
    private LocalTime departureTime;
    private LocalTime arrivalTime;
    private TrainType type;

    public Train(String departsFrom, String arrivesTo, LocalTime departureTime, LocalTime arrivalTime, TrainType type) throws WrongTimeException {
        this.departsFrom = departsFrom;
        this.arrivesTo = arrivesTo;
        if (arrivalTime.isBefore(departureTime))
            throw  new WrongTimeException();
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.type = type;
    }

    public Train() {
    }

    
    
    public String getDepartsFrom() {
        return departsFrom;
    }

    public void setDepartsFrom(String departsFrom) {
        this.departsFrom = departsFrom;
    }

    public String getArrivesTo() {
        return arrivesTo;
    }

    public void setArrivesTo(String arrivesTo) {
        this.arrivesTo = arrivesTo;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) throws WrongTimeException {
        if (arrivalTime.isBefore(departureTime))
            throw  new WrongTimeException();
        this.departureTime = departureTime;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalTime arrivalTime) throws WrongTimeException {
        if (arrivalTime.isBefore(departureTime))
            throw  new WrongTimeException();
        this.arrivalTime = arrivalTime;
    }

    public TrainType getType() {
        return type;
    }

    public void setType(TrainType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Train{" + "departsFrom=" + departsFrom + ", arrivesTo=" + arrivesTo + ", departureTime=" + departureTime + ", arrivalTime=" + arrivalTime + ", type=" + type + '}';
    }
    
    
}
