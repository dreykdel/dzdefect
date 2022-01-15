package sklad;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void getName() {
        SpecialProduct specialProduct = new SpecialProduct("Уран", new Dimension(10, 10, 10), "Соблюдать правила согласно пункту 1 закона о хранении урана");
        assertEquals("Уран", specialProduct.getName());
    }

}