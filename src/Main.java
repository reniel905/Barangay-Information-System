import java.util.Scanner;

public class Main extends Resident {
    public static void main(String[] args){

        // TODO: Ask the user if he/she is a Barangay Resident or Barangay Official

        Scanner input = new Scanner(System.in);
        Data data = new Data();
        // Resident resident = new Resident();
        Resident resident;

        while(true){
            resident = new Resident();
            System.out.println("Register yourself as a resident of your Barangay!");

            System.out.print("Please enter your name: ");
            resident.setName(input.nextLine());
            System.out.print("Please enter your age: ");
            resident.setAge(input.nextInt());
            System.out.print("Please enter your address: ");
            resident.setAddress(input.nextLine());
            System.out.print("Please enter your contact number: ");
            resident.setContact(input.nextLine());

            Data.residentList.add(new Resident(resident.getName(), resident.getAge(), resident.getAddress(), resident.getContact()));


            System.out.println("List of residents:");
            System.out.println("=======================================================");
            for (Resident i: Data.residentList) {
                System.out.println("Name: " + i.getName());
                System.out.println("Age: " + i.getAge());
                System.out.println("Address: " + i.getAddress());
                System.out.println("Contact number: " + i.getContact());
                System.out.println("-------------------------------------------------------");
                // System.out.println(i.getName() + " " + i.getAge());
                
            }
            System.out.println("=======================================================");
        }


    }
}
 