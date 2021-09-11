import java.util.Random;

public class Car implements CarInterface {

    private String name;
    private int location;

    public Car(String name, int location) {
        if(lengthCheck(name)) {
            throw new IllegalArgumentException("자동차 이름은 5자를 초과하면 안돼요.");
        }
        this.name = name;
        this.location = location;
    }

    public boolean lengthCheck(String name) {
        return name.length() > 5;
    }

    public int getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        Random random = new Random();
        this.location = this.location += random.nextInt(10);
    }

    @Override
    public void result() {
        System.out.print(name + " : ");
        System.out.print(location);
        System.out.println();
    }

}