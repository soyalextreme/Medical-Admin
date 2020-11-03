package model;

import javax.management.ConstructorParameters;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {

   private static final String FORMAT_NAME = "Name OtherName";
   private String speciality;




   /**
    * First Constructor
    * @param  name String the name of the doctor
    */
   public Doctor(String name, String email){
      super(name, email);
   }

   // Getters

   public String getSpeciality() {
      return speciality;
   }

   public void setSpeciality(String speciality) {
      this.speciality = speciality;
   }


   // Methods

   public void showFullName(){
      System.out.println(super.getName());
   }



   // Static Methods
   public static void describe(){
      System.out.println("Class model.Doctor Attributes: name, lastname, id, specially");
   }


   public static void describeName(){
      System.out.println(FORMAT_NAME);
   }



   private ArrayList<AvalableAppointment> availableAppointments = new ArrayList<AvalableAppointment>();

   public void addAvailableAppointment(String date, String time){

      availableAppointments.add(new Doctor.AvalableAppointment(date, time));
   }

   public ArrayList<AvalableAppointment> getAvalableAppointments(){
      return availableAppointments;
   }


   // class Added
   public  static class AvalableAppointment{
      private int id;
      private Date date;
      private String time;
      SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

      AvalableAppointment(String date, String time){

         try {
            this.date = format.parse(date);
         }catch (ParseException e){
            e.printStackTrace();
         }
         this.time = time;
      }

      public Date getDate(String DATE ){
         return date;
      }

      public String getDate(){
         return format.format(date);

      }

      public void setDate(Date date) {
         this.date = date;
      }

      public String getTime() {
         return time;
      }

      public void setTime(String time) {
         this.time = time;
      }

      @Override
      public String toString() {
         return "Available Appointments \nDate: " + date + "\nTime: " + time;
      }

   }


   @Override
   public void showDataUser() {
      System.out.println("Speciality: " + speciality);
      System.out.println("Department: 123123");
      System.out.println("Hospital: Cruz Roja de Mexico");
   }

   @Override
   public String toString() {
      System.out.println("DOCTOR REPORT");
      return super.toString() + "Speciality: " + speciality + " Available: " + availableAppointments.toString();
   }
}

