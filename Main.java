import model.Doctor;
import model.ISchedulable;
import model.Patient;
import model.User;

import java.util.Date;

import static ui.UIMenu.*;

public class Main {




    public static void main(String[] args) {
        showMainMenu();
//        Doctor newDoc = new Doctor("Alejandro Andrade", "alex@platzi.com");
//        newDoc.addAvailableAppointment(new Date(), "3pm");
//        newDoc.addAvailableAppointment(new Date(), "5pm");
//        newDoc.addAvailableAppointment(new Date(), "7pm");

//        for (Doctor.AvalableAppointment appointment: newDoc.getAvalableAppointments()) {
//            System.out.println(appointment.getDate());
//            System.out.println(appointment.getTime());
//
//        }



        // polimorfismo para instanciar la class user
//        User user = new Doctor("Alejandro", "alex.anso.17@gmail.com");
//        user.showDataUser();
//
//        User newPatient = new Patient("Humberto","humberto@patient.com");
//        newPatient.showDataUser();
//
//
//        User user3 = new User("Alejandro Andrade", "alex@alex.com") {
//            @Override
//            public void showDataUser() {
//                System.out.println("Anon class temporary");
//                System.out.println(super.getName());
//            }
//        };
//
//
//        user3.showDataUser();
//
//
//        ISchedulable iSchedulable =  new ISchedulable() {
//            @Override
//            public void schedule(Date date, String time) {
//                System.out.println("Anonim Class:");
//                System.out.println(date + time);
//            }
//        };
//

//        System.out.println(newPatient);
//        System.out.println(newDoc);
        showMainMenu();

    }

}
