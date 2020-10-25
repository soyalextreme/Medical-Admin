package model;

public class User {
    private int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;if (phoneNumber.length() != 10){
            System.out.println("Invalid Number");
        }else{
            String phone = "+52" + phoneNumber;
            this.phoneNumber = phone;
            System.out.println("Phone Updated");
        }
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }


    // sobre escritura del metodo
    @Override
    public String toString() {
        return "model.User: " + name +  " Email: " + email + "\nAddress: " + address + " Phone: " + phoneNumber ;
    }
}
