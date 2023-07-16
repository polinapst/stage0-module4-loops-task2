package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i = 2;

        while (i <= printToInclusive) {
            int j = 2;
            int k = 0;

            while (j < i) {
                if (i % j == 0) {
                    k++;
                }
                j++;
            }

            if (k == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
