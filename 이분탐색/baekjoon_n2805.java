package 이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baekjoon_n2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] trees = new int[n];
        int end = 0;

        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < n; i++) {
            trees[i] = Integer.parseInt(st.nextToken());
            end = Math.max(end, trees[i]);
        }
        Arrays.sort(trees);

        int start = 0;
        int result = 0;
        while (start <= end) {
            int mid = (start + end) / 2;
            long temp = 0;  //int형 최대치의 나무 2개, mid = 1이라면 int형 범위를 넘어설 수 있으므로 long으로!

            for (int i = 0; i < n; i++) {
                if (trees[i] > mid) temp += (trees[i] - mid);
            }
            if (temp >= m) {
                result = mid;
                start = mid + 1;
            } else end = mid - 1;
        }
        System.out.println(result);
    }
}
