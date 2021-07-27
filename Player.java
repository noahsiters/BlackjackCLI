public class Player{
  //attributes
  String name;
  //double amount;
  //double bet;
  //constructor
  public Player(String argName){
    name=argName;
    //amount=50;
    //bet=argBet;
  }
  //getters and setters
  public String getName(){
    return name;
  }/*
  public double getAmount(){
    return amount;
  }
  public double getBet(){
    return bet;
  }*/
  public void setName(String argName){
    name=argName;
  }/*
  public void setBet(double argBet){
    bet=argBet;
  }
  //methods
  public double win(){
    double workBet = getBet();
    double workAmount = getAmount();
    workBet = workBet * 2;
    workAmount = workAmount + workBet;
    return workAmount;
  }*/
}
