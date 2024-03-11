import java.util.Scanner;

class Train {
    private String name;
    private String departureTime;
    private String sourceStation;
    private String destinationStation;
    private int passengerStrength;
    private int trainNumber;

    public Train(String name, String departureTime, String sourceStation, String destinationStation,
                 int passengerStrength, int trainNumber) {
        this.name = name;
        this.departureTime = departureTime;
        this.sourceStation = sourceStation;
        this.destinationStation = destinationStation;
        this.passengerStrength = passengerStrength;
        this.trainNumber = trainNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getSourceStation() {
        return sourceStation;
    }

    public void setSourceStation(String sourceStation) {
        this.sourceStation = sourceStation;
    }

    public String getDestinationStation() {
        return destinationStation;
    }

    public void setDestinationStation(String destinationStation) {
        this.destinationStation = destinationStation;
    }

    public int getPassengerStrength() {
        return passengerStrength;
    }

    public void setPassengerStrength(int passengerStrength) {
        this.passengerStrength = passengerStrength;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }
}

class ReservationSystem {
    private Train[] availableTrains;
    private Train selectedTrain;
    private String[] passengerNames;
    private int[] seatNumbers;
    private int currentIndex;

    public ReservationSystem() {
        availableTrains = new Train[3];
        passengerNames = new String[100];
        seatNumbers = new int[100];
        currentIndex = 0;

        availableTrains[0] = new Train("Express1", "10:00 AM", "StationA", "StationB", 200, 101);
        availableTrains[1] = new Train("Express2", "12:30 PM", "StationB", "StationC", 150, 102);
        availableTrains[2] = new Train("Local1", "02:45 PM", "StationC", "StationD", 100, 103);
    }

    public Train[] getAvailableTrains() {
        return availableTrains;
    }

    public Train getSelectedTrain() {
        return selectedTrain;
    }

    public void setSelectedTrain(Train selectedTrain) {
        this.selectedTrain = selectedTrain;
    }

    public void bookTicket(String passengerName, int seatNumber) {
        if (currentIndex < passengerNames.length && currentIndex < seatNumbers.length) {
            passengerNames[currentIndex] = passengerName;
            seatNumbers[currentIndex] = seatNumber;
            currentIndex++;
            selectedTrain.setPassengerStrength(selectedTrain.getPassengerStrength() - 1);
        } else {
            System.out.println("Booking failed. Insufficient capacity.");
        }
    }

    public void cancelTicket(int seatNumber) {
        for (int i = 0; i < currentIndex; i++) {
            if (seatNumbers[i] == seatNumber) {
                selectedTrain.setPassengerStrength(selectedTrain.getPassengerStrength() + 1);
                passengerNames[i] = null;
                seatNumbers[i] = 0;
                break;
            }
        }
    }

    public void displayTicketDetails() {
        System.out.println("Train Details:");
        System.out.println("Name: " + selectedTrain.getName());
        System.out.println("Departure Time: " + selectedTrain.getDepartureTime());
        System.out.println("Source Station: " + selectedTrain.getSourceStation());
        System.out.println("Destination Station: " + selectedTrain.getDestinationStation());
        System.out.println("Passenger Names: ");
        for (int i = 0; i < currentIndex; i++) {
            if (passengerNames[i] != null) {
                System.out.println(passengerNames[i] + " (Seat: " + seatNumbers[i] + ")");
            }
        }
    }
}

public class RailwayReservationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ReservationSystem reservationSystem = new ReservationSystem();

        while (true) {
            System.out.println("1. Display available trains");
            System.out.println("2. Check seat availability");
            System.out.println("3. Book a ticket");
            System.out.println("4. Cancel a ticket");
            System.out.println("5. Display ticket details");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayAvailableTrains(reservationSystem.getAvailableTrains());
                    break;
                case 2:
                    checkSeatAvailability(reservationSystem.getSelectedTrain());
                    break;
                case 3:
                    bookTicket(reservationSystem);
                    break;
                case 4:
                    cancelTicket(reservationSystem);
                    break;
                case 5:
                    reservationSystem.displayTicketDetails();
                    break;
                case 6:
                    System.out.println("Exiting the Railway Reservation System. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
            scanner.close();
        }
    }

    private static void displayAvailableTrains(Train[] availableTrains) {
        System.out.println("Available Trains:");
        for (int i = 0; i < availableTrains.length; i++) {
            System.out.println((i + 1) + ". " + availableTrains[i].getName());
        }
    }

    private static void checkSeatAvailability(Train selectedTrain) {
        if (selectedTrain != null) {
            System.out.println("Available seats: " + selectedTrain.getPassengerStrength());
        } else {
            System.out.println("No train selected. Please select a train first.");
        }
    }

    private static void bookTicket(ReservationSystem reservationSystem) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter passenger name: ");
        String passengerName = scanner.next();
        System.out.print("Enter seat number: ");
        int seatNumber = scanner.nextInt();
        reservationSystem.bookTicket(passengerName, seatNumber);
        System.out.println("Ticket booked successfully!");
        scanner.close();
    }

    private static void cancelTicket(ReservationSystem reservationSystem) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter seat number to cancel: ");
        int seatNumber = scanner.nextInt();
        reservationSystem.cancelTicket(seatNumber);
        System.out.println("Ticket canceled successfully!");
        scanner.close();
    }
}