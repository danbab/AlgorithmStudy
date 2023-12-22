package programmers;

import java.util.*;
public class DataAnalysis {
    class Solution {
        static int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
            HashMap<String, Integer> map = new HashMap<String, Integer>();

            map.put("code", 0);
            map.put("date", 1);
            map.put("maximum", 2);
            map.put("remain", 3);

            int ext_num = map.get(ext);
            int sort_num = map.get(sort_by);
            List<int[]> list = new ArrayList<>();
            for(int[] d : data){
                if(d[ext_num] < val_ext){
                    list.add(d.clone());
                }
            }
            int[][] answer = list.toArray(new int[0][]);

            Arrays.sort(answer, new Comparator<int[]>() {
                public int compare(int[] a, int[] b) {
                    return Integer.compare(a[sort_num], b[sort_num]);
                }
            });

            return answer;
        }
    }

    public static void main(String[] args) {
        int[][] data = {{1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}};
        String ext="date";
        int val_ext=20300501;
        String sort_by="remain";
        System.out.println(Arrays.deepToString((Solution.solution(data,ext,val_ext,sort_by))));
    }
}
