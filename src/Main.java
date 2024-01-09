public class Main {

    public static void main(String[] args) {

        Data data = new Data();

        // Inserting Sample Data or Initial Data

        data.add(new Resident("Juan Dela Cruz", "28", "12 Moonlight Street", "09726482718"));
        data.add(new Resident("Juana santa monica", "23", "10 Star Street", "09826483727"));
        data.add(new Resident("Dionisio del mundo", "45", "17 Arcane Street", "09826483727"));
        data.add(new Resident("John Christopher Jimenez", "25", "39 Brown Street", "098375827492"));
        data.add(new Resident("Juanito Macalino", "40", "93 Dart Street", "09385828573"));
        data.add(new Resident("Hannah Magsino", "24", "73 Junction Street", "09472847285"));
        data.add(new Resident("Jaren Menor", "55", "78 Albat Street", "09285728274"));
        data.add(new Resident("Pamela Santos", "27", "34 Sampaloc street", "09827583727"));
        data.add(new Resident("Kyra Montenegro", "22", "67 Orange Street", "09826583682"));
        data.add(new Resident("Paulene Tan", "25", "18 Durian Street", "09274827283"));

        data.add(new Official("Martha Dela Cruz", "30", "15 Moonlight street", "09827482748", "Barangay Captain"));
        data.add(new Official("Jesamin burgos", "26", "31 Crepe street", "09726482728", "Councilor"));
        data.add(new Official("Jarenine Saunders", "32", "8 Snow street", "09385828582", "Treasurer"));
        data.add(new Official("Jasmine Carla Sabungan", "23", "24 Midnight street", "09482758275",
                "Sangguniang Kabataan"));
        data.add(new Official("Janina Balderama ", "43", "79 Galaxy street", "09482758372", "Secretary"));
        data.add(new Official("Steve Dalmond Gutierrez", "49", "13 California street", "09827583728",
                "Barangay Chairman"));
        data.add(new Official("Kingston Ramirez", "35", "34 Sampaloc street", "09385828364", "SK Chairman"));
        data.add(new Official("Xyrene Magbunga", "26", "18 Moonlight street", "09972758372", "Sangguniang Kabataan"));
        data.add(new Official("Demi rose santa cruz", "29", "23 Swish street", "09285838274", "Barangay Kagawad"));
        data.add(new Official("Krista Valdez", "28", "34 Bucks street", "09827583727", "SK Chairman"));

        new Menu();

    }
}
