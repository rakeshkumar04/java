import java.util.ArrayList;
import java.util.Scanner;

static Scanner scanf = new Scanner(System.in);

public class Users {
    
    static ArrayList<Integer> user = new ArrayList<Integer>();
    static int seats[] = new int[10];
    static boolean isSeatBooked[] = new boolean[10];

    static void system(int tempid) {
        System.out.println("Enter What you want to do,\n1)Book a Ticket - Enter 1\nDisplay PNR status - Enter 12\n");
        int ch = scanf.nextInt();
        switch (ch) {
            case 1:
                book(tempid);
        }
    }

    static void book(int tempid) {
        displayAvailable();
        System.out.println("Enter Seat No: ");
        int seatNo = scanf.nextInt();
        seats[seatNo] = tempid;
        isSeatBooked[seatNo] = true;
        System.out.println("Successfully Booked");
        system(tempid);
    }

    static void displayAvailable() {
        for (int i = 0; i < seats.length; i++) {
            if (!isSeatBooked[i]) {
                System.out.println(seats);
            }
        }
    }

    static void login() {
        System.out.println("Enter Id: ");
        int tempid = scanf.nextInt();
        if (isRegistered(tempid)) {
            system(tempid);
        } else {
            System.out.println("Are you a New user.\nIf yes, enter 1.");
            int newuser = scanf.nextInt();
            if (newuser == 1) {
                createUser();
            } else {
                System.out.println("Try Again.");
                login();
            }
        }
    }

    static void createUser() {
        System.out.println("Enter Id: ");
        int id = scanf.nextInt();
        user.add(id);
        System.out.println("You are Successfully Registered");
        login();
    }

    static boolean isRegistered(int i) {
        for (int element : user) {
            if (element == i) {
                return true;
            }
        }
        return false;
    }
}



public class IRTC extends Users{
    public static void main(String[] args) {
        login();
    }
}
