package HeadFirstJava;

import java.util.Objects;

public class Car {


    String model;
    String make;

public Car(String carModel, String carMake){
    this.model= carModel;
    this.make=carMake;
}

    @Override
    public String toString() {
        return "HeadFirstJava.Car{" +
                "model='" + model + '\'' +
                ", make='" + make + '\'' +
                '}';

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return model.equals(car.model) && make.equals(car.make);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, make);
    }
}
