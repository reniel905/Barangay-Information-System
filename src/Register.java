import java.util.Scanner;

public class Register extends Resident {

    Resident resident = new Resident();
    Official official = new Official();
    Scanner input = new Scanner(System.in);
    Data data = new Data();

    // 0 = Resident
    // 1 = Official

    int type;

    public Register(){


    }

    public void asResident(){

        System.out.println("Register yourself as a resident of your Barangay!");
        System.out.print("Please enter your name: ");
        resident.setName(input.next());
        System.out.print("Please enter your age: ");
        resident.setAge(input.next());
        System.out.print("Please enter your address: ");
        resident.setAddress(input.next());
        System.out.print("Please enter your contact number: ");
        resident.setContact(input.next());

        Data.residentList.add(new Resident(resident.getName(), resident.getAge(), resident.getAddress(), resident.getContact()));
        System.out.println("You are now successfully registered as resident of this Barangay.");


        new Menu();

    }

    public void asOfficial(){

        System.out.println("Are you already a resident? [Y/N]");

        String answer = input.next();

        if (answer.equalsIgnoreCase("n")){

            System.out.println("You need to be a resident first. ");
            new Menu();

        } else if (answer.equalsIgnoreCase("y")) {

            System.out.println("Register yourself as an official of your Barangay!");
            System.out.print("Please enter your name: ");
            official.setName(input.nextLine());
            System.out.print("Please enter your age: ");
            official.setAge(input.nextLine());
            System.out.print("Please enter your address: ");
            official.setAddress(input.nextLine());
            System.out.print("Please enter your contact number: ");
            official.setContact(input.nextLine());

            Data.officialList.add(new Official(official.getName(), official.getAge(), official.getAddress(), official.getContact(), official.getPosition()));
            System.out.println("You are now successfully registered as an official of this Barangay.");

            new Menu();

        }

    }

}
