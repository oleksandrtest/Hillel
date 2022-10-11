package two;

public class Wall implements Barrier {

    private int height;

    private String name;

    public Wall(int height, String name) {
        this.height = height;
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String overcome(Participant participant) {
        participant.setResult(participant.getMaxHeight() >= getHeight());
        if(participant.getResult()) {
            return "Учасник  " + participant.getName() + " стрибнув на " + height + " метра.";
        } else {
            return "Учасник " + participant.getName() + " не дострибнув на стіну " + name + " висотою " + height + " метра.";
        }
    }

}
