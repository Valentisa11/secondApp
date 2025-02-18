public class Taxi extends TransportVehicle {
    @Override
    public String getType() {
        return "Такси";
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
