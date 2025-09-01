public class TelevisionViewer {
    public static void main(String[] args) {
        Television myTV = new Television();

        for (int dayCount = 1; dayCount <= 10; dayCount++) {
            System.out.println("Woke up, day " + dayCount);

            boolean doneWatching = false; s

            if (!myTV.isPowered()) {
                myTV.togglePower();
            }

            while (!doneWatching) {
                System.out.println("Watching channel " + myTV.getCurrentChannel());
                myTV.changeChannel(myTV.getCurrentChannel() + 1);
                if (myTV.getCurrentChannel() % 4 == 0) {
                    doneWatching = true;
                }
            }

            myTV.togglePower();
            System.out.println("Falling asleep");
        }
    }
}
