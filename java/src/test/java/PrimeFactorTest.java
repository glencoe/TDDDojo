import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeFactorTest {

    @Test
    void one() {
        assertEquals(list(), Kata.primeFactors(1));
    }

}
