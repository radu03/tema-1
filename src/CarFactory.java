import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class CarFactory {

    private static Map<String, VideoGameCar> carsCache
            = new HashMap<>();

    public static VideoGameCar createVideoGameCar(String color) {
        VideoGameCar newVehicle = carsCache.computeIfAbsent(color, newColor -> {
            Random r = new Random();
            int newID = r.nextInt(50);
            return new ConcreteCar(newID, newColor);
        });
        return newVehicle;
    }
}
