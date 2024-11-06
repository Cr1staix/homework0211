/**
 * Абстрактный класс для создания объекта типа колёсный транспорт. Родительский класс для всех объектов типа Колёсный Транспорт.
 * Реализует метод service интерфейса Transport.
 */
public abstract class WheeledTransport implements Transport {
    private Integer wheelCount;
    private Integer maxSpeedLimit;

    public WheeledTransport(Integer numberWheels, Integer maxSpeedLimit) {
        this.wheelCount = numberWheels;
        this.maxSpeedLimit = maxSpeedLimit;
    }

    public Integer getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(Integer numberWheels) {
        this.wheelCount = numberWheels;
    }

    public Integer getMaxSpeedLimit() {
        return maxSpeedLimit;
    }

    public void setMaxSpeedLimit(Integer maxSpeedLimit) {
        this.maxSpeedLimit = maxSpeedLimit;
    }

    /**
     * Метод для обслуживания колёс. Указывает количество обслуженных колёс.
     */
    @Override
    public void service() {
        System.out.println("обслужено " + wheelCount + " колёс");
    }
}
