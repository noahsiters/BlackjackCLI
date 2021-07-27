import java.util.Scanner;
import java.util.Random;
public class Game{
  public static void main(String[] args){
    //creating the deck and adding the cards to said deck are below
    //--------------------DECK CREATION-----------------------------
    Deck d = new Deck(52);
    //creates the Hearts suit cards
    Card ch1 = new Card(1, "Hearts", "Ace");
    Card ch2 = new Card(2, "Hearts", "Two");
    Card ch3 = new Card(3, "Hearts", "Three");
    Card ch4 = new Card(4, "Hearts", "Four");
    Card ch5 = new Card(5, "Hearts", "Five");
    Card ch6 = new Card(6, "Hearts", "Six");
    Card ch7 = new Card(7, "Hearts", "Seven");
    Card ch8 = new Card(8, "Hearts", "Eight");
    Card ch9 = new Card(9, "Hearts", "Nine");
    Card ch10 = new Card(10, "Hearts", "Ten");
    Card ch11 = new Card(10, "Hearts", "Jack");
    Card ch12 = new Card(10, "Hearts", "Queen");
    Card ch13 = new Card(10, "Hearts", "King");
    //adds them to the deck
    d.addCard(ch1);
    d.addCard(ch2);
    d.addCard(ch3);
    d.addCard(ch4);
    d.addCard(ch5);
    d.addCard(ch6);
    d.addCard(ch7);
    d.addCard(ch8);
    d.addCard(ch9);
    d.addCard(ch10);
    d.addCard(ch11);
    d.addCard(ch12);
    d.addCard(ch13);
    //creates the Clubs suit cards
    Card cc1 = new Card(1, "Clubs", "Ace");
    Card cc2 = new Card(2, "Clubs", "Two");
    Card cc3 = new Card(3, "Clubs", "Three");
    Card cc4 = new Card(4, "Clubs", "Four");
    Card cc5 = new Card(5, "Clubs", "Five");
    Card cc6 = new Card(6, "Clubs", "Six");
    Card cc7 = new Card(7, "Clubs", "Seven");
    Card cc8 = new Card(8, "Clubs", "Eight");
    Card cc9 = new Card(9, "Clubs", "Nine");
    Card cc10 = new Card(10, "Clubs", "Ten");
    Card cc11 = new Card(10, "Clubs", "Jack");
    Card cc12 = new Card(10, "Clubs", "Queen");
    Card cc13 = new Card(10, "Clubs", "King");
    //adds them to the Deck
    d.addCard(cc1);
    d.addCard(cc2);
    d.addCard(cc3);
    d.addCard(cc4);
    d.addCard(cc5);
    d.addCard(cc6);
    d.addCard(cc7);
    d.addCard(cc8);
    d.addCard(cc9);
    d.addCard(cc10);
    d.addCard(cc11);
    d.addCard(cc12);
    d.addCard(cc13);
    //creates the Diamonds suit cards
    Card cd1 = new Card(1, "Diamonds", "Ace");
    Card cd2 = new Card(2, "Diamonds", "Two");
    Card cd3 = new Card(3, "Diamonds", "Three");
    Card cd4 = new Card(4, "Diamonds", "Four");
    Card cd5 = new Card(5, "Diamonds", "Five");
    Card cd6 = new Card(6, "Diamonds", "Six");
    Card cd7 = new Card(7, "Diamonds", "Seven");
    Card cd8 = new Card(8, "Diamonds", "Eight");
    Card cd9 = new Card(9, "Diamonds", "Nine");
    Card cd10 = new Card(10, "Diamonds", "Ten");
    Card cd11 = new Card(10, "Diamonds", "Jack");
    Card cd12 = new Card(10, "Diamonds", "Queen");
    Card cd13 = new Card(10, "Diamonds", "King");
    //adds them to the Deck
    d.addCard(cd1);
    d.addCard(cd2);
    d.addCard(cd3);
    d.addCard(cd4);
    d.addCard(cd5);
    d.addCard(cd6);
    d.addCard(cd7);
    d.addCard(cd8);
    d.addCard(cd9);
    d.addCard(cd10);
    d.addCard(cd11);
    d.addCard(cd12);
    d.addCard(cd13);
    //creates the Spades suit cards
    Card cs1 = new Card(1, "Spades", "Ace");
    Card cs2 = new Card(2, "Spades", "Two");
    Card cs3 = new Card(3, "Spades", "Three");
    Card cs4 = new Card(4, "Spades", "Four");
    Card cs5 = new Card(5, "Spades", "Five");
    Card cs6 = new Card(6, "Spades", "Six");
    Card cs7 = new Card(7, "Spades", "Seven");
    Card cs8 = new Card(8, "Spades", "Eight");
    Card cs9 = new Card(9, "Spades", "Nine");
    Card cs10 = new Card(10, "Spades", "Ten");
    Card cs11 = new Card(10, "Spades", "Jack");
    Card cs12 = new Card(10, "Spades", "Queen");
    Card cs13 = new Card(10, "Spades", "King");
    //adds them to the Deck
    d.addCard(cs1);
    d.addCard(cs2);
    d.addCard(cs3);
    d.addCard(cs4);
    d.addCard(cs5);
    d.addCard(cs6);
    d.addCard(cs7);
    d.addCard(cs8);
    d.addCard(cs9);
    d.addCard(cs10);
    d.addCard(cs11);
    d.addCard(cs12);
    d.addCard(cs13);
    //--------------------END DECK CREATION--------------------------

    //Declaring variables to supply constructors
    String playerName;
    double playerStartingBet;
    String winStr = "YOU WIN!!!";
    String dealerBustStr = "Dealer Busts!!! YOU WIN!!!";
    String dealerWinStr = "Dealer wins!";
    String bustStr = "You bust!! Try again";

    //Creates the player and dealers hands and the player
    Hand h = new Hand();
    Hand dealer = new Hand();
    Player p;

    Scanner input = new Scanner(System.in); //creating the scanner object to take input

    try{
      while(true){
        //Game Introduction
        System.out.println("Welcome to 'BlackJack! Terminal edition'");
        System.out.println("Please enter your name: ");
        playerName = input.nextLine();
        String thanksStr = "thanks for playing, " + playerName + " (:";

        System.out.println("The dealer deals the cards");
        
        //PLAYER START and DEALER START
        //Draws two cards from Card class by using random integer
        //Player Cards
        Card pCard1 = d.drawCard();
        Card pCard2 = d.drawCard();
        //Dealer Cards
        Card dCard1 = d.drawCard();
        Card dCard2 = d.drawCard();
        //Adds cards to ArrayList of card objects for the player's hand in the Hand object
        h.playerHand.add(pCard1);
        h.playerHand.add(pCard2);

        //checking the value of the Ace (1 or 11) depending on if it would bust the player or not
        if(pCard1.getRank().equals("Ace")){
          if(h.getHandTotal()<13){
            pCard1.setValue(11);
          }
        }
        if(pCard2.getRank().equals("Ace")){
          if(h.getHandTotal()<13){
            pCard2.setValue(11);
          }
        }

        //Adds cards to ArrayList of card objects for the dealer's hand in the Hand object
        dealer.playerHand.add(dCard1);
        dealer.playerHand.add(dCard2);

        //Calls and displays the hand totals to the player (Calculation for hand total is in Hand class)
        System.out.println("The dealer's showing card is: " + dCard2.getRank() + " of " + dCard2.getSuit());
        System.out.println("The two cards in your hand are: ");
        System.out.println(pCard1.getRank() + " of " + pCard1.getSuit() + "   " + pCard2.getRank() + " of " + pCard2.getSuit() + "  Hand Total: (" + h.getHandTotal() + ")");

        //checking your hand totals for if someone wins
        if(h.getHandTotal() == 21){
          System.out.println(winStr);
          System.out.println(thanksStr);
          break;
        }

        //Determine if player wants to hit or stand, store it in boolean variable
        System.out.println("Do you want to hit or stand? ENTER H/S");
        Boolean playerHit = true;
        if(input.nextLine().equals("s")){
          playerHit=false; //since player stood, program skips hit loop and goes straight to dealer code block
        }
        
        //player hit loop, could condense by looping six times (to match total possible hits)
        while(playerHit==true){
          //----BEGIN PLAYER HIT LOOP----
          //HIT ONE-------
          //draw card from Card object, then add card to player hand object 
          Card pCard3 = d.drawCard();
          h.playerHand.add(pCard3);

          //checking if player has ace, and makes it worth 11 if it wont bust the player
          if(pCard3.getRank().equals("Ace")){
            if(h.getHandTotal()<12){
              pCard3.setValue(11);
            }
          }

          //display messages
          System.out.println("You hit!");
          System.out.println(pCard3.getRank() + " of " + pCard3.getSuit() + " Value: " + pCard3.getValue());
          System.out.println("Hand Total: (" + h.getHandTotal() + ")");

          //checking for bust or wins after first hit
          if(h.getHandTotal()>21){
            System.out.println(bustStr);
            System.out.println(thanksStr);
            break;
          }
          else if(h.getHandTotal()==21){
            System.out.println(winStr);
            System.out.println(thanksStr);
            break;
          }

          //Checking for if player will hit or stand
          System.out.println("Do you want to hit or stand? ENTER H/S");
          if(input.nextLine().equals("s")){
            playerHit=false;
            break;
          }
          //HIT TWO-------
          //draw card from Card object, then add card to player hand object 
          Card pCard4 = d.drawCard();
          h.playerHand.add(pCard4);
          if(pCard4.getRank().equals("Ace")){
            if(h.getHandTotal()<12){
              pCard4.setValue(11);
            }
          }

          //display messages
          System.out.println("You hit!");
          System.out.println(pCard4.getRank() + " of " + pCard4.getSuit() + " Value: " + pCard4.getValue());
          System.out.println("Hand Total: (" + h.getHandTotal() + ")");

          //checking for busts or wins
          if(h.getHandTotal()>21){
            System.out.println(bustStr);
            System.out.println(thanksStr);
            break;
          }
          else if(h.getHandTotal()==21){
            System.out.println(winStr);
            System.out.println(thanksStr);
            break;
          }

          //asking if player wants to hit or stand
          System.out.println("Do you want to hit or stand? ENTER H/S");
          if(input.nextLine().equals("s")){
            //playerStood=true;
            playerHit=false;
            break;
          }

          //HIT THREE-------
          //draw card from Card object, then add card to player hand object 
          Card pCard5 = d.drawCard();
          h.playerHand.add(pCard4);
          if(pCard5.getRank().equals("Ace")){
            if(h.getHandTotal()<12){
              pCard5.setValue(11);
            }
          }

          //display messages
          System.out.println("You hit!");
          System.out.println(pCard5.getRank() + " of " + pCard5.getSuit() + " Value: " + pCard5.getValue());
          System.out.println("Hand Total: (" + h.getHandTotal() + ")");

          //checking for busts or wins
          if(h.getHandTotal()>21){
            System.out.println(bustStr);
            System.out.println(thanksStr);
            break;
          }
          else if(h.getHandTotal()==21){
            System.out.println(winStr);
            System.out.println(thanksStr);
            break;
          }

          //asking if player wants to hit or stand
          System.out.println("Do you want to hit or stand? ENTER H/S");
          if(input.nextLine().equals("s")){
            //playerStood=true;
            playerHit=false;
            break;
          }

          //HIT FOUR-------
          //draw card from Card object, then add card to player hand object 
          Card pCard6 = d.drawCard();
          h.playerHand.add(pCard4);
          if(pCard6.getRank().equals("Ace")){
            if(h.getHandTotal()<12){
              pCard6.setValue(11);
            }
          }

          //display messages
          System.out.println("You hit!");
          System.out.println(pCard6.getRank() + " of " + pCard6.getSuit() + " Value: " + pCard6.getValue());
          System.out.println("Hand Total: (" + h.getHandTotal() + ")");

          //checking for busts or wins
          if(h.getHandTotal()>21){
            System.out.println(bustStr);
            System.out.println(thanksStr);
            break;
          }
          else if(h.getHandTotal()==21){
            System.out.println(winStr);
            System.out.println(thanksStr);
            break;
          }

          //asking if player wants to hit or stand
          System.out.println("Do you want to hit or stand? ENTER H/S");
          if(input.nextLine().equals("s")){
            //playerStood=true;
            playerHit=false;
            break;
          }

          //HIT FIVE-------
          //draw card from Card object, then add card to player hand object 
          Card pCard7 = d.drawCard();
          h.playerHand.add(pCard4);
          if(pCard7.getRank().equals("Ace")){
            if(h.getHandTotal()<12){
              pCard7.setValue(11);
            }
          }

          //display messages
          System.out.println("You hit!");
          System.out.println(pCard7.getRank() + " of " + pCard7.getSuit() + " Value: " + pCard7.getValue());
          System.out.println("Hand Total: (" + h.getHandTotal() + ")");

          //checking for busts or wins
          if(h.getHandTotal()>21){
            System.out.println(bustStr);
            System.out.println(thanksStr);
            break;
          }
          else if(h.getHandTotal()==21){
            System.out.println(winStr);
            System.out.println(thanksStr);
            break;
          }

          //asking if player wants to hit or stand
          System.out.println("Do you want to hit or stand? ENTER H/S");
          if(input.nextLine().equals("s")){
            //playerStood=true;
            playerHit=false;
            break;
          }

          //HIT SIX-------
          //draw card from Card object, then add card to player hand object 
          Card pCard8 = d.drawCard();
          h.playerHand.add(pCard4);
          if(pCard8.getRank().equals("Ace")){
            if(h.getHandTotal()<12){
              pCard8.setValue(11);
            }
          }

          //display messages
          System.out.println("You hit!");
          System.out.println(pCard8.getRank() + " of " + pCard8.getSuit() + " Value: " + pCard8.getValue());
          System.out.println("Hand Total: (" + h.getHandTotal() + ")");

          //checking for busts or wins
          if(h.getHandTotal()>21){
            System.out.println(bustStr);
            System.out.println(thanksStr);
            break;
          }
          else if(h.getHandTotal()==21){
            System.out.println(winStr);
            System.out.println(thanksStr);
            break;
          }
          System.out.println("You shouldn't have gotten to this point");
          playerHit=false;
          break;
          //----END PLAYER HIT LOOP----
        }
        if(h.getHandTotal()>21){
          break;
        }
        if(h.getHandTotal()==21){
          break;
        }

        //continuing into the dealer hitting
          //calculating how much the dealer needs to get to 21
          int diff = 0;
          diff = 21 - dealer.getHandTotal();

          //display messages
          System.out.println("You stood!");
          System.out.println("The dealer flips the other card");

          //displaying dealer cards
          System.out.println("DEALERS Cards: " + dCard2.getRank() + " of " + dCard2.getSuit() + " & " + dCard1.getRank() + " of " + dCard1.getSuit() + " TOTAL: " + dealer.getHandTotal());
          
          //continually comparing the dealer hand to the player hand
          if(dealer.getHandTotal()<h.getHandTotal()){
            //DEALER HIT ONE-------
            Card dCard3 = d.drawCard();
            dealer.playerHand.add(dCard3);
            if(dCard3.getRank().equals("Ace")){
              if(dealer.getHandTotal()<12){
                dCard3.setValue(11);
              }
            }
            System.out.println("Dealer drew! Dealer got " + dCard3.getRank() + " of " + dCard3.getSuit() + " TOTAL: " + dealer.getHandTotal());
            if(dealer.getHandTotal()>21){
              System.out.println(dealerBustStr);
              System.out.println(thanksStr);
              break;
            }
            if(dealer.getHandTotal()==21){
              System.out.println(dealerWinStr);
              System.out.println(thanksStr);
            }
          }
          if(dealer.getHandTotal()<=h.getHandTotal()){
            //DEALER HIT TWO-------
            Card dCard4 = d.drawCard();
            dealer.playerHand.add(dCard4);
            if(dCard4.getRank().equals("Ace")){
              if(dealer.getHandTotal()<12){
                dCard4.setValue(11);
              }
            }
            System.out.println("Dealer drew! Dealer got " + dCard4.getRank() + " of " + dCard4.getSuit() + " TOTAL: " + dealer.getHandTotal());
            if(dealer.getHandTotal()>21){
              System.out.println(dealerBustStr);
              System.out.println(thanksStr);
              break;
            }
          }
          if(dealer.getHandTotal()<=h.getHandTotal()){
            //DEALER HIT THREE-------
            Card dCard5 = d.drawCard();
            dealer.playerHand.add(dCard5);
            if(dCard5.getRank().equals("Ace")){
              if(dealer.getHandTotal()<12){
                dCard5.setValue(11);
              }
            }
            System.out.println("Dealer drew! Dealer got " + dCard5.getRank() + " of " + dCard5.getSuit() + " TOTAL: " + dealer.getHandTotal());
            if(dealer.getHandTotal()>21){
              System.out.println(dealerBustStr);
              System.out.println(thanksStr);
              break;
            }
          }
          if(dealer.getHandTotal()<=h.getHandTotal()){
            //DEALER HIT FOUR-------
            Card dCard6 = d.drawCard();
            dealer.playerHand.add(dCard6);
            if(dCard6.getRank().equals("Ace")){
              if(dealer.getHandTotal()<12){
                dCard6.setValue(11);
              }
            }
            System.out.println("Dealer drew! Dealer got " + dCard6.getRank() + " of " + dCard6.getSuit() + " TOTAL: " + dealer.getHandTotal());
            if(dealer.getHandTotal()>21){
              System.out.println(dealerBustStr);
              System.out.println(thanksStr);
              break;
            }
          }
          if(dealer.getHandTotal()<=h.getHandTotal()){
            //DEALER HIT FIVE-------
            Card dCard7 = d.drawCard();
            dealer.playerHand.add(dCard7);
            if(dCard7.getRank().equals("Ace")){
              if(dealer.getHandTotal()<12){
                dCard7.setValue(11);
              }
            }
            System.out.println("Dealer drew! Dealer got " + dCard7.getRank() + " of " + dCard7.getSuit() + " TOTAL: " + dealer.getHandTotal());
            if(dealer.getHandTotal()>21){
              System.out.println(dealerBustStr);
              System.out.println(thanksStr);
              break;
            }
          }
          else if(dealer.getHandTotal()>h.getHandTotal() && dealer.getHandTotal()<21){
            System.out.println(dealerWinStr);
            System.out.println(thanksStr);
          }
          break;
      }
    }
    catch(IndexOutOfBoundsException e){
      //catches exception; cause is undetermined
      System.out.println("ERROR: Please try again");
    }
  }
}
