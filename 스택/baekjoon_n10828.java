package 스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class baekjoon_n10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(bf.readLine());
        List<Integer> stack = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            List<String> command = List.of(bf.readLine().split(" "));
            String commandWord = command.get(0);

            switch (commandWord) {
                case "push":
                    stack.add(Integer.valueOf(command.get(1)));
                    break;
                case "pop":
                    if (stack.isEmpty()) System.out.println(-1);
                    else System.out.println(stack.remove(stack.size() - 1));
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    if (stack.isEmpty()) System.out.println(1);
                    else System.out.println(0);
                    break;
                default:
                    if (stack.isEmpty()) System.out.println(-1);
                    else System.out.println(stack.get(stack.size() - 1));
                    break;
            }
        }
    }
}
