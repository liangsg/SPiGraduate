import java.util.*;
public class test1 {
    List<String> word1 = Arrays.asList("a","d", "g", "j", "m", "p", "t", "w");
    List<String> word2 = Arrays.asList("b","e", "h", "k", "n", "q", "u", "s");
    List<String> word3 = Arrays.asList("c","f", "i", "l", "o", "r", "v", "y");
    List<String> word4 = Arrays.asList("s","z");




    private void checkWord(String[] word) {


        int value = 0 ;
        int sum = 0 ;

        for (int i = 0; i < word.length; i++) {
            if (word1.contains(word[i])){
                value = 1;
            }
            else if (word2.contains(word[i])){
                value = 2 ;
            }
            else if (word3.contains(word[i])){
                value = 3 ;
            }
            else if (word4.contains(word[i])){
                value = 4 ;
            }

            sum += value;
            //System.out.println(value);
            //System.out.println(sum);
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        String[] a = {"h","e","l","l","o"};

        test1 q1 = new test1();
        q1.checkWord(a);
    }

}