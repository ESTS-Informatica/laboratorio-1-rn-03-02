
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
    private InputReader reader;

    /**
     * Constructor for objects of class WordGuessingGame
     */
    public WordGuessingGame()
    {
        this.hiddenWord = "abc";
        this.guessedWord = "___";
        this.numberOfTries = 0;
        this.reader = new InputReader();
    }
    
    private void showGuessedWord(){
        System.out.println(guessedWord);
    }
    
    public void play(){
        char answer;
        do{
            System.out.println(guessedWord);
            answer = reader.getChar("Guess char\n");
            guess(answer);
            numberOfTries++;
        }while(!guessedWord.equals(hiddenWord));
        showResult();
        numberOfTries = 0;
    }
    
    private void showWelcome(){
        System.out.println("Welcome");
    }
    
    private void guess(char answer){
        char[] arr1 = hiddenWord.toCharArray();
        char[] arr2 = guessedWord.toCharArray();
        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] == answer){
                arr2[i] = arr1[i];
            }
        }
        guessedWord = new String(arr2);
    }
    
    private void showResult(){
        if(guessedWord.equals(hiddenWord)){
            System.out.println(numberOfTries);
        }
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
