package Deck;
import java.util.*;
import Card.*;


public class Deck {

  private ArrayList<Card> deck;
  

  public Deck() {
    this.deck = new ArrayList<Card>();
  }


  public void addCardToDeck(Card card){
    deck.add(card);
  }

  public int cardCount(){
    return deck.size();
  }


  public void fillDeck(){
    for(CardType type: CardType.values())
      for(SuitType suit: SuitType.values()){
      addCardToDeck(new Card(type, suit));
    }
  }

  public void shuffle(){
    Collections.shuffle(deck);
  }
}
      
