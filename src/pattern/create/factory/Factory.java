package pattern.create.factory;

public class Factory {
    public static Animal createAnimal(String type) throws IllegalAccessException {
        if (type.equalsIgnoreCase("dog")) {
            return new Dog();
        } else if (type.equalsIgnoreCase("cat")) {
            return new Cat();
        } else {
            throw new IllegalAccessException("error animal type:" + type);
        }
    }
}
