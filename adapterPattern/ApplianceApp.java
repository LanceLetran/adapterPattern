package adapterPattern;

import java.util.Scanner;

public class ApplianceApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize appliances and their adapters
        Tv tv = new Tv();
        RemoteControllerFunction tvRc = new TvAdapter(tv);

        AirCon airCon = new AirCon();
        RemoteControllerFunction airConRc = new AirconAdapter(airCon);

        Speaker speaker = new Speaker();
        RemoteControllerFunction speakerRc = new SpeakerAdapter(speaker);

        // User interaction
        while (true) {
            System.out.println("Which device would you like to use?");
            System.out.println("1. TV\n2. AirCon\n3. Speaker\n4. Exit");
            int deviceChoice = scanner.nextInt();
            scanner.nextLine();  // Clear the newline character

            if (deviceChoice == 4) {
                break;
            }

            RemoteControllerFunction selectedDevice = null;

            switch (deviceChoice) {
                case 1:
                    selectedDevice = tvRc;
                    break;
                case 2:
                    selectedDevice = airConRc;
                    break;
                case 3:
                    selectedDevice = speakerRc;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    continue;
            }

            System.out.println("What would you like to do?");
            System.out.println("1. Power On\n2. Power Off\n3. Increase Setting\n4. Decrease Setting");
            int actionChoice = scanner.nextInt();
            scanner.nextLine();  // Clear the newline character

            switch (actionChoice) {
                case 1:
                    System.out.println(selectedDevice.powerOn());
                    break;
                case 2:
                    System.out.println(selectedDevice.powerOff());
                    break;
                case 3:
                    System.out.println(selectedDevice.increaseSetting());
                    break;
                case 4:
                    System.out.println(selectedDevice.decreaseSetting());
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}
