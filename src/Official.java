public class Official extends Resident{
    // Brgy. Official information also inherits the information of the Resident object (e.g., Name, Address, etc.)
    private String position;

    // Constructor for the Brgy. Official object
    public Official(String name, int age, String address, String contact, String position) {
        super(name, age, address, contact);
        this.position = position;
    }

    // Gets the position of Official
    public String getPosition() {
        return position;
    }

    // Sets the position of Official
    public void setPosition(String position) {
        this.position = position;
    }
}
