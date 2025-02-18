public class Helicopter extends TransportVehicle {


    @Override
    public String getType() {
        return "Вертолёт";
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
        return "Есть";
    }

    @Override
    public String ToCarryCargo() {
        return "Возит груз";
    }


}
