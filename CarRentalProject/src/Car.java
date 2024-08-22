public class Car {
    private int carId;
    private String carType;

    private String carName;

    private boolean isAvailable;


    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Car(int carId, String carType, String carName, boolean isAvailable) {
        this.carId = carId;
        this.carType = carType;
        this.carName = carName;
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", carType='" + carType + '\'' +
                ", carName='" + carName + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
