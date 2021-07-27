import java.util.ArrayList;
import java.util.Random;
public class Deck{
  //attributes
  private int cardAmount = 52;
  //arraylist of cards to represent the deck
  ArrayList<Card>deckOfCards=new ArrayList<Card>();
  //constructor
  public Deck(int argCardAmount){
    cardAmount=argCardAmount;
  }
  //getters and setters
  public int getCardAmount(){
    return cardAmount;
  }
  public void setCardAmount(int argCardAmount){
    cardAmount=argCardAmount;
  }
  //methods
  public void addCard(Card argCard){
    deckOfCards.add(argCard);
    cardAmount = cardAmount+1;
  }
  public void removeCard(Card argCard){
    deckOfCards.remove(argCard);
    cardAmount = cardAmount - 1;
  }
  public Card drawCard(){
    Random rand = new Random();
    int deckSize = deckOfCards.size();
    int r = rand.nextInt(deckSize) + 1;
    Card c = null;

    c = deckOfCards.get(r); //gets card from index point set at random to simulate shuffling
    removeCard(c); //removes card from deck
    return c;
  }
}
