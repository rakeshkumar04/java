import java.util.ArrayList;
import java.util.List;
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
    private List<Train> availableTrains;
    private Train selectedTrain;
    private List<String> passengerNames;
    private List<Integer> seatNumbers;

    public ReservationSystem() {
        availableTrains = new ArrayList<>();
        passengerNames = new ArrayList<>();
        seatNumbers = new ArrayList<>();

        availableTrains.add(new Train("Chennai Express", "10:00 AM", "Delhi", "Chennai", 200, 101));
        availableTrains.add(new Train("Nellai Express", "12:30 PM", "Egmore", "Nellai", 150, 102));
        availableTrains.add(new Train("Metro", "02:45 PM", "Beach Station", "Tambaram", 100, 103));
    }

    public List<Train> getAvailableTrains() {
        return availableTrains;
    }

    public Train getSelectedTrain() {
        return selectedTrain;
    }

    public void setSelectedTrain(Train selectedTrain) {
        this.selectedTrain = selectedTrain;
    }

    public List<String> getPassengerNames() {
        return passengerNames;
    }

    public List<Integer> getSeatNumbers() {
        return seatNumbers;
    }

    public void bookTicket(String passengerName, int seatNumber) {
        passengerNames.add(passengerName);
        seatNumbers.add(seatNumber);
        selectedTrain.setPassengerStrength(selectedTrain.getPassengerStrength() - 1);
    }

    public void cancelTicket(int seatNumber) {
        int index = seatNumbers.indexOf(seatNumber);
        if (index != -1) {
            passengerNames.remove(index);
            seatNumbers.remove(index);
            selectedTrain.setPassengerStrength(selectedTrain.getPassengerStrength() + 1);
        } else {
            System.out.println("Invalid seat number. No booking found.");
        }
    }

    public void displayTicketDetails() {
        System.out.println("Train Details:");
        System.out.println("Name: " + selectedTrain.getName());
        System.out.println("Departure Time: " + selectedTrain.getDepartureTime());
        System.out.println("Source Station: " + selectedTrain.getSourceStation());
        System.out.println("Destination Station: " + selectedTrain.getDestinationStation());
        System.out.println("Passenger Names: " + passengerNames);
        System.out.println("Seat Numbers: " + seatNumbers);
    }
}

class TrainBooking {
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

    private static void displayAvailableTrains(List<Train> availableTrains) {
        System.out.println("Available Trains:");
        for (Train train : availableTrains) {
            System.out.println(train.getTrainNumber() + ". " + train.getName());
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