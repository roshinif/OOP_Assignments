public class Television {
    private boolean powerOn;
    private int currentChannel;

    public Television() {
        this.powerOn = false;
        this.currentChannel = 1;
    }

    public boolean isPowered() {
        return powerOn;
    }

    public void togglePower() {
        powerOn = !powerOn;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void changeChannel(int newChannel) {
        if (!powerOn) return;
        int wrapped = newChannel % 10;
        if (wrapped <= 0) wrapped += 10;
        this.currentChannel = wrapped;
    }
}
