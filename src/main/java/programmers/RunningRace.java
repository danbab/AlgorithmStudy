package programmers;

import java.util.Arrays;
import java.util.HashMap;

public class RunningRace {
    class Solution {
        static String[] solution(String[] players, String[] callings) {
            HashMap<String, Integer> playersMap = new HashMap<>();
            for (int i = 0; i < players.length; i++) {
                playersMap.put(players[i], i);
            }
            for (String call : callings) {
                int n = playersMap.get(call);
                String forwardPlayer = players[n - 1];
                players[n - 1] = call;
                players[n] = forwardPlayer;
                playersMap.put(call, n - 1);
                playersMap.put(forwardPlayer, n);
            }

            return players;
        }
    }

    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        System.out.println(Arrays.deepToString(Solution.solution(players, callings)));
    }
}
