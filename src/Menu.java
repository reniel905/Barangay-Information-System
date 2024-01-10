import java.util.Scanner;

public class Menu {

    Scanner input = new Scanner(System.in);
    Data data = new Data();
    Register register = new Register();

    public Menu() {
        int option = Integer.parseInt(System.console().readLine("\n" +
                "Enter [0] to exit" + "\n" +
                "Enter [1] to view Residents List" + "\n" +
                "Enter [2] to view Officials List" + "\n" +
                "Enter [3] to register as Resident" + "\n" +
                "Enter [4] to register as Official" + "\n"));

        switch (option) {

            case 0:
                System.exit(0);
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
