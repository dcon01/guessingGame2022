package com.example.guessinggame;

import java.util.Random;

public class Game {

    static int randomNum() {
        Random randomNum = new Random();
        return randomNum.nextInt(11);

    }

    public static boolean check(int userNum) {
        int secret = randomNum() + 1;
        System.out.println(secret);
        return secret == userNum;

    }
}
