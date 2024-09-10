public class Multiples {
    public static void main(String[] args) {
        int multiples = 0;
        for (int i = 1; i < 1000; i++) {
            boolean divisible = (i % 3 == 0) || (i % 5 == 0);
            multiples += divisible ? 1 : 0;
//            if (divisible) {
//                multiples++;
//            }
        }
        System.out.println(multiples);
    }

}