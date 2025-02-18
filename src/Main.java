
public class Main {
    public static void main(String[] args) {

        TransportVehicle plane = new Plane();
        TransportVehicle taxi = new Taxi();
        TransportVehicle helicopter = new Helicopter();
        TransportVehicle speedboat = new Speedboat();
        TransportVehicle tanker = new Tanker();
        TransportVehicle truck = new Truck();

        helicopter.info();
        System.out.println("■■■■■■■■■■■■■■■■■");
        plane.info();
        System.out.println("■■■■■■■■■■■■■■■■■");
        taxi.info();
        System.out.println("■■■■■■■■■■■■■■■■■");
        speedboat.info();
        System.out.println("■■■■■■■■■■■■■■■■■");
        tanker.info();
        System.out.println("■■■■■■■■■■■■■■■■■");
        truck.info();
        System.out.println("■■■■■■■■■■■■■■■■■");

    }
}