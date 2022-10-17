package two;

public class Robot implements Participant {

    private String name;
    private int maxLength;
    private int maxHeight;
    private boolean result = true;

    public Robot(String name, int maxLength, int maxHeight) {
        this.name = name;
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getMaxLength() {
        return maxLength;
    }

    @Override
    public int getMaxHeight() {
        return maxHeight;
    }

    @Override
    public boolean getResult() {
        return result;
    }

    @Override
    public void setResult(Boolean result) {
        this.result = result;
    }


    @Override
    public String run(Treadmill treadmill) {
        if (treadmill.getLength() <= maxLength)
            return name + " може пробігти " + maxLength + " метрів.";
        else
            return name + " не може пробігти " + maxLength + " метрів.";
    }

    @Override
    public String jump(Wall wall) {
        if (wall.getHeight() <= maxHeight)
            return name + " може стрибнути на " + maxHeight + " метрів.";
        else
            return name + " не може стрибнути на " + maxHeight + " метрів.";
    }
}
