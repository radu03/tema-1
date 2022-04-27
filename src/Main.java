public class Main {

    public static void main(String[] args) {
        ConcreteCar masinaGalbena = (ConcreteCar) CarFactory.createVideoGameCar("yellow");
        ConcreteCar masinaRosie = (ConcreteCar) CarFactory.createVideoGameCar("red");
        ConcreteCar masinaGalbena1 = (ConcreteCar) CarFactory.createVideoGameCar("yellow");

        masinaGalbena.render();
        masinaRosie.render();
        masinaGalbena1.render();
    }

}
