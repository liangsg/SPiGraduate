import java.util.*;
public class test2 {

    String[] wordArray = { "","", "abc", "def", "ghi", "jkl", "mno","pqrs", "tuv", "wxyz" };



    private void checkWord(String[] word) {


        int value = 0 ;
        String sum = "" ;

        for (int i = 0; i < word.length; i++) {
            for (int j = 0; j < 9; j++) {
                if (wordArray[j].indexOf(word[i])!=-1) {
                    value = j;
                    break;
                }


            }
            System.out.println(value);
            sum += value;
            System.out.println(sum);
        }
        //System.out.println(sum);
    }

    public static void main(String[] args) {
        String[] a = {"h","e","l","l","o"};

        test2 q2 = new test2();
        q2.checkWord(a);
    }

}