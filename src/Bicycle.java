/**
 * Дочерний класс для создания объекта типа Велосипед. Наследуется от родительского класса Колёсный Транспорт. Является финальным
 * в данной иерархии классов.
 */
public final class Bicycle extends WheeledTransport {
    private String type;

    public Bicycle(Integer numberWheels, Integer maxSpeedLimit, String type) {
        super(numberWheels, maxSpeedLimit);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * Переопределенный метод для обслуживания объекта типа Велосипед.
     */
    @Override
    public void service() {
        System.out.print("Обслужено навесное оборудование Велосипеда типа " + type + " ");
        super.service();
    }
}
