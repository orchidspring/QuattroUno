public class SpecialColourCard extends ColourCard {
    private String specialAbility; // Represents the special ability of the card
    
    public SpecialColourCard(String cardColour, String cardCode, String specialAbility) {
        super(cardColour, cardCode);
        this.specialAbility = specialAbility;
    }
    
    public String getSpecialAbility() {
        return specialAbility;
    }
    
    public void setSpecialAbility(String specialAbility) {
        this.specialAbility = specialAbility;
    }
    
    // Method to activate the special ability of the card
    public void activateAbility() {
        // Code to activate the special ability of the card
    }
    
    // Additional methods specific to the SpecialColourCard class
    
}
