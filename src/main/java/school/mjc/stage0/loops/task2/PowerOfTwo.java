package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power < 0) {
            System.out.println("too much power");
        } else {
            int currentPower = 1;
            int maxPower = (int)Math.pow(2, power);

            while (currentPower <= maxPower) {
                System.out.println(currentPower);
                currentPower *= 2;
            }
        }
    }
}
