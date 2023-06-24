public abstract class Card {
    private String cardCode; // Represents the code of the card
    
    public Card(String cardCode) {
        this.cardCode = cardCode;
    }
    
    public String getCardCode() {
        return cardCode;
    }
    
    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }
    
    // Abstract method for any additional functionality common to all card types
    public abstract void performAction();
    
    // Additional methods specific to the Card class
    
}
