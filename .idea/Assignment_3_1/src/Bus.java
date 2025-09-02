public class Bus extends Car {
    private int passengers;
    private int maxPassengers;

    public Bus(String model, int maxPassengers) {
        // Call Car constructor → bus tank is bigger (100L), starts at 0 speed
        super(model, 100, 0);
        this.maxPassengers = maxPassengers;
        this.passengers = 0;
    }

    public void passengerEnter() {
        if (passengers < maxPassengers) {
            passengers++;
            System.out.println("One passenger entered. Total passengers: " + passengers);
        } else {
            System.out.println("Bus is full! Cannot take more passengers.");
        }
    }

    public void passengerExit() {
        if (passengers > 0) {
            passengers--;
            System.out.println("One passenger left. Total passengers: " + passengers);
        } else {
            System.out.println("No passengers in the bus.");
        }
    }

    public int getPassengers() {
        return passengers;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }
}
