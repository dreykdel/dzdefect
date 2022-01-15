package sklad;

public class Main {

    public static void main(String[] args) {
        //создали склад
        Sklad1 sklad = new Sklad1(new Dimension(100, 100, 100));
        //создали товары различные
        IndustrialProduct industrialProduct = new IndustrialProduct("Шпалы", new Dimension(10, 10, 10), "Строительные блоки");
        FoodProduct foodProduct = new FoodProduct("Пельмени", new Dimension(5, 5, 5), 12);
        SpecialProduct specialProduct = new SpecialProduct("Уран", new Dimension(10, 10, 10), "Соблюдать правила согласно пункту 1 закона о хранении урана");
        IndustrialProduct veryBigHouseOnWheels = new IndustrialProduct("Дом на колесах", new Dimension(100, 100, 100), "Дома");
        //добавляем товары, все нормально пока не добавляем дом на колесах который больше склада
        try {
            sklad.addIndustrialProduct(industrialProduct);
            sklad.addFoodProduct(foodProduct);
            sklad.addSpecialProduct(specialProduct);
            sklad.addIndustrialProduct(veryBigHouseOnWheels);
        } catch (StockException e) {
            System.out.println(e.getError());
        }
        System.out.println("Все продукты:");
        for (Product product : sklad.getAllProducts()) {
            System.out.println(product.getName());
        }
        System.out.println("\n");
        System.out.println("Промышленные:");
        for (IndustrialProduct product : sklad.getIndustrialProducts()) {
            System.out.println(product.getName());
        }
        System.out.println("\n");
        System.out.println("Пищевые:");
        for (FoodProduct product : sklad.getFoodProducts()) {
            System.out.println(product.getName());
        }
        System.out.println("\n");
        System.out.println("Специальные:");
        for (SpecialProduct product : sklad.getSpecialProducts()) {
            System.out.println(product.getName());
        }
        System.out.println("Место на складе: "+ sklad.getDimension().getVolume());
    }
}
