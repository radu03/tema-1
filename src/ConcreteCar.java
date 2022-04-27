public class ConcreteCar implements VideoGameCar {

    int id;
    String color;

    @Override
    public void render() {
        System.out.println("Rendering a " + color + " car with the id "+ id);
    }

    @Override
    public String getColor() {
        return this.color;
    }

    public ConcreteCar(int id, String color) {
        this.id = id;
        this.color = color;
    }
}
