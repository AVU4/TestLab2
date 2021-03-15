public class Logarithms {

    public double getNaturalLogarithm(double x, double accuracy) {
        if (x > 0) {
            int i = 1;
            double curResult = 0;
            double testResult = -1;
            while (Math.abs(curResult - testResult) > accuracy) {
                testResult = curResult;
                curResult += Math.pow((x - 1) / (x + 1), i) / i;
                i += 2;
            }
            curResult *= 2;
            return curResult;
        }else return Double.NaN;
    }

    public double getLogarithmSecondBase(double x, double accuracy) {
        return getNaturalLogarithm(x, accuracy) / getNaturalLogarithm(2, accuracy);
    }
}
