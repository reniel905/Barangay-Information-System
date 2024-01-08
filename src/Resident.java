public class Resident {
    // Static variables for Resident object information
    private String name;
    private int age;
    private String address;
    private String contact;

    public Resident(){


    } 

    // Constructor for Resident object
    public Resident(String name, int age, String address, String contact) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.contact = contact;
    }

    // Gets the name of the Resident
    public String getName() {
        return name;
    }

    // Sets the name of the Resident
    public void setName(String name) {
        this.name = name;
    }

    // Gets the age of the Resident
    public int getAge() {
        return age;
    }

    // Sets the age of the Resident
    public void setAge(int age) {
        this.age = age;
    }

    // Gets the address of the Resident
    public String getAddress() {
        return address;
    }

    // Sets the address of the Resident
    public void setAddress(String address) {
        this.address = address;
    }

    // Gets the contact number of the Resident
    public String getContact() {
        return contact;
    }

    // Sets the contact number of the Resident
    public void setContact(String contact) {
        this.contact = contact;
    }
}

