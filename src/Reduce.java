public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int steps = 0;
        while (n != 0) {
            n = (n % 2 == 0) ? n / 2 : n - 1;
            steps ++;
        }
        System.out.println(steps); // Should be 2 for n = 2
    }
}
