public class MathSystems {

    private Logarithms logarithms;
    private TrigonometricFunctions trigonometricFunctions;

    public MathSystems(){
        this.trigonometricFunctions = new TrigonometricFunctions();
        this.logarithms = new Logarithms();
    }

    public double getResult(double x, double accuracy) {
        if (x > 0) {
            return Math.pow(Math.pow(Math.pow((logarithms.getLogarithmSecondBase(x, accuracy) / logarithms.getNaturalLogarithm(x, accuracy)) * logarithms.getLogarithmSecondBase(x, accuracy), 2), 2), 3);
        }else {
            return (((Math.pow((trigonometricFunctions.getSec(x, accuracy) + trigonometricFunctions.getCot(x, accuracy)), 3) + trigonometricFunctions.getSec(x, accuracy)) - trigonometricFunctions.getSin(x, accuracy)) * trigonometricFunctions.getCot(x, accuracy));
        }
    }

}
