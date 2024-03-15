
/**
 * Write a description of class WordGuessingGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WordGuessingGame
{
    private String hiddenWord;
    private String guessedWord;
    private int numberOfTries;

    /**
     * Constructor for objects of class WordGuessingGame
     */
    public WordGuessingGame()
    {
        this.hiddenWord = "abc";
        this.guessedWord = "___";
        this.numberOfTries = 0;
    }
    
    public void showGuessedWord(){
        System.out.println(guessedWord);
    }
    
    public String getHiddenWord(){
        return hiddenWord;
    }
    public String getGuessedWord(){
        return guessedWord;
    }
    public int getNumberOfTries(){
        return numberOfTries;
    }
}
