package ru.job4j.array;

public class MatrixCheck {
    public static boolean horizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
    public static boolean vertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
    public static char[] diagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int index = 0; index < board.length; index++) {
            rsl[index] = board[index][index];
        }
        return rsl;
    }
    public static boolean win(char[][] board) {
        boolean result = false;
        for (int index = 0; index < board.length; index++) {
            if (horizontal(board, index) || vertical(board, index)) {
                result = true;
                break;
            }
        }
        return result;
    }
}