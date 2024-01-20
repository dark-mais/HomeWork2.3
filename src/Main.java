public class Main {
    public static void main(String[] args) {
        Car[] car = {
                new Car("car1", 4),
                new Car("car2", 4),
        };

        Truck[] truck = {
                new Truck("truck1", 6),
                new Truck("truck2", 8),
        };

        Bicycle[] bicycle = {
                new Bicycle("bicycle1", 2),
                new Bicycle("bicycle2", 2),
        };

        ServiceStation station = new ServiceStation();
        station.check(car[0], null, null);
        station.check(car[1], null, null);
        station.check(null, bicycle[0], null);
        station.check(null, bicycle[1], null);
        station.check(null, null, truck[0]);
        station.check(null, null, truck[1]);
    }
}