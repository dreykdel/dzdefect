package sklad;

//собственный класс исключения с пустым конструктором и единственной ошибкой
public class StockException extends Exception {
    //ед. ошибка
    private String error = "Недостаточно места для хранения продукта";


    public StockException() {

    }

    public String getError() {
        return error;
    }
}
