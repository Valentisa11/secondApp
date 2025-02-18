public class Speedboat extends TransportVehicle {
    @Override
    public String getType() {
        return "Катер";
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
        return "Возит грузы";
    }


}
