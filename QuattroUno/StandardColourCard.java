public class StandardColourCard {
    private String cardCode; // Represents the code of the card
    private String cardColour; // Represents the color of the card
    private int cardNumber; // Represents the number on the card
    
    public StandardColourCard(String cardCode, String cardColour, int cardNumber) {
        this.cardCode = cardCode;
        this.cardColour = cardColour;
        this.cardNumber = cardNumber;
    }
    
    public String getCardCode() {
        return cardCode;
    }
    
    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }
    
    public String getCardColour() {
        return cardColour;
    }
    
    public void setCardColour(String cardColour) {
        this.cardColour = cardColour;
    }
    
    public int getCardNumber() {
        return cardNumber;
    }
    
    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }
    
    // Additional methods specific to the StandardColourCard class
    
}
