package main.java.com.exercises;

import java.util.ArrayList;

public class PerfectNumber {
    public static ArrayList<Integer> findNPerfectNumbers(int n) {


        ArrayList<Integer> listOfPerfectNumbers= new ArrayList<>();

            int sum;
        for (int i=0;i<Integer.MAX_VALUE&&listOfPerfectNumbers.size()<n;i++) {
            sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0)
                    sum += j;
            }
            if (sum == i && sum != 0)
                listOfPerfectNumbers.add(i);
        }


        return listOfPerfectNumbers;

    }
}
