import model.Doctor;
import model.Patient;

import java.util.Date;

import static ui.UIMenu.*;

public class Main {




    public static void main(String[] args) {
        showMainMenu();
        Doctor newDoc = new Doctor("Alejandro Andrade", "alex@platzi.com");
        newDoc.addAvailableAppointment(new Date(), "3pm");
        newDoc.addAvailableAppointment(new Date(), "5pm");
        newDoc.addAvailableAppointment(new Date(), "7pm");

        for (Doctor.AvalableAppointment appointment: newDoc.getAvalableAppointments()) {
            System.out.println(appointment.getDate());
            System.out.println(appointment.getTime());

        }



        Patient newPatient = new Patient("Humberto","humberto@patient.com");

        System.out.println(newPatient);
        System.out.println(newDoc);

    }

}
