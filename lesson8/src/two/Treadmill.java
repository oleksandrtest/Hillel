package two;


public class Treadmill implements Barrier {

    private int length;
    public Treadmill(int length) {
        this.length = length;
    }
    public int getLength() {
        return length;
    }

    @Override
    public String overcome(Participant participant) {
        participant.setResult(participant.getMaxLength() >= getLength());
        if(participant.getResult()) {
            return "Учасник " + participant.getName() + " пробіг дистанцію в  " + length + " метри.";
        } else {
            return "Учасник " + participant.getName() + " не добіг дистанцію в " + length + " метри.";
        }
    }
}
