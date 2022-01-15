package sklad;

import java.util.Objects;

// абстрактный класс товара, у всех товаров всегда есть название и размер
public abstract class Product {
    private String name;
    private Dimension dimension;

    public Product(String name, Dimension dimension) {
        this.name = name;
        this.dimension = dimension;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Objects.equals(getName(), product.getName()) &&
                Objects.equals(getDimension(), product.getDimension());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getDimension());
    }
}
