/**
 * Класс для создания объекта Станция Технического обслуживания. Принимает любой вид Транспорта.
 */
public class ServiceStation {
    /**
     * Метод для обслуживания транспорта.
     *
     * @param transport - параметр типа Транспорт.
     */
    void service(Transport transport) {
        transport.service();
    }
}
