package Participants;
import java.util.*;
import Card.*;
import Deck.*;

public abstract class Participants{
  
  private String name;
  private ArrayList<Card> hand;

  public Participants(String name){
    this.name = name;
    this.hand = new ArrayList<Card>();
  }

  public String getName(){
    return this.name;
  }

//below method should be in dealer 
  public Card dealCardToHand(){
    Deck deck = new Deck();
    Card newCard = deck.removeTopCard();
    hand.add(newCard);
    return newCard;
  }

  public int handSize(){
    return hand.size();
  }

  public CardType getCardValueFromHand(){
    Card card = this.dealCardToHand();
    return card.getCardType();
  }

  
}