/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myTest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    @Marker
    public static void main(String[] args) {
        // TODO code application logic here
        List<Train> a = new ArrayList();

        try {
            a.add(new Train("Debrecen", "Szeged", LocalTime.of(10, 07), LocalTime.of(13, 15), TrainType.NORMAL));
            a.add(new Train("Debrecen", "Budapest", LocalTime.of(10, 53), LocalTime.of(14, 30), TrainType.IC));
            a.add(new Train("Debrecen", "Budapest", LocalTime.of(10, 34), LocalTime.of(13, 32), TrainType.NORMAL));
        } catch (WrongTimeException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Current List train");
        PrintAll(a);

        String depFrom;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nPlease Enter Train Departure stop");
        depFrom = sc.nextLine();
        a.get(0).setDepartsFrom(depFrom);
        System.out.println("\nList after Change first Stop");
        PrintAll(a);

        System.out.println("\nSorted By Departure Time");
        new MyHandler().printSortedByDepartureTime(a);
        PrintAll(a);

        System.out.println("\nSorted By Departure Station (ignoring Upper/Lower letters)");
        a = new MyHandler().getSortedByDepartureStation(a);
        PrintAll(a);

        
        FileOutputStream fos;
        ObjectOutputStream oos;
        try {
            fos = new FileOutputStream("trainList.ser");
            oos = new ObjectOutputStream(fos);
          
            
            // oos.writeObject(a);
           //for (Train train : a) { oos.writeObject(train);}
            fos.close();
            oos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("\ntrain arrive budapest before 14");
        BudapestTrains(a);
      
    }

    private static void PrintAll(List<Train> a) {
        for (Train train : a) {
            System.out.println(train);
        }
    }
    
    
  /*
        filter buda
        filter before 14
        map upper
         */
    private static void BudapestTrains(List<Train> a) {
        a.stream()
                .filter((p) -> p.getArrivesTo().equals("Budapest"))
                .filter((p) -> p.getArrivalTime().isBefore(LocalTime.of(14, 0)))
                .map((p) -> p.getDepartsFrom().toUpperCase())
                .forEach(System.out::println);
    }

}
