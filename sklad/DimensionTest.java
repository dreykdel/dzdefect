package sklad;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DimensionTest {

    @Test
    void getVolume() {
        Dimension dimension = new Dimension(10, 10, 10);
        assertEquals(1000, dimension.getVolume());
    }


}