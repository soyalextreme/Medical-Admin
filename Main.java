import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import static ui.UIMenu.*;
import static  inputs.InputInt.*;

public class Main {


    public enum Level{
       LOW,
       MEDIUM,
       HIGH,
    }


    public static void main(String[] args) {
        showMainMenu();
        Doctor newDoc = new Doctor("Alejandro", "Andrade", "alex@doctor.com");
        newDoc.addAvailableAppointment(new Date(), "3pm");
        newDoc.addAvailableAppointment(new Date(), "5pm");
        newDoc.addAvailableAppointment(new Date(), "7pm");

        for (Doctor.AvalableAppointment appointment: newDoc.getAvalableAppointments()) {
            System.out.println(appointment.getDate());
            System.out.println(appointment.getTime());

        }



        Patient newPatient = new Patient("Humberto", "Garcia","humberto@patient.com");
        Patient newPatient2 = new Patient("Alex", "Andrade","alex@patient.com");


        int age = inputInt("Give me your Age: ", 18, 150, 18);


        Level myVar = Level.MEDIUM;
        System.out.println(myVar);

        ArrayList<Patient> patients = new ArrayList<Patient>();
        patients.add(newPatient);
        patients.add(newPatient2);

        for(int i = 0; i < patients.size() ; i++){
            String name = patients.get(i).getName();
            System.out.println(name);
        }

    }

}
