public class Hangar {
    public static void main(String[] args) {
        Car car = new Car("Megane", 0);
        Boat boat = new Boat("Bismark", 0);
        System.out.println(car.doStuff());
        System.out.println(boat.doStuff());

    }

}