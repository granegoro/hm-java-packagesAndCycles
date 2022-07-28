package ru.netology.sqr;

public class SQRService {

    public int fairSquare(int lowLimit, int upLimit) {
        int countUp = 0;

        for (int i = 10; i < 100; i++) {
            if (i * i >= lowLimit & i * i <= upLimit) {
                countUp++;
            }
        }
        return countUp;
    }

}
