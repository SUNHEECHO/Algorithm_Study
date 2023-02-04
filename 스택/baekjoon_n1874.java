package 스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Stack;
import java.util.stream.IntStream;

public class baekjoon_n1874 {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(bf.readLine());

        List<Integer> list = IntStream.range(1, n + 1).boxed().toList();
        Stack<Integer> stack = new Stack<>();
        Stack<String> result = new Stack<>();
        int listIndex = 0;

        for (int i = 0;i<n;i++) {
            int input = Integer.parseInt(bf.readLine());
            while (listIndex!=n && list.get(listIndex)<=input) {
                stack.push(list.get(listIndex++));
                result.push("+");
            }
            if (input == stack.get(stack.size()-1)) {
                stack.pop();
                result.push("-");
            }
        }

        if (stack.size() != 0) {
            System.out.println("NO");
        } else {
            for (String buho: result) {
                System.out.println(buho);
            }
        }


    }
}
