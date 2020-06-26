public class Main {
    public static void main(String[] args) {
        try {
            int[] array = new int[10];
            System.out.println(array[25]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }
    }
}
