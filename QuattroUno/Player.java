import java.util.List;

/**
 * Represents a player in the game.
 */
public class Player{
    private String playerName; // Represents the name of the player
    private List<Card> cardList; // Represents the list of cards held by the player
    private boolean isHumanPlayer; // Represents whether the player is a human player
    
    // Constructors, getters, setters, and other methods
    
    public String getPlayerName() {
        return playerName;
    }
    
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    
    public List<Card> getCardList() {
        return cardList;
    }
    
    public void setCardList(List<Card> cardList) {
        this.cardList = cardList;
    }
    
    public boolean isHumanPlayer() {
        return isHumanPlayer;
    }
    
    public void setHumanPlayer(boolean isHumanPlayer) {
        this.isHumanPlayer = isHumanPlayer;
    }
    
    // Additional methods specific to the Player class
    
}
