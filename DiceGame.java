import java.util.Scanner;

public class DiceGame{
    public static void main (String[] args)throws Exception {
        System.out.println("What is your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello, "+ name+"!");
        System.out.println("Rolling dice...");
        int rand1 = (int)(Math.random() * 6) + 1;
        int rand2 = (int)(Math.random() * 6) + 1;
        int sum = rand1 + rand2;
        System.out.println("Die 1:" + rand1);
        System.out.println("Die 2:" + rand2);
        System.out.println("Total value: " + sum);
        if(sum > 7)System.out.println(name + " won!");
        else System.out.println(name + " lost!");
    }
}