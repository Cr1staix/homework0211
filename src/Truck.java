/**
 * Класс для создания объекта типа Грузовой автомобиль. Наследуется от класса Транспорт с Мотором. Класс является финальным
 * в данной иерархии классов.
 */
public final class Truck extends MotorTransport {
    private String brand;
    private Integer capacity;

    public Truck(Integer numberWheels, Integer maxSpeedLimit, String typeEngine, String brand, Integer capacity) {
        super(numberWheels, maxSpeedLimit, typeEngine);
        this.brand = brand;
        this.capacity = capacity;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Переопределенный метод для обслуживания объекта типа Грузовой автомобиль.
     */
    @Override
    public void service() {
        System.out.print("Обслужена грузовая машина " + brand + " грузоподъёмностью " + capacity + "кг");
        super.service();

    }
}
