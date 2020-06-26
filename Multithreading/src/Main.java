public class Main {

    static boolean vin = false;

    public static void main(String[] args) {
        int random = (int) (Math.random() * 1000000000);
        System.out.println(random);
        Thread timer = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                try {
                    while (!vin) {
                        System.out.println();
                        i++;
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                }
            }
        });
        Thread player = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!vin) {
                    int guessNumber = (int) (Math.random() * 1000000000);
                    if (guessNumber == random) {
                        vin = true;
                        System.out.println(guessNumber);
                    }
                }
            }
        });
        timer.start();
        player.start();
    }
}
