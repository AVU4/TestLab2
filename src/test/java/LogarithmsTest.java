import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.math.BigDecimal;

import static org.mockito.ArgumentMatchers.*;

public class LogarithmsTest {

    @Test
    public void testModuleLogarithmSecondBase(){
        Logarithms logarithms = Mockito.spy(Logarithms.class);
        Mockito.when(logarithms.getNaturalLogarithm(eq(1), anyDouble())).thenReturn(0.0);
        Mockito.when(logarithms.getNaturalLogarithm(eq(0), anyDouble())).thenReturn(Double.NaN);
        Mockito.when(logarithms.getNaturalLogarithm(eq(0.44), anyDouble())).thenReturn(-0.821);
        Mockito.when(logarithms.getNaturalLogarithm(eq(0.67), anyDouble())).thenReturn(-0.4);
        Mockito.when(logarithms.getNaturalLogarithm(eq(5.33), anyDouble())).thenReturn(1.673);
        Assertions.assertEquals(0,logarithms.getLogarithmSecondBase(1, 0.00001));
        Assertions.assertEquals(Double.NaN, logarithms.getLogarithmSecondBase(0, 0.01));
        Assertions.assertEquals(-1.184, BigDecimal.valueOf(logarithms.getLogarithmSecondBase(0.44, 0.0001)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());
        Assertions.assertEquals(-0.577, BigDecimal.valueOf(logarithms.getLogarithmSecondBase(0.67, 0.00001)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());
        Assertions.assertEquals(2.414, BigDecimal.valueOf(logarithms.getLogarithmSecondBase(5.33, 0.00001)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());
    }

}
