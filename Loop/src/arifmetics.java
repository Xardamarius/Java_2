public class arifmetics {
    public static void main(String[] args) {
        int sum = 0;
        int count = 1;
        while (count <= 100) {
            sum += count;
            count++;
            System.out.println(sum);
        }
        float result = sum / (float) count;
        System.out.println(count);
        System.out.println(result);
    }
}
