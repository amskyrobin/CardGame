import static org.junit.Assert.assertEquals;
import org.junit.*;
import Card.*;
import Deck.*;

public class CardGameTest{
  Card card;
  // Player player;
  Deck deck;
  // Game game;

  @Before
  public void before() {
    card = new Card(CardType.FIVE, SuitType.HEARTS);
    deck = new Deck();

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
  public void canAddCardToDeck(){
    deck.addCardToDeck(card);
    assertEquals(1, deck.cardCount());
  }

  @Test
  public void canFillDeck(){
    deck.fillDeck();
    assertEquals(52, deck.cardCount());
  }

  // @Test void canGetSelectCardFromDeck(){
  //   deck.fillDeck();
  //   deck[4];
  //   assertEquals(CardType.FIVE, SuitType.HEARTS, card.getCardType().getSuit());
  // }
}
