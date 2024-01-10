import java.util.Scanner;

public class Register extends Resident {

    Resident resident = new Resident();
    Official official = new Official();
    Scanner input = new Scanner(System.in);
    Data data = new Data();

    // 0 = Resident
    // 1 = Official

    int type;

    public Register() {

    }

    public void asResident() {

        System.out.println("Register yourself as a resident of your Barangay!");
        resident.setName(System.console().readLine("Please enter your name: "));
        resident.setAge(System.console().readLine("Please enter your age: "));
        resident.setAddress(System.console().readLine("Please enter your address: "));
        resident.setContact(System.console().readLine("Please enter your contact number: "));

        Data.residentList
                .add(new Resident(resident.getName(), resident.getAge(), resident.getAddress(), resident.getContact()));
        System.out.println("You are now successfully registered as resident of this Barangay.");

        data.displayResident();

    }

    public void asOfficial() {
        String answer = System.console().readLine("Are you already a resident? [Y/N]: ");

        if (answer.equalsIgnoreCase("n")) {

            System.out.println("You need to be a resident first. ");
            new Menu();

        } else if (answer.equalsIgnoreCase("y")) {

            System.out.println("Register yourself as an official of your Barangay!");
            official.setName(System.console().readLine("Please enter your name: "));
            official.setAge(System.console().readLine("Please enter your age: "));
            official.setAddress(System.console().readLine("Please enter your address: "));
            official.setContact(System.console().readLine("Please enter your contact number: "));
            official.setPosition(System.console().readLine("Please enter your barangay position: "));

            Data.officialList.add(new Official(official.getName(), official.getAge(), official.getAddress(),
                    official.getContact(), official.getPosition()));
            System.out.println("You are now successfully registered as an official of this Barangay.");

            data.displayOfficial();

        }

    }

}
