package sklad;

import java.util.Objects;

//класс размера товара, объем считается автоматически при задании длины ширины высоты
public class Dimension {
    private int length;
    private int height;
    private int weight;
    private int volume;

    public Dimension(int length, int height, int weight) {
        this.length = length;
        this.height = height;
        this.weight = weight;
        volume = length * height * weight;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dimension)) return false;
        Dimension dimension = (Dimension) o;
        return getLength() == dimension.getLength() &&
                getHeight() == dimension.getHeight() &&
                getWeight() == dimension.getWeight();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLength(), getHeight(), getWeight());
    }
}
