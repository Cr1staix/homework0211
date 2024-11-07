/**
 * Класс для создания объекта типа Легковой автомобиль. Наследуется от класса Транспорт с Мотором. Класс является финальным
 * в данной иерархии классов.
 */
public final class Car extends MotorTransport {
    private String brand;
    private String model;

    public Car(Integer numberWheels, Integer maxSpeedLimit, String typeEngine, String brand, String model) {
        super(numberWheels, maxSpeedLimit, typeEngine);
        this.brand = brand;
        this.model = model;
    }

    /**
     * Переопределенный метод для обслуживания объекта типа Легковой автомобиль.
     */
    @Override
    public void service() {
        System.out.print("Легковая  машина " + brand + " " + model);
        super.service();
    }
}
