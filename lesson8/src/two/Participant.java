package two;


public interface Participant {

   String getName();
   String run(Treadmill treadmill);
   String jump(Wall wall);
   int getMaxLength();
   int getMaxHeight();
   boolean getResult();
   void setResult(Boolean result);

}
