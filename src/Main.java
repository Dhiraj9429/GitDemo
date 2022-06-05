public class Main {
    public static void main(String[] args){
        Animal animal = new Animal("Animal", 1, 1,5, 5);

        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "Long silky");

        dog.eat();

        System.out.println("I have made some changes in my code");
        System.out.println("I have made another changes in my code");
    }
}
