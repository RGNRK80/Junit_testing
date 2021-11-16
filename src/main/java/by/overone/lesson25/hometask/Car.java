package by.overone.lesson25.hometask;

public class Car {
    Color color;
    Engine engine;
    Types type;

    public Car(Color color, Engine engine, Types type) {
        this.color = color;
        this.engine = engine;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color=" + color.color +
                ", engine=" + engine.power +
                ", type=" + type.toString() +
                '}';
    }
}
