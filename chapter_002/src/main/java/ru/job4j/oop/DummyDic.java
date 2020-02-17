package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        return eng;
    }
    public static void main(String[] args) {
        DummyDic robot = new DummyDic();
        String eng = robot.engToRus("word");
        System.out.println("Неизвестное слово. " + eng);
    }
}
