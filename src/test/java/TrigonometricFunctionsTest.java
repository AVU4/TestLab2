import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.math.BigDecimal;

import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.ArgumentMatchers.eq;

public class TrigonometricFunctionsTest {

    @Test
    public void testCos(){
        TrigonometricFunctions trigonometricFunctions = Mockito.spy(TrigonometricFunctions.class);
        Mockito.when(trigonometricFunctions.getSin(eq(-3.14), anyDouble())).thenReturn(0.0);
        Mockito.when(trigonometricFunctions.getSin(eq(-1.57), anyDouble())).thenReturn(-1.0);
        Mockito.when(trigonometricFunctions.getSin(eq(0), anyDouble())).thenReturn(0.0);
        Mockito.when(trigonometricFunctions.getSin(eq(1.57), anyDouble())).thenReturn(1.0);
        Mockito.when(trigonometricFunctions.getSin(eq(3.14), anyDouble())).thenReturn(0.0);
        Mockito.when(trigonometricFunctions.getSin(eq(-1.1), anyDouble())).thenReturn(-0.891);
        Mockito.when(trigonometricFunctions.getSin(eq(2.53), anyDouble())).thenReturn(0.574);
        Assertions.assertEquals(-1, trigonometricFunctions.getCos(-3.14, 0.0001));
        Assertions.assertEquals(0, trigonometricFunctions.getCos(-1.57, 0.00001));
        Assertions.assertEquals(1, trigonometricFunctions.getCos(0, 0.0001));
        Assertions.assertEquals(0, trigonometricFunctions.getCos(1.57, 0.00001));
        Assertions.assertEquals(-1, trigonometricFunctions.getCos(3.14, 0.00001));
        Assertions.assertEquals(0.454, BigDecimal.valueOf(trigonometricFunctions.getCos(-1.1, 0.00001)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());
        Assertions.assertEquals(-0.819, BigDecimal.valueOf(trigonometricFunctions.getCos(2.53, 0.00001)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());
    }

    @Test
    public void testCot(){
        TrigonometricFunctions trigonometricFunctions = Mockito.spy(TrigonometricFunctions.class);
        Mockito.when(trigonometricFunctions.getCos(eq(0.165), anyDouble())).thenReturn(0.98641);
        Mockito.when(trigonometricFunctions.getSin(eq(0.165), anyDouble())).thenReturn(0.16425);
        Mockito.when(trigonometricFunctions.getCos(eq(0.465), anyDouble())).thenReturn(0.893821);
        Mockito.when(trigonometricFunctions.getSin(eq(0.465), anyDouble())).thenReturn(0.448422);
        Mockito.when(trigonometricFunctions.getSin(eq(1.57), anyDouble())).thenReturn(1.0);
        Mockito.when(trigonometricFunctions.getCos(eq(1.57), anyDouble())).thenReturn(0.0);
        Mockito.when(trigonometricFunctions.getCos(eq(2.2), anyDouble())).thenReturn(-0.5885);
        Mockito.when(trigonometricFunctions.getSin(eq(2.2), anyDouble())).thenReturn(0.8084);
        Assertions.assertEquals(6.006, BigDecimal.valueOf(trigonometricFunctions.getCot(0.165, 0.000001)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());
        Assertions.assertEquals(1.993, BigDecimal.valueOf(trigonometricFunctions.getCot(0.465, 0.00001)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());
        Assertions.assertEquals(0.0, trigonometricFunctions.getCot(1.57, 0.0001));
        Assertions.assertEquals(-0.728, BigDecimal.valueOf(trigonometricFunctions.getCot(2.2, 0.0001)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());
    }

    @Test
    public void testSec() {
        TrigonometricFunctions functions = Mockito.spy(TrigonometricFunctions.class);
        Mockito.when(functions.getCos(eq(-1.47), anyDouble())).thenReturn(0.100626);
        Mockito.when(functions.getCos(eq(-0.6), anyDouble())).thenReturn(0.8253);
        Mockito.when(functions.getCos(eq(0.9), anyDouble())).thenReturn(0.6216);
        Mockito.when(functions.getCos(eq(2.42), anyDouble())).thenReturn(-0.75075);
        Mockito.when(functions.getCos(eq(3.14), anyDouble())).thenReturn(-1.0);
        Mockito.when(functions.getCos(eq(4.2), anyDouble())).thenReturn(-0.4903);
        Assertions.assertEquals(9.938, BigDecimal.valueOf(functions.getSec(-1.47, 0.000001)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());
        Assertions.assertEquals(1.212, BigDecimal.valueOf(functions.getSec(-0.6, 0.00001)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());
        Assertions.assertEquals(1.609, BigDecimal.valueOf(functions.getSec(0.9, 0.00001)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());
        Assertions.assertEquals(-1.332, BigDecimal.valueOf(functions.getSec(2.42, 0.00001)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());
        Assertions.assertEquals(-1, functions.getSec(3.14, 0.0001));
        Assertions.assertEquals(-2.040, BigDecimal.valueOf(functions.getSec(4.2, 0.0001)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());

    }

}
