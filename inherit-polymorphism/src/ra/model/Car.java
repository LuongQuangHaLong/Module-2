package ra.model;

public class Car {
    private String code;
    private String color;
    private String role;
    private int count;

    public Car() {
    }

    public Car(String code, String color, String role, int count) {
        this.code = code;
        this.color = color;
        this.role = role;
        this.count = count;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void run(){
        System.out.println("Running...");
    }
    public void stop(){
        System.out.println("Stop!!!");
    }
    public void makeSound(){
        System.out.println("lew lew");
    }

    @Override
    public String toString() {
        return "Car{" +
                "code='" + code + '\'' +
                ", color='" + color + '\'' +
                ", role='" + role + '\'' +
                ", count=" + count +
                '}';
    }
}
