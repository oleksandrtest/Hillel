package two;
public class Main {

    public static void main(String[] args) {

        Participant cat = new Cat("Васька", 100, 1);
        Participant human = new Human("Іван", 1500, 2);
        Participant robot = new Robot("Вертер", 3000, 4);

        Barrier treadmill = new Treadmill(100);
        Barrier wall = new Wall(1, "Стіна-1");
        Barrier treadmill1 = new Treadmill(1250);
        Barrier wall1 = new Wall(2, "Стіна-2");
        Barrier treadmill2 = new Treadmill(1500);
        Barrier wall2 = new Wall(3, "Стіна-3");


        Participant[] participants = {cat, human, robot};
        Barrier[] barriers = {treadmill, wall, treadmill1, wall1, treadmill2, wall2};

        for (int i = 0; i < participants.length; i++) {

            for (Barrier bar: barriers) {
                if (participants[i].getResult()) {
                    System.out.println(bar.overcome(participants[i]));
                }

            }
        }
    }
}
