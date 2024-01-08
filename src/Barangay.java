import java.util.ArrayList;

public abstract class Barangay {

    public static Resident resident;

    public abstract void add(Official official);
    public abstract void remove(Official official);
    public abstract void add(Resident resident);
    public abstract void remove(Resident resident);
    public abstract String displayResident();
    public abstract String displayOfficial();
    public void register(){



    };

}
