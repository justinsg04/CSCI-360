import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            ArrayList<Airport> airportList = new ArrayList<>();
            ArrayList<Aircraft> aircraftList = new ArrayList<>();

            Scanner input = new Scanner(new File("Airport.dat"));
            Scanner input2 = new Scanner(new File("Aircraft.dat"));
            while(input.hasNext()) {
                String line = input.nextLine(); // use tempString to hold the line
                String[] tokens = line.split(",");
                Airport a1 = new Airport(tokens[0],tokens[1],Double.parseDouble(tokens[2]),Double.parseDouble(tokens[3]),Double.parseDouble(tokens[4]),tokens[5],tokens[6]);
                airportList.add(a1);
                
            }
            while (input2.hasNext()) {
                String line = input2.nextLine();
                String[] tokens = line.split(", ");
                Aircraft a1 = new Aircraft(tokens[0], tokens[1], tokens[2], Integer.parseInt(tokens[3]), Double.parseDouble(tokens[4]), Integer.parseInt(tokens[5]));
                aircraftList.add(a1);
            }

            for (Airport airport:airportList) {
                System.out.println(airport.name);
            }
            for (Aircraft aircraft:aircraftList) {
                System.out.println(aircraft.model);
            }
            input.close();
            input.close();
        } catch (IOException exc) {
            // TODO: handle exception
            System.out.println(exc.getMessage());
        }

    }

}
