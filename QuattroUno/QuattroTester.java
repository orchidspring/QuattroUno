public class QuattroTester {
    public static void main(String[] args) {
        // Create a new instance of QuattroGame
        QuattroGame game = new QuattroGame();
        
        // Set the number of players, starting card number, and card code seed
        game.setNumberOfPlayers(4);
        game.setStartingCardNumber(1);
        game.setCardCodeSeed(123);
        
        // Play the game
        game.playGame();
    }
}
