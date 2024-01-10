import java.util.ArrayList;
import java.util.Iterator;

public class Data extends Barangay {

    public static ArrayList<Resident> residentList = new ArrayList<Resident>();
    public static ArrayList<Official> officialList = new ArrayList<Official>();
    // Scanner input = new Scanner(System.in);

    @Override
    public void add(Official official) {
        officialList.add(official);
    }

    @Override
    public void add(Resident resident) {
        residentList.add(resident);
    }

    @Override
    public void remove(int position, boolean isOfficial) {

        if (isOfficial) {

            Iterator<Official> i = officialList.iterator();
            while (i.hasNext()) {

                Official official1 = i.next();

                if (officialList.toArray()[position - 1] == official1) {

                    i.remove();

                    break;

                }

            }

        } else {

            Iterator<Resident> i = residentList.iterator();
            while (i.hasNext()) {

                Resident resident1 = i.next();

                if (residentList.toArray()[position - 1] == resident1) {

                    i.remove();

                    break;

                }

            }

        }

        // TODO: Make this remove function work

    }

    @Override
    public String displayResident() {
        System.out
                .println(
                        "====================================================================================================================");
        System.out
                .println(
                        "=                                              RESIDENTS LIST                                                      =");
        System.out
                .println(
                        "====================================================================================================================");
        System.out.printf("| %-4s | %-60s | %-4s | %-20s | %-12s | \n", "No.", "Name", "Age", "Address", "Contact no.");
        System.out
                .println(
                        "--------------------------------------------------------------------------------------------------------------------");
        int count = 0;

        for (Resident i : residentList) {

            count += 1;

            System.out.printf("| %-4s | %-60s | %-4s | %-20s | %-12s | \n", count, i.getName(), i.getAge(),
                    i.getAddress(),
                    i.getContact());

        }

        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------");
        int edit = Integer.parseInt(System.console()
                .readLine("\nEnter [0] to go back to menu \nEnter [any number from the table] to edit \n"));

        if (edit > 0 && edit < residentList.size() + 1) {
            int option = Integer.parseInt(System.console().readLine(
                    "\nEnter [1] to remove data" + "\n" +
                            "Enter [2] to edit data" + "\n"));

            if (option == 1) {

                // remove the data from the hashset
                remove(edit, false);

            } else if (option == 2) {
                // edit data
                int editOption = Integer.parseInt(System.console()
                        .readLine("\nEnter [1] to edit name" + "\n" +
                                "Enter [2] to edit age" + "\n" +
                                "Enter [3] to edit address" + "\n" +
                                "Enter [4] to edit contact" + "\n"));

                // Moved here para di iba iba yung variable sa switch-case chuchu check mo kung
                // nagana - Elmer
                Iterator<Resident> i = residentList.iterator();

                switch (editOption) {

                    case 1:
                        // edits the name
                        while (i.hasNext()) {
                            Resident resident1 = i.next();

                            if (residentList.toArray()[edit - 1] == resident1) {
                                String newName = System.console().readLine("\nEnter new name: ");
                                resident1.setName(new String(newName));
                                break;

                            }

                        }

                        break;
                    case 2:
                        // edits the age
                        while (i.hasNext()) {
                            Resident resident1 = i.next();

                            if (residentList.toArray()[edit - 1] == resident1) {
                                String newAge = System.console().readLine("\n Enter new age: ");
                                resident1.setAge(new String(newAge));
                                break;

                            }

                        }
                        break;
                    case 3:
                        // edits the address
                        while (i.hasNext()) {
                            Resident resident1 = i.next();

                            if (residentList.toArray()[edit - 1] == resident1) {
                                String newAddress = System.console().readLine("\n Enter new address: ");
                                resident1.setAddress(new String(newAddress));
                                break;
                            }

                        }
                        break;
                    case 4:
                        // edits the contact number
                        while (i.hasNext()) {
                            Resident resident1 = i.next();

                            if (residentList.toArray()[edit - 1] == resident1) {

                                String newContact = System.console().readLine("\n Enter new contact: ");
                                resident1.setContact(new String(newContact));
                                break;

                            }

                        }
                        break;

                }
                System.out.println("Changes have been saved.");
                displayResident();

            }

        } else {

            new Menu();

        }

        return null;
    }

    @Override
    public String displayOfficial() {

        System.out
                .println(
                        "=======================================================================================================================");
        System.out
                .println(
                        "=                                                OFFICIALS LIST                                                       =");
        System.out
                .println(
                        "=======================================================================================================================");
        System.out.printf("| %-4s | %-40s | %-20s | %-4s | %-20s | %-12s | \n", "No.", "Name", "Position", "Age",
                "Address",
                "Contact no.");
        System.out
                .println(
                        "-----------------------------------------------------------------------------------------------------------------------");

        int count = 0;

        for (Official j : officialList) {
            count += 1;
            System.out.printf("| %-4s | %-40s | %-20s | %-4s | %-20s | %-12s | \n", count, j.getName(), j.getPosition(),
                    j.getAge(),
                    j.getAddress(),
                    j.getContact());
        }

        System.out
                .println(
                        "-----------------------------------------------------------------------------------------------------------------------");

        int edit = Integer.parseInt(System.console()
                .readLine("\nEnter [0] to go back to menu \nEnter [any number from the table] to edit \n"));

        if (edit > 0 && edit < officialList.size() + 1) {
            int option = Integer.parseInt(System.console().readLine("\nEnter [1] to remove data" + "\n" +
                    "Enter [2] to edit data" + "\n"));

            if (option == 1) {

                // remove the data from the hashset
                remove(edit, true);

            } else if (option == 2) {
                // edit data
                int editOption = Integer.parseInt(System.console()
                        .readLine("\nEnter [1] to edit name" + "\n" +
                                "Enter [2] to edit age" + "\n" +
                                "Enter [3] to edit address" + "\n" +
                                "Enter [4] to edit contact" + "\n" +
                                "Enter [5] to edit position" + "\n"));

                // Moved here para di iba iba yung variable sa switch-case chuchu check mo kung
                // nagana - Elmer
                Iterator<Official> i = officialList.iterator();

                switch (editOption) {

                    case 1:
                        // edits the name
                        while (i.hasNext()) {
                            Official official1 = i.next();

                            if (officialList.toArray()[edit - 1] == official1) {
                                String newName = System.console().readLine("\nEnter new name: ");
                                official1.setName(new String(newName));
                                break;
                            }
                        }
                        break;
                    case 2:
                        // edits the age
                        while (i.hasNext()) {
                            Official official1 = i.next();

                            if (officialList.toArray()[edit - 1] == official1) {
                                String newAge = System.console().readLine("\nEnter new age: ");
                                official1.setAge(new String(newAge));
                                break;
                            }
                        }
                        break;
                    case 3:
                        // edits the address
                        while (i.hasNext()) {
                            Official official1 = i.next();

                            if (officialList.toArray()[edit - 1] == official1) {
                                String newAddress = System.console().readLine("\nEnter new address: ");
                                official1.setAddress(new String(newAddress));
                                break;
                            }
                        }
                        break;
                    case 4:
                        // edits the contact number
                        while (i.hasNext()) {
                            Official official1 = i.next();

                            if (officialList.toArray()[edit - 1] == official1) {
                                String newContact = System.console().readLine("\nEnter new contact number: ");
                                official1.setContact(new String(newContact));
                                break;
                            }
                        }
                        break;
                    case 5:
                        // edits the position
                        while (i.hasNext()) {
                            Official official1 = i.next();

                            if (officialList.toArray()[edit - 1] == official1) {
                                String newPosition = System.console().readLine("\nEnter new barangay position: ");
                                official1.setPosition(new String(newPosition));
                                break;
                            }
                        }
                        break;
                }
                System.out.println("\nChanges have been saved!");
                displayOfficial();
            }

        } else {

            new Menu();

        }

        return null;
    }

}
