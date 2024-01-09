import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Data extends Barangay {

    public static HashSet<Resident> residentList = new HashSet<>();
    public static HashSet<Official> officialList = new HashSet<>();
    Scanner input = new Scanner(System.in);

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

        int count = 0;

        for (Resident i: residentList) {

            count += 1;

            //display list of residents
            System.out.println(
                    "=======================================" +
                            "\n" + count + "." +
                            "\n" + "Name: " + i.getName() +
                            "\n" + "Age: " + i.getAge() +
                            "\n" + "Address: " + i.getAddress() +
                            "\n" + "Contact: " + i.getContact() +
                            "\n"
            );

            System.out.println("Enter [" + count + "] to edit this data." + "\n");

        }

        System.out.println("Enter [0] to go back to menu. ");

        int edit = input.nextInt();

        if (edit > 0 && edit < residentList.size() + 1){

            System.out.println(
                    "Choose what to do with the data" + "\n" +
                            "1. Remove" + "\n" +
                            "2. Edit"
                    );

            int option = input.nextInt();

            if (option == 1){

                // remove the data from the hashset

            } else if (option == 2) {

                System.out.println(
                        "Choose what do you want to change." + "\n" +
                                "1. Name" + "\n" +
                                "2. Age" + "\n" +
                                "3. Address" + "\n" +
                                "4. Contact" + "\n"
                        );

                // edit data

                int editOption = input.nextInt();

                switch (editOption){

                    case 1:

                        // edits the name

                        Iterator<Resident> i = residentList.iterator();

                        while (i.hasNext()) {
                            Resident resident1 = i.next();

                                if (residentList.toArray()[edit - 1] == resident1){

                                    System.out.println("Enter new Name: ");
                                    resident1.setName(new String(input.next()));
                                    input.next();
                                    Resident updatedResName = new Resident(resident1.getName(), resident1.getAge(), resident1.getAddress(), resident1.getContact());
                                    i.remove();
                                    residentList.add(updatedResName);
                                    break;

                                }

                        }

                        break;
                    case 2:
                        // edits the age
                        break;
                    case 3:
                        // edits the address
                        break;
                    case 4:
                        // edits the contact number
                        break;

                }

            }

        } else {

            new Menu();

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
