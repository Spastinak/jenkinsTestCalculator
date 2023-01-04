package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class StringCalculator {
    StringTokenizer stringTokenizer;

    public int add(String numbers) {
        String[] split = new String[2];
        if (numbers.contains("//")) {
            split = numbers.split("\n", 2);
            stringTokenizer = new StringTokenizer(split[1], split[0]);
        }
        else {
            stringTokenizer = new StringTokenizer(numbers, ", \n");
        }


        List<Integer> list = new ArrayList<>();
        int result = 0;
        while(stringTokenizer.hasMoreTokens()) {
            int i = Integer.parseInt(stringTokenizer.nextToken());
            list.add(i);
        }
        for (int i: list) {
            result += i;
        }
        return result;
    }
}
