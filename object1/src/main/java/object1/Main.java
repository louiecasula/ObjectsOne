package object1;

import java.util.logging.Logger;

public class Main {

    public static void main(String... args) {
        Logger logger = Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");

        Person person1 = new Person("John", 30, 160);

        Car suv = new Car("Chevy", "Equinox", 2005, 200000);
        System.out.print("This car's year is: " + suv.getYear());
    }
}
