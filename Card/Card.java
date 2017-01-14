package Card;

public class Card {

  private CardType type;
  private SuitType suit;


  public Card(CardType type, SuitType suit){
    this.type = type;
    this.suit = suit;
  }


  public CardType getCardType(){
    return this.type;
  }

  public int getCardValue(){
    return type.getValue();
  }


  public SuitType getSuit(){
    return this.suit;
  }

  public void setSuit(SuitType suit){
    this.suit = suit;
  }

// private void setCardValue(int value){
//   if (value > 10)
//     this.value = 10;
//   else if (value < 1)
//     this.value = 1;
//   else
//     this.value = value;
// }

}