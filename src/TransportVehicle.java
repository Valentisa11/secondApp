public abstract class TransportVehicle {
    public abstract String getType();

    public abstract String hasWings();
    public abstract String hasWheels();
    public abstract String hasPropeller();
    public abstract String ToCarryCargo();

public void info() {
        System.out.println(getType());
        System.out.println("Есть крылья: " + hasWings());
        System.out.println("Есть винт: " + hasPropeller());
        System.out.println("Есть колёса: " + hasWheels());
        System.out.println(ToCarryCargo());
    }

}
