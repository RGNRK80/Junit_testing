package by.overone.lesson25.hometask;

public class Engine {
    int power;

    public Engine() {
    }

    public Engine(int power) {
        this.power = power;
    }

    int getTurbo() {
        this.power=(int)(power*1.1);
        return power;
    }
}
