public class HomeWorkApp {

    public void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public void checkSumSign(){
        int a = 10;
        int b = -20;
        int sum = a + b;
        if (sum >= 0) { System.out.println( "Sum is positive"); }
        else  System.out.println("Sum is negative"); }

    public void printColor(){
        int value = -134;

        if(value < 0) { System.out.println("Red"); }
        if((value > 0) && (value <= 100)) { System.out.println("Yellow"); }
        if((value > 100) && (value > 0)) { System.out.println("Green");}
    }

    public void  compareNumbers() {
        int a = -129;
        int b = 1;

        if(a >= b ) { System.out.println("a >= b"); }
        System.out.println("a < b");
    }

    public boolean numBetween (int a, int b){
        int sum = a + b;
        if ((sum <= 10) && (sum <= 20)){
            return true;
        }
        return false;
    }

    public void numChecker (int a){
        if (a >=0 ){ System.out.println("Number is positive"); }
        else System.out.println("Number is negative"); }

    public Boolean numCheckerLogic (int a){
        if (a >=0 ){ return true; }
        return false; }

    public void print(String string, int a){

        for (int i = 1; i <= a; i++){
            System.out.printf(string + " ");
        }
    }

    public Boolean liaYearChecker(){
        int year = 1904;
        if(year % 4 == 0){
            if ((year % 100 !=0) || (year % 400 == 0)) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {

    }
}
