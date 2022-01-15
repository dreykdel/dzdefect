package sklad;

import java.util.Objects;

// особый товар обладающий особыми условиями хранения
public class SpecialProduct extends Product {
    private String storageConditions;

    public SpecialProduct(String name, Dimension dimension, String storageConditions) {
        super(name, dimension);
        this.storageConditions = storageConditions;
    }

    public String getStorageConditions() {
        return storageConditions;
    }

    public void setStorageConditions(String storageConditions) {
        this.storageConditions = storageConditions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SpecialProduct)) return false;
        if (!super.equals(o)) return false;
        SpecialProduct that = (SpecialProduct) o;
        return Objects.equals(getStorageConditions(), that.getStorageConditions());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getStorageConditions());
    }
}
