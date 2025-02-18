public class Tanker extends TransportVehicle {
    @Override
    public String getType() {
        return "Танкер";
    }

    @Override
    public String hasWings() {
        return "Нет";
    }

    @Override
    public String hasWheels() {
        return "Нет";
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
