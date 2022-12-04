package com.example.university.PPJ13;

public class Task01 {
    public static void main(String[] args) {
        String[][] arr =
                {{"Germany", "2", "Scotland", "1"},
                        {"Poland", "2", "Germany", "0"},
                        {"Germany", "1", "Ireland", "1"},
                        {"Poland", "2", "Scotland", "2"},
                        {"Scotland", "1", "Ireland", "0"},
                        {"Ireland", "1", "Poland", "1"},
                        {"Ireland", "1", "Scotland", "1"},
                        {"Germany", "3", "Poland", "1"},
                        {"Scotland", "2", "Germany", "3"},
                        {"Ireland", "1", "Germany", "0"},
                        {"Scotland", "2", "Poland", "2"},
                        {"Poland", "2", "Ireland", "1"}};
        int[] scores = new int[4];//Germany, Ireland, Poland, Scotland
        for (int i = 0; i < arr.length; i++) {
            if (Integer.parseInt(arr[i][1]) > Integer.parseInt(arr[i][3])) {
                increaseScore(arr[i][0], 3, scores);
            } else if (Integer.parseInt(arr[i][1]) < Integer.parseInt(arr[i][3])) {
                increaseScore(arr[i][2], 3, scores);
            } else {
                increaseScore(arr[i][0], 1, scores);
                increaseScore(arr[i][2], 1, scores);
            }
        }
        for (int le : scores) {
            System.out.println(le);
        }
    }

    static void increaseScore(String team, int score, int[] arr) {
        switch (team) {
            case "Germany":
                arr[0] += score;
                break;
            case "Ireland":
                arr[1] += score;
                break;
            case "Poland":
                arr[2] += score;
                break;
            case "Scotland":
                arr[3] += score;
                break;
        }
    }
}

