public class SportsCar extends Car {

    public SportsCar(String model) {
        // sports car has a bigger tank and starts at 0 speed
        super(model, 60, 0);
    }

    @Override
    public void accelerate() {
        if (fuel > 0) {
            speed += 20;   // faster acceleration
            fuel -= 1.0;   // higher fuel use
        }
    }

    @Override
    public void decelerate(int amount) {
        if (fuel > 0 && amount > 0) {
            speed -= (amount * 2);  // stronger deceleration
            if (speed < 0) speed = 0;
        }
    }
}
