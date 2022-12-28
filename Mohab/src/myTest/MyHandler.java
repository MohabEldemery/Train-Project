/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myTest;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author student
 */
public class MyHandler implements TrainListHandler {

    @Override
    public void printSortedByDepartureTime(List<Train> tList) {
        tList.sort((p1, p2) -> p1.getDepartureTime().compareTo(p2.getDepartureTime()));
    }
    
    
    @Override
    public List<Train> getSortedByDepartureStation(List<Train> tList) {
        
        tList.sort((p1, p2) -> p1.getDepartsFrom().compareToIgnoreCase(p2.getDepartsFrom()) );
        return tList;

    }

}
