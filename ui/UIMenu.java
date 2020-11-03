package ui;

import model.Doctor;
import model.Patient;
import model.User;

import java.nio.channels.SelectableChannel;
import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {

    public static final String[] MONTHS = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre","Octubre","Noviembre", "Diciembre"};
    public static Doctor doctorLogged;
    public  static Patient patientLogged;

    private static void printOpc(){
        System.out.println("1- Options of Doctor");
        System.out.println("2- Options of Patient");
        System.out.println("3- Options of Nurse");
        System.out.println("0- Exit");
    }


    public static void showMainMenu() {


        int res;

        do {
            printOpc();
            Scanner sc  = new Scanner(System.in);
            res = Integer.valueOf(sc.nextLine());
        switch (res){
            case 1:
                authUser(1);
                break;
            case 2:
                authUser(2);
                break;
            case 3:
                System.out.println("Nurse Menu");
                break;
            case 0:
                System.out.println("Bye...");
                break;
            default:
                System.out.println("Please select a proper answer");
        }
        }while (res != 0);
    }



    private static void authUser(int userType){
        // userType = 1 Doctor
        // userType = 2 Patient

        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Alejandro Andrade", "alejandro@mail.com"));
        doctors.add(new Doctor("Rocio Avila", "rocio@mail.com"));
        doctors.add(new Doctor("Humberto Hugo", "humberto@mail.com"));



        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Alejandro Soriano", "soriano@mail.com"));
        patients.add(new Patient("Mario Antonieta", "mario@mail.com"));
        patients.add(new Patient("Shale Vale", "shale@mail.com"));



        boolean emailCorrect = false;
        do {
            System.out.println("Insert your email: [a@a.com]");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();
            System.out.println(email);
            if(userType == 1) {
                for (int i = 0; i <= doctors.size(); i++) {
                    if (doctors.get(i).getEmail().equals(email)) {
                        emailCorrect = true;
                        doctorLogged = doctors.get(i);
                        UIDoctorMenu.showDoctorMenu();
                        break;
                    }
                }
            }
            else if(userType == 2) {
                for (Patient p : patients) {
                    if (p.getEmail().equals(email)) {
                        emailCorrect = true;
                        patientLogged = p;
                        UIPatientMenu.showPatientMenu();
                        break;
                    }
                }
            }
        }while(!emailCorrect);
    }
}
