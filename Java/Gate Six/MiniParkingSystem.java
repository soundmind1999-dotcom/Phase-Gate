    



public class MiniParkingSystem {

    
    public static int[] parkingSlots = new int[20];

    public static void parkCarAutomatic() {
        for (int index = 0; index < parkingSlots.length; index++) {
            if (parkingSlots[index] == 0) {
                parkingSlots[index] = 1;
                System.out.println("Car parked at slot " + (index + 1));
                return;
            }
        }
        System.out.println("Parking lot is full");
    }

    
    public static void parkAtSlot(int slotNumber) {

        if (slotNumber < 1 || slotNumber > 20) {
            System.out.println("Invalid slot number");
            return;
        }

        if (parkingSlots[slotNumber - 1] == 0) {
            parkingSlots[slotNumber - 1] = 1;
            System.out.println("Car parked at slot " + slotNumber);
        } else {
            System.out.println("Slot already occupied");
        }
    }


    public static void removeCar(int slotNumber) {

        if (slotNumber < 1 || slotNumber > 20) {
            System.out.println("Invalid slot number");
            return;
        }

        if (parkingSlots[slotNumber - 1] == 1) {
            parkingSlots[slotNumber - 1] = 0;
            System.out.println("Car removed from slot " + slotNumber);
        } else {
            System.out.println("Slot already empty");
        }
    }

   
    public static void displayParkingStatus() {
        int availableSpaces = 0;
        int filledSpaces = 0;

        System.out.println("\nParking Status:");

        for (int index = 0; index < parkingSlots.length; index++) {
            System.out.print(parkingSlots[index] + " ");

            if (parkingSlots[index] == 0) {
                availableSpaces++;
         } else {
                filledSpaces++;
            }
        }

        System.out.println("\nAvailable Spaces: " + availableSpaces);
        System.out.println("Filled Spaces: " + filledSpaces);
    }

   

   







// public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int choice = input.nextInt();
//
//        do{
//            System.out.println("\nWELCOME TO MINI PARKING LOT");
//            System.out.println("1. Park Car (Auto)");
//            System.out.println("2. Park Car (Choose Slot)");
//            System.out.println("3. Remove Car");
//            System.out.println("4. Display Parking Status");
//            System.out.println("5. Exit");
//            System.out.print("Enter choice: ");
//
//
//            switch (choice) {
//                case 1:
//                    parkCarAutomatic();
//                    displayParkingStatus();
//                    break;
//
//                case 2:
//                    System.out.print("Enter slot (1-20): ");
//                    int slot = input.nextInt();
//                    parkAtSlot(slot);
//                    displayParkingStatus();
//                    break;
//
//                case 3:
//                    System.out.print("Enter slot to remove car: ");
//                    int removeSlot = input.nextInt();
//                    removeCar(removeSlot);
//                    displayParkingStatus();
//                    break;
//
//                case 4:
//                    displayParkingStatus();
//                    break;
//
//                case 5:
//                    System.out.println("Exiting...");
//                    break;
//
//                default:
//                    System.out.println("Invalid choice!");
//            }
//
//        } while (choice != 5);
//
//    
//    }
//}
//
//









































