public class Card{
  //attributes
  private int value;
  private String suit;
  private String rank;
  //constructor
  public Card(int argValue, String argSuit, String argRank){
    value=argValue;
    suit=argSuit;
    rank=argRank;
  }
  //getters and setters
  public int getValue(){
    return value;
  }
  public String getSuit(){
    return suit;
  }
  public String getRank(){
    return rank;
  }
  public void setValue(int argValue){
    value=argValue;
  }
  public void setSuit(String argSuit){
    suit=argSuit;
  }
  public void setRank(String argRank){
    rank=argRank;
  }
  //methods
}
