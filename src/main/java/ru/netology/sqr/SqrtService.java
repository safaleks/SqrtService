package ru.netology.sqr;

public class SqrtService {
    public int calcCount(int min, int max) {
        int quantity = 0;
        int x = 99;
        for (int i = 10; i <= x; i++) {
            if (i * i >= min & i * i <= max) {
                quantity++;
                System.out.println(i);
            }
            if (i * i > max) {
                break;
            }
        }
        return quantity;

    }
}
