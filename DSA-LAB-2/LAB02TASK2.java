
import java.util.ArrayList;
import java.util.List;
public class LAB02TASK2{
class Solution {
        public List<Integer> findWordsContaining(String[] words, char x) {
            List<Integer> ans = new ArrayList<>();
            for (int i = 0; i < words.length; ++i) {
                for (int j = 0; j < words[i].length(); ++j) {
                    if (words[i].charAt(j) == x) {
                        ans.add(i);
                        break;
                    }
                }
            }
            return ans;
        }
    }
}
