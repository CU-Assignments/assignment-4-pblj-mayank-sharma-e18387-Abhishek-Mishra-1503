import java.util.concurrent.*;

class TicketBookingSystem {
    private int availableSeats = 5;

    public synchronized boolean bookTicket(String passenger) {
        if (availableSeats > 0) {
            availableSeats--;
            System.out.println(passenger + " successfully booked a ticket.");
            return true;
        } else {
            System.out.println("No tickets available for " + passenger);
            return false;
        }
    }
}

class Passenger extends Thread {
    private TicketBookingSystem system;
    private String name;

    public Passenger(TicketBookingSystem system, String name) {
        this.system = system;
        this.name = name;
    }

    @Override
    public void run() {
        system.bookTicket(name);
    }
}

public class Main {
    public static void main(String[] args) {
        TicketBookingSystem system = new TicketBookingSystem();
        Thread p1 = new Passenger(system, "Alice");
        Thread p2 = new Passenger(system, "Bob");
        Thread p3 = new Passenger(system, "Charlie");
        Thread p4 = new Passenger(system, "David");
        Thread p5 = new Passenger(system, "Eve");
        Thread p6 = new Passenger(system, "Frank");

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();
    }
}
