import java.util.ArrayList;

public class Data extends Barangay {

    public static ArrayList<Resident> residentList = new ArrayList<Resident>();
    public static ArrayList<Official> officialList = new ArrayList<Official>();

    @Override
    public void add(Official official) {

        officialList.add(official);

    }

    @Override
    public void remove(Official official) {


    }

    @Override
    public void add(Resident resident) {

        residentList.add(resident);

    }

    @Override
    public void remove(Resident resident) {

    }

    @Override
    public String display() {

        for (Resident i: residentList) {

            //display list of residents
        }

        return null;
    }

}
