package sklad;

import java.util.Objects;

//промышленный товар у которого есть категория: категории легкой, средней, тяжелеой промышленности
public class IndustrialProduct extends Product {
    private String category;

    public IndustrialProduct(String name, Dimension dimension, String category) {
        super(name, dimension);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IndustrialProduct)) return false;
        if (!super.equals(o)) return false;
        IndustrialProduct that = (IndustrialProduct) o;
        return Objects.equals(getCategory(), that.getCategory());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getCategory());
    }
}
