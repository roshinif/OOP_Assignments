public class CoffeeMakerDriver {
    public static void main(String[] args) {
        CoffeeMaker cm = new CoffeeMaker();

        cm.togglePower();
        cm.chooseCoffeeType("espresso");
        cm.chooseCoffeeVolume(50);
        cm.togglePower();
    }
}
