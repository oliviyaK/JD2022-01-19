package by.it.yushkevich.jd02_03.utils;

import java.util.Random;

public class RandomData {

    private RandomData() {
//в утилитарном классе нужен пустой приватный конструктор, чтоб никто не мог его создать , объект
    }

    private static final Random random = new Random();

    public static int get(int min, int max) {
        return min + random.nextInt(max - min + 1);
    }

    public static int get(int max) {
        return get(0, max);
    }
}