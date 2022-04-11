import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.function.BooleanSupplier;

public class CurrencyConverter {

    public CurrencyConverter() {
    }

    public static void main(String[] args) {
        System.out.println("Hello CurrencyConverter");
    }

    public BigDecimal convert(BigDecimal originalAmount, BigDecimal rate) {
        BigDecimal result = originalAmount.multiply(rate).setScale(2, RoundingMode.HALF_UP);
        return result;
    }

    public boolean isValid(BigDecimal rate) {
        // TODO Auto-generated method stub
        return false;
    }

}
