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
        Thread p1 = new Passenger(system, "Aditya");
        Thread p2 = new Passenger(system, "Biswa");
        Thread p3 = new Passenger(system, "Chirag");
        Thread p4 = new Passenger(system, "Depender");
        Thread p5 = new Passenger(system, "Elisha");
        Thread p6 = new Passenger(system, "Faizan");

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();
    }
}
