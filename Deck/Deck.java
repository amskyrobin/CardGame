package Deck;
import java.util.*;
import Card.*;
import Participants.*;


public class Deck {

  private ArrayList<Card> cardList;
  

  public Deck() {
    this.cardList = new ArrayList<Card>();
  }


  public void addCardToDeck(Card card){
    cardList.add(card);
  }

  public int cardCount(){
    return cardList.size();
  }


  public void fill(){
    for(CardType type: CardType.values())
      for(SuitType suit: SuitType.values()){
        addCardToDeck(new Card(type, suit));
      }
    }


    public void fillAndShuffle(){
      this.fill();
      Collections.shuffle(cardList);
    }


   public void removeCard(Card cardImprint) {
        Card cardToDelete = null;
        for (Card card : cardList) {
              if (cardImprint.getCardValue() == card.getCardValue() && cardImprint.getSuit().equals(card.getSuit())) {
                cardToDelete = card;
                break;
              }
        }
        if (cardToDelete != null)
            cardList.remove(cardToDelete);
   } 

   public Card removeTopCard(){
    this.fill();
    return cardList.remove(0);
   }

  public Card getRemovedCardValue(){
    Card removedCard = this.removeTopCard();
    return removedCard;
    }

    public Card removeFromShuffledDeck(){
      this.fillAndShuffle();
      return cardList.remove(0);
    }
   }

