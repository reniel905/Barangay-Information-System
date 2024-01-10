public abstract class Barangay {

    public static Resident resident;

    public abstract void add(Official official);

    public abstract void remove(int position, boolean isOfficial);

    public abstract void add(Resident resident);

    public abstract String displayResident();

    public abstract String displayOfficial();

    public void register() {

    };

}
