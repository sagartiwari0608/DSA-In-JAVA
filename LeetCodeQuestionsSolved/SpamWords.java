package LeetCodeQuestionsSolved;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SpamWords {

    public static boolean reportSpam(String[] message, String[] bannedWords) {
        if (message.length == 1)
            return false;
        List<String> messages = Arrays.asList(message);
        List<String> bannedWordsList = Arrays.asList(bannedWords);
        Set<String> bannedWordsSet = new HashSet<>(bannedWordsList);
        int count = 0;
        for (String m : messages) {
            if (bannedWordsSet.contains(m)) {
                count++;
                if (count == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] message = new String[] { "hello", "world", "leetcode" };
        String[] bannedWords = new String[] { "world", "hello" };
        System.out.println(reportSpam(message, bannedWords));
    }
}
