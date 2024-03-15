
/**
 * Write a description of class WordGenerator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Random;

public class WordGenerator
{
    private ArrayList<String> words;
    private String word;

    /**
     * Constructor for objects of class WordGenerator
     */
    public WordGenerator()
    {
        words = new ArrayList<>();
    }
    
    private void fillArrayList(){
        String[] arr = {"boolean", "break", "byte", "case", "char", "class", "continue",
            "do", "double", "else", "enum", "for", "if", "import", "int"};
        for(int i = 0; i<arr.length; i++){
            words.add(arr[i]);
        }
    }
    
    public String generateWord(){
        Random randomSequence = new Random();
        int index = randomSequence.nextInt(words.size());
        this.word = words.get(index);
        return word;
    }
    
    public void addWord(String word){
        words.add(word);
    }
}
