import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.junit.jupiter.api.Test;

public class CurrencyConverterTest {

    @Test
    public void testConvert() {
        CurrencyConverter converter = new CurrencyConverter();
        BigDecimal originalAmount = BigDecimal.valueOf(100.00);
        BigDecimal rate = BigDecimal.valueOf(2.70);
        BigDecimal expectedResult = BigDecimal.valueOf(270.00).setScale(2, RoundingMode.HALF_UP);
        BigDecimal actualResult = converter.convert(originalAmount, rate);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testConvertCheckRounding() {
        CurrencyConverter converter = new CurrencyConverter();
        BigDecimal originalAmount = BigDecimal.valueOf(99.99);
        BigDecimal rate = BigDecimal.valueOf(0.055);
        BigDecimal expectedResult = BigDecimal.valueOf(5.50).setScale(2, RoundingMode.HALF_UP);
        BigDecimal actualResult = converter.convert(originalAmount, rate);
        assertEquals(expectedResult, actualResult);
    }
    
    @Test
    public void testIsValidWhenInAllowedRange() {
        CurrencyConverter converter = new CurrencyConverter();
        BigDecimal rate = BigDecimal.valueOf(0.055);
        assertTrue(converter.isValid(rate));
    }
    
    @Test
    public void testIsValidWhenRateIsNull() {
        CurrencyConverter converter = new CurrencyConverter();
        assertFalse(converter.isValid(null));
    }

}






