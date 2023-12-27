package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class YearningPoint {
    class Solution {
        static int[] solution(String[] name, int[] yearning, String[][] photo) {
            HashMap<String, Integer> map = new HashMap<>();
            for (int i = 0; i < name.length; i++) {
                map.put(name[i], yearning[i]);
            }
            List<Integer> scoreList = new ArrayList<Integer>();
            for (String[] array : photo) {
                int score = 0;
                for (String s : array) {
                    if (map.containsKey(s))
                        score += map.get(s);
                }
                scoreList.add(score);
            }

            int[] answer = scoreList.stream().mapToInt(i -> i).toArray();
            return answer;
        }
    }

    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"},
                {"may", "kein", "brin", "deny"},
                {"kon", "kain", "may", "coni"}};
        int[] answer = Solution.solution(name, yearning, photo);
        System.out.println(Arrays.toString(answer));
    }
}
