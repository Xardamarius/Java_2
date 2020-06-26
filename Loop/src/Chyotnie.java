public class Chyotnie {
    public static void main(String[] args) {
        int i = 1000;
        while (i >= 0) {
            System.out.println(i);
            i--;
            i--;
            if (i == 0) {
                break;
            }
        }
    }
}
