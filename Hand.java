import java.util.ArrayList;
public class Hand{
  //attributes
  private int handTotal;
  //ArrayList
  ArrayList<Card>playerHand=new ArrayList<Card>();
  //constructor
  public Hand(int argHandTotal){
    handTotal=argHandTotal;
  }
  public Hand(){

  }
  //getters and setters
  public int getHandTotal(){
    /*if (handTotal > 0) {
      return handTotal;
    }*/
    int cardVal = 0;
    String cardRank = "";
    int difference = 0;
    int total = 0;
    for(int i=0;i<playerHand.size();i++){
      Card c = playerHand.get(i);
      //cardVal = c.getValue();
      total = total + c.getValue();
      /*difference = 21 - total;
      if(c.getRank()=="Ace"){
        if(difference<=12){
          cardVal=10;
        }
      }*/
    }
    handTotal = total;
    return total;
  }
  public void setHandTotal(int argHandTotal){
    handTotal=argHandTotal;
  }
  //methods
}
