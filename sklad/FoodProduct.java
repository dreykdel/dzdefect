package sklad;

import java.util.Objects;

// пищевой товар есть срок годности указывается в месяцах
public class FoodProduct extends Product {
    private int shelfLife;

    public FoodProduct(String name, Dimension dimension, int shelfLife) {
        super(name, dimension);
        this.shelfLife = shelfLife;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FoodProduct)) return false;
        if (!super.equals(o)) return false;
        FoodProduct that = (FoodProduct) o;
        return getShelfLife() == that.getShelfLife();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getShelfLife());
    }
}