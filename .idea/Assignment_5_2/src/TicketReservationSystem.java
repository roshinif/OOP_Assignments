class Theater {
    private int availableSeats;

    public Theater(int seats) {
        this.availableSeats = seats;
    }

    public synchronized boolean reserveSeats(int customerId, int numSeats) {
        if (numSeats <= availableSeats) {
            System.out.println("Customer " + customerId + " reserved " + numSeats + " tickets.");
            availableSeats -= numSeats;
            return true;
        } else {
            System.out.println("Customer " + customerId + " couldn't reserve " + numSeats + " tickets.");
            return false;
        }
    }
}

class Customer extends Thread {
    private Theater theater;
    private int customerId;
    private int numSeats;

    public Customer(Theater theater, int customerId, int numSeats) {
        this.theater = theater;
        this.customerId = customerId;
        this.numSeats = numSeats;
    }

    public void run() {
        theater.reserveSeats(customerId, numSeats);
    }
}

public class TicketReservationSystem {
    public static void main(String[] args) {
        int totalSeats = 10; // example theater capacity
        Theater theater = new Theater(totalSeats);

        int[] seatRequests = {2, 1, 2, 3, 1, 2, 1, 1, 3, 3, 2, 4, 1, 4, 3};

        for (int i = 0; i < seatRequests.length; i++) {
            Customer c = new Customer(theater, i + 1, seatRequests[i]);
            c.start();
        }
    }
}
