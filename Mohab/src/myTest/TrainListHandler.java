/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package myTest;

import java.util.List;

/**
 *
 * @author student
 */
public interface TrainListHandler {

    public void printSortedByDepartureTime(List<Train> tList);

    public List<Train> getSortedByDepartureStation(List<Train> tList);
}
