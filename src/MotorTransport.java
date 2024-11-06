/**
 * Абстрактный класс для создания объектов типа Транспорт с Мотором. Наследуется от родительского класс Колёсный транспорт.
 */
public abstract class MotorTransport extends WheeledTransport {
    private String typeEngine;

    public MotorTransport(Integer numberWheels, Integer maxSpeedLimit, String typeEngine) {
        super(numberWheels, maxSpeedLimit);
        this.typeEngine = typeEngine;
    }

    public String getTypeEngine() {
        return typeEngine;
    }

    public void setTypeEngine(String typeEngine) {
        this.typeEngine = typeEngine;
    }

    /**
     * Переопределенный метод для обслуживания двигателя Транспорта с Мотором.
     */
    @Override
    public void service() {
        System.out.print(" был обслужен двигатель типа - " + typeEngine + " ");
        super.service();
    }
}
