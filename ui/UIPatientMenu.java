package ui;

import model.Doctor;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UIPatientMenu {

    public static void showPatientMenu(){
        int response = 0;

        do{
            System.out.println("\n\n");
            System.out.println("PATIENT");
            System.out.println("Welcome " + UIMenu.patientLogged.getName());
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Logout");
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    showBookAppointmentMenu();
                    break;
                case 2:
                    showPatientMyAppointment();
                    break;
                case 0:
                    UIMenu.showMainMenu();
                    break;
            }


        }while (response != 0);
    }

    private static void showBookAppointmentMenu(){
      int response = 0;
      do{
          System.out.println(":: Book an appointment");
          System.out.println(":: Select a date: ");
          //Numeracion de la lista de fechas
          // Indice de la fecha que seleccione nuestro usuario
          // [doctors]
          // - Doctor 1
                // - 1 Fecha1
                // - 2 Fecha2
          // - Doctor 2
          // - Doctor 3
          Map<Integer, Map<Integer, Doctor>> doctors= new TreeMap<>();
          int k = 0;
          for(int i = 0; i < UIDoctorMenu.doctorsAvailableAppointment.size() ; i++){
              ArrayList<Doctor.AvalableAppointment> avalableAppointments = UIDoctorMenu.doctorsAvailableAppointment.get(i).getAvalableAppointments();
              Map<Integer, Doctor> doctorAppointments = new TreeMap<>();

              for(int j = 0; j < avalableAppointments.size(); j++){
                  k++;
                  System.out.println(k + ". " + avalableAppointments.get(j).getDate());
                  doctorAppointments.put(Integer.valueOf(j), UIDoctorMenu.doctorsAvailableAppointment.get(i));
                  doctors.put(Integer.valueOf(k), doctorAppointments);
              }
          }

          Scanner sc = new Scanner(System.in);
          int responseDateSelected = Integer.valueOf(sc.nextLine());
          Map<Integer, Doctor> doctorAvailableSelected = doctors.get(responseDateSelected);
          Integer indexDate = 0;
          Doctor doctorSelected = new Doctor("", "");

          for (Map.Entry<Integer, Doctor> doc :doctorAvailableSelected.entrySet()) {
              indexDate = doc.getKey();
              doctorSelected = doc.getValue();
          }

          System.out.println(doctorSelected.getName() + ". Date: " + doctorSelected.getAvalableAppointments().get(indexDate).getTime() + ". Time: " + doctorSelected.getAvalableAppointments().get(indexDate).getTime());

          System.out.println("Confirm your appointment:\n 1. Yes\n 2. Change Data");
          response = Integer.valueOf(sc.nextLine());

          if (response == 1){
              UIMenu.patientLogged.addAppointmentDoctors(doctorSelected, doctorSelected.getAvalableAppointments().get(indexDate).getDate(null), doctorSelected.getAvalableAppointments().get(indexDate).getTime());
              showPatientMenu();
          }


      }while (response != 0);
    }


    private static void showPatientMyAppointment(){
        int response = 0;
        do {
            System.out.println(":: My appointments");

            if(UIMenu.patientLogged.getAppointmentDoctors().size() == 0){
                System.out.println("Dont have appointments");
                break;
            }

            for(int i = 0; i < UIMenu.patientLogged.getAppointmentDoctors().size(); i++){
                int j = i + 1;
                System.out.println(j + ". " +
                        "DATE: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getDate() +
                        " TIME: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getTime() +
                        "\nDOCTOR: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getDoctor().getName()
                        );
            }

            System.out.println("0. RETURN");
        }while (response != 0);
    }
}
