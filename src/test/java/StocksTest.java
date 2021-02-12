import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StocksTest {

    Stocks stocks;

    @BeforeEach
    void setUp() {
        stocks=new Stocks("P1",12.0,"accra","AD130");
    }

    @Test
    @DisplayName("CalculatePriceForProductTypeStocks")
    void calculateCurrentPriceForProductType() {
        assertEquals(12.0,stocks.calculateCurrentPrice(),0.1);
    }
}