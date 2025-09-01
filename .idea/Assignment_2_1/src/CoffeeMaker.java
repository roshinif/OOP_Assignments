public class CoffeeMaker {
    private boolean powerOn;
    private String typeOfCoffee;
    private int coffeeVolume;     // 10–50 ml

    public CoffeeMaker() {
        this.powerOn = false;
        this.typeOfCoffee = "normal";
        this.coffeeVolume = 20;
    }

    public void togglePower() {
        powerOn = !powerOn;
        if (powerOn)
            System.out.println("Coffee maker is on");
        else
            System.out.println("Coffee maker is off");
    }

    public void chooseCoffeeType(String coffeeType) {
        if (powerOn && (coffeeType.equals("normal") || coffeeType.equals("espresso"))) {
            this.typeOfCoffee = coffeeType;
            System.out.println("Coffee type is " + typeOfCoffee);
        }
    }

    public void chooseCoffeeVolume(int volume) {
        if (powerOn && volume >= 10 && volume <= 50) {
            this.coffeeVolume = volume;
            System.out.println("Coffee amount is " + coffeeVolume + " ml");
        }
    }
}
