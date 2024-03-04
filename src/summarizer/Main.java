package summarizer;


public class Main {

    public static void main(String[] args) {

        Person person = Builder.of(Person::new)
                .with(Person::setName, "Otto").with(Person::setAge, 5).build();

        System.out.println("Name: " + person.getName() +
                "\nAge: " + person.getAge());

        Car car = Builder.of(Car::new)
                .with(Car::setEngine, Car.Engine.V8).with(Car::setBrand, "Ferrari")
                .build();
    }
}
