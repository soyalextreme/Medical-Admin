public class Doctor {

   private static final String FORMAT_NAME = "Name OtherName";
   static int currentId = 0;
   int id;
   String name;
   String lastName;
   String speciality;

   /**
    * First Constructor
    * @param  name String the name of the doctor
    * @param lastName String the lastname of the doctor
    */
   Doctor(String name, String lastName){
      this.name = name;
      id= ++currentId;
      this.lastName = lastName;
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
}

