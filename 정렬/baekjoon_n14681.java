package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_n14681 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(bf.readLine());
        int y = Integer.parseInt(bf.readLine());

        if (x>0) {
            if(y>0) System.out.println(1);
            else System.out.println(4);
        } else {
            if(y>0) System.out.println(2);
            else System.out.println(3);
        }
    }
}
