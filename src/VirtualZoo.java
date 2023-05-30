import java.util.Scanner;

/**
 *
 * @author Your name, student number and FAN here
 */
public class VirtualZoo {

    private final Scanner scan;

    public VirtualZoo() {
        scan = new Scanner(System.in);
    }

    public void beginSimulation() {
        displayWelcome();
    }

    //-------------------------operational methods------------------------------

    /**
     * Defines the Welcome Message text
     */
    private void displayWelcome() {
        System.out.println("+----------------------------------------------------------------------+");
        System.out.println("|                     Welcome to the Virtual Zoo!                      |");
        System.out.println("|   Use this application to simulate running a zoo with many animals   |");
        System.out.println("|           This program is intended for zoo employees only            |");
        System.out.println("+----------------------------------------------------------------------+");
    }

}
