package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        //boolean Horiz = Horizontal()
        //boolean Vert = Vertical();
        for (int i = 0; i < board.length; i++) {
            if (Horizontal(board, i) || Vertical(board, i)) {
                rsl = true;

            }
        }


        return rsl;
    }

    public static boolean Horizontal(int[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {


            if (board[row][i] != 1) {
                result = false;
                break;
            }

        }
        return result;
    }
    public static boolean Vertical(int[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }
}


