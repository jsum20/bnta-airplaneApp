package com.planeApp.Booking;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;

public class BookingSaved {
    public static void userDetails(String name, String email, String phoneNumber, int passportNumber) throws IOException {
        FileWriter myWriter = new FileWriter("UserBooking.txt");
        myWriter.write("Name: " + name);
        myWriter.write(System.getProperty("line.separator"));
        myWriter.write("Email: " + email);
        myWriter.write(System.getProperty("line.separator"));
        myWriter.write("Mobile Number: " + phoneNumber);
        myWriter.write(System.getProperty("line.separator"));
        myWriter.write("Passport Number: " + passportNumber);
        myWriter.close();
    }

    public static void flightDetails(int flightNumber, String origin, String destination) throws IOException {
        FileWriter myWriter = new FileWriter("FlightBooking.txt");
        myWriter.write("Flight Number: " + flightNumber);
        myWriter.write(System.getProperty("line.separator"));
        myWriter.write("Origin of Flight: " + origin);
        myWriter.write(System.getProperty("line.separator"));
        myWriter.write("Destination: " + destination);
        myWriter.write(System.getProperty("line.separator"));
        myWriter.close();
    }
}
