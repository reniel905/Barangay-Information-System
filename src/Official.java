public class Official extends Resident{

    private String position;

    public Official(String name, int age, String address, String contact, String position) {
        super(name, age, address, contact);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
