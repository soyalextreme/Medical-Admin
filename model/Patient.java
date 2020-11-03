package model;

import model.User;

import java.util.ArrayList;
import java.util.Date;

public class Patient extends User {

    private String birthday;
    private double weight;
    private double height;
    private String blood;

    private ArrayList<AppointmentDoctor> appointmentDoctors = new ArrayList<>();
    private  ArrayList<AppointmentNurse> appointmentNurses = new ArrayList<>();

    public Patient(String name, String email){
        super(name, email);
    }

    public String getBirthday() {
        return birthday;
    }

    public ArrayList<AppointmentDoctor> getAppointmentDoctors() {
        return appointmentDoctors;
    }

    public void addAppointmentDoctors(Doctor doctor, Date date, String time) {
        AppointmentDoctor appointmentDoctor = new AppointmentDoctor(this , doctor);
        appointmentDoctor.schedule(date, time);
        appointmentDoctors.add(appointmentDoctor);
    }

    public ArrayList<AppointmentNurse> getAppointmentNurses() {
        return appointmentNurses;
    }

    public void setAppointmentNurses(ArrayList<AppointmentNurse> appointmentNurses) {
        this.appointmentNurses = appointmentNurses;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getWeight() {
        return weight + "kg.";

    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height + "mts.";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    @Override
    public void showDataUser() {
        System.out.println("Paciente!");
        System.out.println("Allergies:  To peniciline");
    }

    @Override
    public String toString() {
        System.out.println("PATIENT REPORT:x");
        return super.toString() + "\nBirthday: " + getBirthday() + " Weight: " + getWeight() +  "\nHeigh: " + getHeight() + " Blood: " + blood;
    }
}
