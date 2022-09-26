import java.util.Scanner;

import static java.lang.System.out;


public class Main {

    public String calc(){
        Scanner scanner = new Scanner(System.in);

        out.print("\n\n"+"This is simple calculator");
        out.print("Please enter first number: ");
        Double number1 = scanner.nextDouble();
        out.print("Please enter second number: ");
        Double number2 = scanner.nextDouble();
        out.print("Please write math operation (+, -, *, /): ");
        String operation = scanner.next();

        switch (operation){
            case "+" ->
                    out.println("Your result: " + "(" + number1 + " + " + number2 +" = " + (number1 + number2) + ")");
            case "-" ->
                    out.println("Your result: " + "(" + number1 + " - " + number2 +" = " + (number1 - number2) + ")");
            case "*" ->
                    out.println("Your result: " + "(" + number1 + " * " + number2 +" = " + (number1 * number2) + ")");
            case "/" ->
                    out.println("Your result: " + "(" + number1 + " / " + number2 +" = " + (number1 / number2) + ")");
            case "exit" -> scanner.close();
            default -> out.println("You make some mistake");
        }
        out.print("\n"+"If you wont exit, enter (exit): ");
        String command = scanner.next();
        return "\n"+"Exit";
    }

    public static void main(String[] args) {

        String word[] = ("ZюукяДZіботZ,ежобZощZяZенZ!ьлаксом").split("Z");
        for (String w : word) {
            String sb = new StringBuilder(w).reverse().toString() + " ";
            out.print(sb);
        }
        out.println(new Main().calc());
    }

}