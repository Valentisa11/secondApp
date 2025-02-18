public class Truck extends TransportVehicle {
    @Override
    public String getType() {
        return "Грузовик";
    }

    @Override
    public String hasWings() {
        return "Нет";
    }

    @Override
    public String hasWheels() {
        return "Есть";
    }

    @Override
    public String hasPropeller() {
        return "Нет";
    }

    @Override
    public String ToCarryCargo() {
        return "Возит груз";
    }


}
