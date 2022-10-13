package Task1;

public class Main {
    public static void main(String[] args) {

        Driver chevyLover = new Driver("Yusuf", 21);
        Car chevy = new Car("Chevrolet", "Spark", 2013, "cityCar");
        chevy.setDriver(chevyLover);
        System.out.println(chevy + chevyLover.toString());

        Car ShittyCar = new Car("Toyota", "Alto", 2006, "tiny car");
        ShittyCar.setDriver(chevyLover);
        System.out.println(ShittyCar + chevyLover.toString());
    }
}