import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        TrigonometricFunctions trigonometricFunctions = new TrigonometricFunctions();
        System.out.println(0.986/0.164);
        System.out.println(trigonometricFunctions.getSin(0.165, 0.00001));
        System.out.println(trigonometricFunctions.getCos(0.165, 0.00001));
        System.out.println(trigonometricFunctions.getCos(0.165, 0.0000001) / trigonometricFunctions.getSin(0.165, 0.0000001));
    }
}