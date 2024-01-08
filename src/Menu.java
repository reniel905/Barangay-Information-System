import java.util.Scanner;

public class Menu {

    Scanner input = new Scanner(System.in);
    Data data = new Data();
    Register register = new Register();

    public Menu() {

        System.out.println("\n" +
                        "0. Exit" + "\n" +
                        "1. View Residents List" + "\n" +
                        "2. View Officials List" + "\n" +
                        "3. Register as Resident" + "\n" +
                        "4. Register as Official" + "\n"
                );

        int option = input.nextInt();

        switch (option){

            case 0:
                // exit
                break;
            case 1:
                data.displayResident();
                new Menu();
                break;
            case 2:
                data.displayOfficial();
                new Menu();
                break;
            case 3:
                register.asResident();
                break;
            case 4:
                register.asOfficial();
                break;




        }

    }
}
