import ra.model.SportCar;

public class Main {
    public static void main(String[] args) {
        SportCar sportCar = new SportCar();
        sportCar.setCode("XXX001");
        sportCar.setColor("Black");
        sportCar.setCount(2);
        sportCar.setRole("V5");
        sportCar.setLight("White");
        System.out.println(sportCar.toString());
        System.out.println(sportCar);
        sportCar.makeSound();
    }
}