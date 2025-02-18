public class Plane extends TransportVehicle {

    @Override
    public String getType() {
        return "Самолёт";
    }

    @Override
    public String hasWings() {
        return "Есть";
    }

    @Override
    public String hasWheels() {
        return "Есть";
    }

    @Override
    public String hasPropeller() {
        return "Есть";
    }

    @Override
    public String ToCarryCargo() {
        return "Возит груз";
    }

}
