import java.sql.SQLOutput;

public class MAin {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat cat1 = new Cat();
        Dog dog = new Dog();

        cat.setName("Мурзік");
        cat1.setName("Мурзік");
        dog.setName("Барсік");

        cat.run(100);
        cat.swim(70);
        dog.run(400);
        dog.swim(400);

        for (int i = 0; i < 0; i++) {
            new Enimal();
        }
        for (int i = 0; i < 0; i++) {
            new Cat();
        }
        for (int i = 0; i < 0; i++) {
            new Dog();
        }
        System.out.println(Cat.number);

        System.out.println(Dog.number);

        System.out.println(Enimal.number);
    }
}
