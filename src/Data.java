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
    public String displayResident() {

        System.out.println("List of barangay residents:");

        for (Resident i: residentList) {

            //display list of residents
            System.out.println(
                    "=======================================" +
                            "\n" + "Name: " + i.getName() +
                            "\n" + "Age: " + i.getAge() +
                            "\n" + "Address: " + i.getAddress() +
                            "\n" + "Contact: " + i.getContact() +
                            "\n"
            );

        }

        return null;
    }

    @Override
    public String displayOfficial() {

        System.out.println("List of barangay officials:");

        for (Official j: officialList) {

            System.out.println(
                    "=======================================" +
                            "\n" + "Name: " + j.getName() +
                            "\n" + "Age: " + j.getAge() +
                            "\n" + "Position: " + j.getPosition() +
                            "\n" + "Address: " + j.getAddress() +
                            "\n" + "Contact: " + j.getContact() +
                            "\n"
            );

        }

        return null;
    }

}
