import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Data extends Barangay {

    public static HashSet<Resident> residentList = new HashSet<>();
    public static HashSet<Official> officialList = new HashSet<>();
    // Scanner input = new Scanner(System.in);

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
        int edit = Integer.parseInt(System.console().readLine("Enter [0] to go back to menu. \n"));

        if (edit > 0 && edit < residentList.size() + 1){
            int option = Integer.parseInt(System.console().readLine("Choose what to do with the data" + "\n" +
                            "1. Remove" + "\n" +
                            "2. Edit" + "\n"));

            if (option == 1){

                // remove the data from the hashset

            } else if (option == 2) {
                // edit data
                int editOption = Integer.parseInt(System.console().readLine("Choose what do you want to change." + "\n" +
                                "1. Name" + "\n" +
                                "2. Age" + "\n" +
                                "3. Address" + "\n" +
                                "4. Contact" + "\n"));

                // Moved here para di iba iba yung variable sa switch-case chuchu check mo kung nagana - Elmer
                Iterator<Resident> i = residentList.iterator();

                switch (editOption){

                    case 1:
                        // edits the name
                        while (i.hasNext()) {
                            Resident resident1 = i.next();

                                if (residentList.toArray()[edit - 1] == resident1){
                                    String newName = System.console().readLine("Enter new name: ");
                                    resident1.setName(new String(newName));
                                    Resident updatedResName = new Resident(resident1.getName(), resident1.getAge(), resident1.getAddress(), resident1.getContact());
                                    i.remove();
                                    residentList.add(updatedResName);
                                    break;

                                }

                        }

                        break;
                    case 2:
                        // edits the age
                        while (i.hasNext()) {
                            Resident resident1 = i.next();

                                if (residentList.toArray()[edit - 1] == resident1){
                                    String newAge = System.console().readLine("Enter new age: ");
                                    resident1.setAge(new String(newAge));
                                    Resident updatedResAge = new Resident(resident1.getName(), resident1.getAge(), resident1.getAddress(), resident1.getContact());
                                    i.remove();
                                    residentList.add(updatedResAge);
                                    break;

                                }

                        }
                        break;
                    case 3:
                        // edits the address
                        while (i.hasNext()) {
                            Resident resident1 = i.next();

                                if (residentList.toArray()[edit - 1] == resident1){
                                    String newAddress = System.console().readLine("Enter new address: ");
                                    resident1.setAddress(new String(newAddress));
                                    // input.next();
                                    Resident updatedResAddress = new Resident(resident1.getName(), resident1.getAge(), resident1.getAddress(), resident1.getContact());
                                    i.remove();
                                    residentList.add(updatedResAddress);
                                    break;
                                }

                        }
                        break;
                    case 4:
                        // edits the contact number
                        while (i.hasNext()) {
                            Resident resident1 = i.next();

                                if (residentList.toArray()[edit - 1] == resident1){

                                    String newContact = System.console().readLine("Enter new contact: ");
                                    resident1.setContact(new String(newContact));
                                    Resident updatedResContact = new Resident(resident1.getName(), resident1.getAge(), resident1.getAddress(), resident1.getContact());
                                    i.remove();
                                    residentList.add(updatedResContact);
                                    break;

                                }

                        }
                        break;

                }
                System.out.println("Changes have been saved.");
            }

        } else {

            new Menu();

        }

        return null;
    }

    @Override
    public String displayOfficial() {

        System.out.println("List of barangay officials:");

        int count = 0;

        for (Official j: officialList) {
            count += 1;
            System.out.println(
                    "=======================================" +
                            "\n" + "Name: " + j.getName() +
                            "\n" + "Age: " + j.getAge() +
                            "\n" + "Address: " + j.getAddress() +
                            "\n" + "Contact: " + j.getContact() +
                            "\n" + "Position: " + j.getPosition() + "\n"
            );
            System.out.println("Enter [" + count + "] to edit this data." + "\n");
        }

        int edit = Integer.parseInt(System.console().readLine("Enter [0] to go back to menu. \n"));

        if (edit > 0 && edit < officialList.size() + 1){
            int option = Integer.parseInt(System.console().readLine("Choose what to do with the data" + "\n" +
                            "1. Remove" + "\n" +
                            "2. Edit" + "\n"));

            if (option == 1){

                // remove the data from the hashset

            } else if (option == 2) {
                // edit data
                int editOption = Integer.parseInt(System.console().readLine("Choose what do you want to change." + "\n" +
                                "1. Name" + "\n" +
                                "2. Age" + "\n" +
                                "3. Address" + "\n" +
                                "4. Contact" + "\n"+
                                "5. Position" + "\n" ));

                // Moved here para di iba iba yung variable sa switch-case chuchu check mo kung nagana - Elmer
                Iterator<Official> i = officialList.iterator();

                switch (editOption){

                    case 1:
                        // edits the name
                        while (i.hasNext()) {
                            Official official1 = i.next();

                                if (officialList.toArray()[edit - 1] == official1){
                                    String newName = System.console().readLine("Enter new name: ");
                                    official1.setName(new String(newName));
                                    Official updatedOfcName = new Official(official1.getName(), official1.getAge(), official1.getAddress(),official1.getContact(), official1.getPosition());
                                    i.remove();
                                    officialList.add(updatedOfcName);
                                    break;
                                }
                        }
                        break;
                    case 2:
                        // edits the age
                        while (i.hasNext()) {
                            Official official1 = i.next();

                                if (officialList.toArray()[edit - 1] == official1){
                                    String newAge = System.console().readLine("Enter new age: ");
                                    official1.setAge(new String(newAge));
                                    Official updatedOfcAge = new Official(official1.getName(), official1.getAge(), official1.getAddress(),official1.getContact(), official1.getPosition());
                                    i.remove();
                                    officialList.add(updatedOfcAge);
                                    break;
                                }
                        }
                        break;
                    case 3:
                        // edits the address
                        while (i.hasNext()) {
                            Official official1 = i.next();

                                if (officialList.toArray()[edit - 1] == official1){
                                    String newAddress = System.console().readLine("Enter new address: ");
                                    official1.setAddress(new String(newAddress));
                                    Official updatedOfcAddress = new Official(official1.getName(), official1.getAge(), official1.getAddress(),official1.getContact(), official1.getPosition());
                                    i.remove();
                                    officialList.add(updatedOfcAddress);
                                    break;
                                }
                        }
                        break;
                    case 4:
                        // edits the contact number
                        while (i.hasNext()) {
                            Official official1 = i.next();

                                if (officialList.toArray()[edit - 1] == official1){
                                    String newContact = System.console().readLine("Enter new contact number: ");
                                    official1.setContact(new String(newContact));
                                    Official updatedOfcContact = new Official(official1.getName(), official1.getAge(), official1.getAddress(),official1.getContact(), official1.getPosition());
                                    i.remove();
                                    officialList.add(updatedOfcContact);
                                    break;
                                }
                        }
                        break;
                    case 5:
                        // edits the position
                        while (i.hasNext()) {
                            Official official1 = i.next();

                                if (officialList.toArray()[edit - 1] == official1){
                                    String newPosition = System.console().readLine("Enter new barangay position: ");
                                    official1.setPosition(new String(newPosition));
                                    Official updatedOfcPosition = new Official(official1.getName(), official1.getAge(), official1.getAddress(),official1.getContact(), official1.getPosition());
                                    i.remove();
                                    officialList.add(updatedOfcPosition);
                                    break;
                                }
                        }
                        break;
                }
                System.out.println("Changes have been saved.");
            }

        } else {

            new Menu();

        }

        return null;
    }

}
