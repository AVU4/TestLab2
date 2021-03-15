import static java.lang.Double.NaN;

public class TrigonometricFunctions {

    public double getSin(double x, double accuracy) {
        double power;
        double curSum = 0;
        double testSum = -1;
        int fact = 1;
        int i = 1;
        int sign = -1;
        while (Math.abs(curSum - testSum) > accuracy) {
            testSum = curSum;
            power = 1;
            fact = 1;
            for (int j = 1; j <= i; j ++) {
                power = power * x;
                fact = fact * j;
            }
            sign = -1 * sign;
            curSum += sign * power / fact;
            i += 2;
        }
        return curSum;
    }


   public double getCos(double x, double accuracy) {
        double result = Math.sqrt(1 - Math.pow(getSin(x, accuracy), 2));
       if (Math.round(x / Math.PI) % 2 == 0)
            return result;
        else
            return result == 0 ? 0 : -1 * result;
   }

   public double getSec(double x, double accuracy) {
        if (x % Math.PI / 2 == 0) return NaN;
        return 1 / getCos(x, accuracy);
   }

   public double getCot(double x, double accuracy) {
        if (x % Math.PI == 0) return NaN;
        return getCos(x, accuracy) / getSin(x, accuracy);
   }
}
