import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuturesTest {

    Futures futures;


    @BeforeEach
    void setUp() {
        futures=new Futures("P2",122.0,"accra","12e",2,2012);
    }

    @Test
    @DisplayName("CalculatePriceForProductTypeFutures")
    void calculateCurrentPriceForProductType() {
        assertEquals(122.0,futures.calculateCurrentPrice(),0.1);
    }
}