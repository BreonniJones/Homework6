package abstraction3;
import java.util.Scanner;

public class Utility {
    private Scanner scanner;

    public Utility() {
        scanner = new Scanner(System.in);
    }

    // Method to check for name input
    public String checkForName(String animalType) {
        System.out.println("Do you have a name for the " + animalType + "? (yes/no)");
        String response = scanner.nextLine();
        
        if (response.equalsIgnoreCase("yes")) {
            System.out.println("Enter the name of the " + animalType + ":");
            return scanner.nextLine();
        } else {
            return null;
        }
    }

    // Method to get a Lion object
    public Lion getLionObject(String lionName) {
        if (lionName == null) {
            return new Lion();
        } else {
            return new Lion(lionName);
        }
    }

    // Method to get a Giraffe object
    public Giraffe getGiraffeObject(String giraffeName) {
        if (giraffeName == null) {
            return new Giraffe();
        } else {
            return new Giraffe(giraffeName);
        }
    }

    // Method to get a Bear object
    public Bear getBearObject(String bearName) {
        if (bearName == null) {
            return new Bear();
        } else {
            return new Bear(bearName);
        }
    }
}
