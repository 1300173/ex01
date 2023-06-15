public class DiceGame{
    public static void main (String[] args)throws Exception {
        System.out.println("Rolling dice...");
        int rand1 = (int)(Math.random() * 6) + 1;
        int rand2 = (int)(Math.random() * 6) + 1;
        int sum = rand1 + rand2;
        System.out.println("Die 1:" + rand1);
        System.out.println("Die 2:" + rand2);
        System.out.println("Total value: " + sum);
        if(sum > 7)System.out.println("You won");
        else System.out.println("You lost");
    }
}