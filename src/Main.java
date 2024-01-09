public class Main {

    public static void main(String[] args){

        Data data = new Data();

        // Inserting Sample Data or Initial Data

        data.add(new Resident("Reniel G. Baldove", "20", "41 Kalayaan St.", "09099146061"));
        data.add(new Resident("Elmer G. Felisilda Jr.", "19", "41 Zone 5 St.", "324321654sda321"));
        data.add(new Resident("Elias Chan", "21", "55 Zone 12 St.", "35461321320320"));

        new Menu();

    }
}
