import static org.junit.Assert.assertEquals;
import org.junit.*;
import Card.*;
import Deck.*;
import Participants.*;

public class CardGameTest{
  Card card;
  Player player;
  Deck deck;
  // Game game;

  @Before
  public void before() {
    card = new Card(CardType.FIVE, SuitType.HEARTS);
    deck = new Deck();
    player = new Player("Amy");

  }

  @Test
  public void canGetCardValue() {
    assertEquals(CardType.FIVE, card.getCardType());
  }

  @Test
  public void canGetSuit(){
    assertEquals(SuitType.HEARTS, card.getSuit());
  }


  @Test
  public void canAddCardToCardList(){
    deck.addCardToDeck(card);
    assertEquals(1, deck.cardCount());
  }

  @Test
  public void canFillCardList(){
    deck.fill();
    assertEquals(52, deck.cardCount());
  }


  @Test
  public void doesFilledDeckContainAllCards(){
    Deck deck = new Deck();
    deck.fillAndShuffle();
    assertEquals(52, deck.cardCount());
    for (CardType cardType : CardType.values()) {
      for (SuitType cardSuit : SuitType.values()) {
        Card cardImprint = new Card(cardType, cardSuit);
        deck.removeCard(cardImprint); 
      }
    }
    assertEquals(0, deck.cardCount());
  }

  @Test 
  public void canRemoveTopCardFromDeck(){
    Deck deck = new Deck();
    deck.removeTopCard();
    assertEquals(51, deck.cardCount());
  }

  @Test
  public void canGetRemovedTopCardsValue(){
    Deck deck = new Deck();
    Card removedCard = deck.getRemovedCardValue();
    assertEquals(CardType.TWO, removedCard.getCardType());
    assertEquals(SuitType.HEARTS, removedCard.getSuit());
  }

  @Test
  public void canAddCardToHand(){
  Player player = new Player("Amy");
  player.dealCardToHand();
  assertEquals(1, player.handSize());
  }

  @Test
  public void canGetCardValueFromHand(){
  Player player = new Player("Amy");
  Card firstCard = player.dealCardToHand();
  assertEquals(CardType.TWO, firstCard.getCardType());
  }

  @Test
  public void canGetShuffledDeckValue(){
    Deck deck = new Deck();
    Card testCard = deck.removeFromShuffledDeck();
    assertEquals(CardType.TWO, testCard.getCardType());
  }
}
