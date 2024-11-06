
public class Main {
    public static void main(String[] args) {
        Bicycle bike1 = new Bicycle(2, 30, "Шоссейный");
        Car car1 = new Car(4, 220, "бензин", "KIA", "Sportage");
        Truck truck1 = new Truck(8, 180, "Дизель", "Volvo", 18000);

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.service(bike1);
        serviceStation.service(car1);
        serviceStation.service(truck1);
    }
}