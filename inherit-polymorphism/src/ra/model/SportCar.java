package ra.model;

public class SportCar extends Car{
    private String light;

    public String getLight() {
        return light;
    }

    public void setLight(String light) {
        this.light = light;
    }

    public SportCar() {
    }

    public SportCar(String code, String color, String role, int count, String light) {
        super(code, color, role, count); // gọi đến constructor của lớp cha
        this.light = light;
    }

    private void drift(){
        System.out.println("Drifting....");
    }

    @Override
    public String toString() {
        return super.toString()+" light: " +light;
    }
    @Override
    public void makeSound(){
        System.out.println("cac cac");
    }
}
