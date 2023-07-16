package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        if (multiplyByAndToInclusive != 0) {
            int i = 0;
            int sign = multiplyByAndToInclusive < 0 ? -1 : 1;
            while ( i <= Math.abs(multiplyByAndToInclusive)) {
                System.out.println(Math.abs(multiplyByAndToInclusive) * i * sign);
                i++;
            }
        }
    }
}
