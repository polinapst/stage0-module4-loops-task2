package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int i = 0;

        while (i <= printToInclusive) {
            int k = 1;
            int result = 1;

            while (k <= i) {
                result *= k;
                k++;
            }
            System.out.println(result);
            i++;
        }
    }
}
