package 스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class baekjoon_n10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(bf.readLine());

        List<Integer> jangbu = new ArrayList<>();

        for (int i = 0 ; i<k;i++) {
            int calling = Integer.parseInt(bf.readLine());
            if (calling==0) {
                jangbu.remove(jangbu.size()-1);
                continue;
            }
            jangbu.add(calling);
        }
        int sum = 0;
        for(int i: jangbu) {
            sum+= i;
        }
        System.out.println(sum);
    }
}
