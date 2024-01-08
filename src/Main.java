import java.util.Scanner;

public class Main extends Resident {
    public static void main(String[] args){

        // TODO: Ask the user if he/she is a Barangay Resident or Barangay Official

        Scanner input = new Scanner(System.in);
        Data data = new Data();
        // Resident resident = new Resident();
        Resident resident;
        Official official;
        System.out.println("=============================================================");
        System.out.println("Register yourself as a resident or official of your Barangay!");
        System.out.println("=============================================================");
        while(true){
            resident = new Resident();
            

            System.out.print("Please enter your name: ");
            resident.setName(input.nextLine());
            System.out.print("Please enter your age: ");
            resident.setAge(input.nextInt());
            System.out.print("Please enter your address: ");
            resident.setAddress(input.nextLine());
            System.out.print("Please enter your contact number: ");
            resident.setContact(input.nextLine());
            System.out.print("Are you a Barangay Official? [Y/N]: ");
            String isBarangayOfficial_Input = input.nextLine().toUpperCase();
            if (isBarangayOfficial_Input.equals("N")){
                Data.residentList.add(new Resident(resident.getName(), resident.getAge(), resident.getAddress(), resident.getContact()));
            } else {
                official = new Official();
                official.setName(resident.getName());
                official.setAge(resident.getAge());
                official.setAddress(resident.getAddress());
                official.setContact(resident.getContact());
                System.out.print("Please enter your position: ");
                official.setPosition(input.nextLine());
                Data.officialList.add(new Official(official.getName(), official.getAge(), official.getAddress(), official.getContact(), official.getPosition()));
            }

            


            System.out.println("List of residents:");
            System.out.println("=============================================================");
            for (Resident i: Data.residentList) {
                System.out.println("Name: " + i.getName());
                System.out.println("Age: " + i.getAge());
                System.out.println("Address: " + i.getAddress());
                System.out.println("Contact number: " + i.getContact());
                System.out.println("-------------------------------------------------------------");
                // System.out.println(i.getName() + " " + i.getAge());
                
            }
            System.out.println("List of barangay officials:");
            System.out.println("=============================================================");
            for (Official i: Data.officialList) {
                System.out.println("Name: " + i.getName());
                System.out.println("Age: " + i.getAge());
                System.out.println("Address: " + i.getAddress());
                System.out.println("Contact number: " + i.getContact());
                System.out.println("Barangay position: " + i.getPosition());
                System.out.println("-------------------------------------------------------");                
            }
            System.out.println("=======================================================");
            System.out.println("Would you like to register a new resident? [Y/N]: ");
            String loopRepeat = input.nextLine().toUpperCase();
            if (loopRepeat.equals("N")){
                break;
            }
        }


    }
}
 