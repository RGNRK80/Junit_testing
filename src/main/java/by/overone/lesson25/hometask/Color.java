package by.overone.lesson25.hometask;

public class Color {
    String color;

    public Color() {
    }

    Color (String color) {
        this.color=color;
    }

    String putDarker()
    { this.color="Darker"+color;
        return color;
    }

}
