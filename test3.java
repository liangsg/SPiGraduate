import java.util.*;
public class test3 {

    private String[] words = { "","", "abc", "def", "ghi", "jkl", "mno",
            "pqrs", "tuv", "wxyz" };



    private void printcombination(int[] nums, int wIdx, String str) {
        if (str.length() == nums.length) {
            System.out.println(str);
            return;
        }

        String word = words[nums[wIdx]];

        for (int i = 0; i < word.length(); i++) {
            printcombination(nums, wIdx + 1, str + word.charAt(i));
        }

    }

    public static void main(String[] args) {
        int[] a = {2,4,6};

        test3 q3 = new test3();
        q3.printcombination(a,0,"");
    }

}