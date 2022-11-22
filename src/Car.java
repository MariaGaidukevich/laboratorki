public class Car {
    private String name;
    private String color;
    private double weight;

    public Car(String name, String color, double weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public Car(String color) {
        this.color = color;
    }

    public Car(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public Car() {

    }

    public void carInfo() {
        if (name != null && color != null && weight != 0) {
            System.out.printf("Name:%s Car color:%s Car weight:%.1f \n", name, color, weight);
        } else if (name == null && color != null && weight != 0) {
            System.out.printf("Car color:%s Car weight %.1f\n ", color, weight);
        } else if (name == null && color != null && weight == 0) {
            System.out.printf("Car color:%s\n", color);
        } else if (name == null && color == null && weight == 0) {
            System.out.println("Car is undefined");
        }
    }

}
