import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        MathSystems systems = new MathSystems();
        double limit = Math.PI/2 - 0.1;
        for (double i = - limit; i < limit; i += 0.1) {
            systems.getResult(i, 0.01);
        }
        Writer.close();
    }
}