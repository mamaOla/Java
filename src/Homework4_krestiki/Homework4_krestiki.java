package Homework4_krestiki;

import java.util.Arrays;
import java.util.Scanner;

public class Homework4_krestiki {
    static char[][] board = new char[3][3];
    static char currentPlayer = 'X';
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initializeBoard();
        printBoard();

        while (true) {
            makeMove();
            printBoard();

            if (checkWin()) {
                System.out.println("Игрок " + currentPlayer + " победил!");
                break;
            } else if (checkDraw()) {
                System.out.println("Ничья!");
                break;
            }

            switchPlayer();
        }

        scanner.close();
    }

    static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            Arrays.fill(board[i], ' ');
        }
    }

    static void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    static void makeMove() {
        int row, col;

        do {
            System.out.print("Игрок " + currentPlayer + ", введите номер строки (1-3): ");
            row = scanner.nextInt() - 1;
            System.out.print("Игрок " + currentPlayer + ", введите номер столбца (1-3): ");
            col = scanner.nextInt() - 1;

            if (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != ' ') {
                System.out.println("Некорректный ход. Попробуйте еще раз.");
            }
        } while (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != ' ');

        board[row][col] = currentPlayer;
    }

    static boolean checkWin() {
        // Проверка строк, столбцов и диагоналей
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) return true;
            if (board[0][i] != ' ' && board[0][i] == board[1][i] && board[1][i] == board[2][i]) return true;
        }
        if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) return true;
        if (board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) return true;
        return false;
    }

    static boolean checkDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') return false;
            }
        }
        return true;
    }

    static void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }
}
