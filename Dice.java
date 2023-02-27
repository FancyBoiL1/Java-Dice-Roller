//By Me.

public class Dice{
  static int roll(int amount, int sides, int mod){ //The dice
    int roll = (int)Math.floor(Math.random() * (sides - amount + 1) + amount);
    int end = roll + mod;
    return end;
  }
  
  public static void main(String[] args){
    int roll = roll(1,20,3); //Rolling dice
    System.out.println(roll); //Print output
  }
}
