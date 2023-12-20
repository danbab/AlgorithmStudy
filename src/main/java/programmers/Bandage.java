package programmers;

public class Bandage {
    class Solution {
        static int solution(int[] bandage, int health, int[][] attacks) {
            int answer = 0;
            int tempHealth = health;
            int successNum = 0;
            int attackNum = 0;
            for (int i = 1; i <= attacks[attacks.length - 1][0]; i++) {

                if (i == attacks[attackNum][0]) {
                    successNum = 0;
                    tempHealth -= attacks[attackNum][1];
                    attackNum += 1;
                    if (tempHealth <= 0) {
                        return -1;
                    }
                } else {
                    successNum += 1;
                    if (tempHealth < health) {
                        tempHealth += bandage[1];
                        if (successNum == bandage[0]) {
                            tempHealth += bandage[2];
                            successNum = 0;
                        }
                        if (tempHealth > health) {
                            tempHealth = health;
                        }
                    }
                }

            }
            answer = tempHealth;

            return answer;

        }
    }


    public static void main(String[] args) {
        int[] bandage = {5, 1, 5};
        int health = 30;
        int[][] attacks = {{2, 10}, {9, 15}, {10, 5}, {11, 5}};

        System.out.println(Solution.solution(bandage, health, attacks));
    }

}
