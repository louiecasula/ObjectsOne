package object1;

import java.util.logging.Logger;

public class Main {

    public static void main(String... args) {
        Logger logger = Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");

        Person person1 = new Person("John", 30, 160);

        Car SUV = new Car("Chevy", "Equinox", 2005, 200000);
        String info = String.join(" ", String.valueOf(SUV.getYear()), SUV.getMake(), SUV.getModel());
        System.out.println("This car is a " + info + " with " + SUV.getMileage() + " miles on it.");

        Chair officeChair = new Chair("satin", "red", 7);
        System.out.printf("The chair is %s and made of %s with %d legs on it.\n", officeChair.getColor(), officeChair.getMaterial(), officeChair.getLegs());

        Dog dawg = new Dog("Goofy", 25, "cartoon dog.\n");
        dawg.setAge(47);
        System.out.printf("My dog's name is %s. He's a %d year old %s", dawg.getName(), dawg.getAge(), dawg.getBreed());

    }
}
