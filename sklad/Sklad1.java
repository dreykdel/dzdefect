package sklad;

import java.util.ArrayList;
import java.util.List;

//сам склад где раздельно хранятся все виды товаров, было принято решение создать несколько коллекций для хранения для удобства поиска по разным видам
public class Sklad1 {
    private List<IndustrialProduct> industrialProducts = new ArrayList<>();
    private List<FoodProduct> foodProducts = new ArrayList<>();
    private List<SpecialProduct> specialProducts = new ArrayList<>();
    //есть свой размер
    private Dimension dimension;

    public Sklad1 (Dimension dimension) {
        this.dimension = dimension;
    } 

    //получение всех продуктов
    public List<Product> getAllProducts() {
        List<Product> result = new ArrayList<>();
        result.addAll(industrialProducts);
        result.addAll(foodProducts);
        result.addAll(specialProducts);
        return result;
    }

    // добавление промышленного, далее аналогично
    public void addIndustrialProduct(IndustrialProduct product) throws StockException {
        //считаем новый объем
        int newVolume = dimension.getVolume() - product.getDimension().getVolume();
        //если товар больше склада то выбрасывается исключение
        if (newVolume < 0) {
            throw new StockException();
        }
        // иначе меняется место на складе и добавляется продукт
        dimension.setVolume(newVolume);
        industrialProducts.add(product);
    }

    public void addFoodProduct(FoodProduct product) throws StockException {
        int newVolume = dimension.getVolume() - product.getDimension().getVolume();
        if (newVolume < 0) {
            throw new StockException();
        }
        dimension.setVolume(newVolume);
        foodProducts.add(product);
    }

    public void addSpecialProduct(SpecialProduct product) throws StockException {
        int newVolume = dimension.getVolume() - product.getDimension().getVolume();
        if (newVolume < 0) {
            throw new StockException();
        }
        dimension.setVolume(newVolume);
        specialProducts.add(product);
    }

    public List<IndustrialProduct> getIndustrialProducts() {
        return industrialProducts;
    }

    public void setIndustrialProducts(List<IndustrialProduct> industrialProducts) {
        this.industrialProducts = industrialProducts;
    }

    public List<FoodProduct> getFoodProducts() {
        return foodProducts;
    }

    public void setFoodProducts(List<FoodProduct> foodProducts) {
        this.foodProducts = foodProducts;
    }

    public List<SpecialProduct> getSpecialProducts() {
        return specialProducts;
    }

    public void setSpecialProducts(List<SpecialProduct> specialProducts) {
        this.specialProducts = specialProducts;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }
}
