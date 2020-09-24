import java.util.ArrayList;
import java.util.Date;

public class Doctor {

   private static final String FORMAT_NAME = "Name OtherName";
   static int currentId = 0;
   int id;
   private String name;
   private String lastName;
   private String email;
   private String speciality;




   /**
    * First Constructor
    * @param  name String the name of the doctor
    * @param lastName String the lastname of the doctor
    */
   Doctor(String name, String lastName, String email){
      this.name = name;
      this.lastName = lastName;
      this.email = email;
      id= ++currentId;
   }
   // Getters

   public String getSpeciality() {
      return speciality;
   }

   public void setSpeciality(String speciality) {
      this.speciality = speciality;
   }

   public void setName(String name){
      this.name = name;
   }

   public String getName(){
      return name;
   }

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

// Methods

   public void showFullName(){
      System.out.println(this.name + " " + this.lastName);
   }

   public void showId(){
      System.out.println(this.id);
   }


   // Static Methods
   public static void describe(){
      System.out.println("Class Doctor Attributes: name, lastname, id, specially");
   }


   public static void describeName(){
      System.out.println(FORMAT_NAME);
   }


   public static void id(){
      System.out.println("ID Doctor: " + currentId);
   }

   private ArrayList<AvalableAppointment> availableAppointments = new ArrayList<AvalableAppointment>();

   public void addAvailableAppointment(Date date, String time){
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

      AvalableAppointment(Date date, String time){
         this.date = date;
         this.time = time;
      }

      public Date getDate() {
         return date;
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
   }
}

