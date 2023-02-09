package controllers;


import entities.Match;
import entities.Player;
import enums.GameMode;

import java.util.Objects;

public class XOController {

    private String[][] board;
    private String currentPlayerMark;
    private int turn;

    private boolean won = false;

    private Match match;

    public static GameMode gameMode = GameMode.IS_PLAYER_MODE;

    //    enum with the possible states of the game


    public XOController(Match match, GameMode gameMode) {
        this.match = match;
        XOController.gameMode = gameMode;
        resetGame();
    }

    private void setWon(boolean won) {
        this.won = won;
    }

    public boolean isWon() {
        return won;
    }


    public void resetGame() {
        board = new String[3][3];
        turn = 0;
        currentPlayerMark = "X";
        setWon(false);
        initializeBoard();
    }

    public void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = "-";
            }
        }
    }

    private void togglePlayer() {
        currentPlayerMark = currentPlayerMark.equals("X") ? "O" : "X";
    }

    public boolean placeMark(int row, int col) {
        if (!isWon() && board[row][col].equals("-")) {
            if (board[row][col].equals("-")) {
                board[row][col] = currentPlayerMark;
                turn++;
                this.togglePlayer();
                return true;
            }
        }
        return false;
    }


    private void validateWhoWon() {

        Player winner = this.getWinner();

        setWon(true);
        match.winPlayer(winner);

    }

    public int[][] checkForWin() {

        if (checkRowsForWin() != null) {
            validateWhoWon();

            return checkRowsForWin();
        }

        if (checkColumnsForWin() != null) {
            validateWhoWon();
            return checkColumnsForWin();
        }

        if (checkDiagonalsForWin() != null) {
            validateWhoWon();
            return checkDiagonalsForWin();
        }

        return null;

    }

    private int[][] checkRowsForWin() {
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(board[i][0], board[i][1], board[i][2])) {

                return new int[][]{{i, 0}, {i, 1}, {i, 2}};
            }
        }
        return null;
    }

    private int[][] checkColumnsForWin() {
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(board[0][i], board[1][i], board[2][i])) {
                return new int[][]{{0, i}, {1, i}, {2, i}};
            }
        }
        return null;
    }

    private int[][] checkDiagonalsForWin() {
        if (checkRowCol(board[0][0], board[1][1], board[2][2])) {
            return new int[][]{{0, 0}, {1, 1}, {2, 2}};
        }
        if (checkRowCol(board[0][2], board[1][1], board[2][0])) {
            return new int[][]{{0, 2}, {1, 1}, {2, 0}};
        }
        return null;
    }

    private boolean checkRowCol(String c1, String c2, String c3) {
        return !Objects.equals(c1, "-") && c1.equals(c2) && c2.equals(c3);
    }


    public String[][] getBoard() {
        return board;
    }


    public void newGame() {
        resetGame();
    }

    public boolean finished() {
        return turn == 9;
    }

    public Player getWinner() {
        return currentPlayerMark.equals("O") ? match.getPlayer1() : match.getPlayer2();
    }

    public boolean isWinPlayer1() {
        return getWinner().equals(match.getPlayer1());
    }

    private int generateMachineMove() {
        return (int) (Math.random() * 3);
    }

    public int[][] getMachineMove() {
        int row = generateMachineMove();
        int col = generateMachineMove();

        while (!placeMark(row, col)) {
            row = generateMachineMove();
            col = generateMachineMove();
        }

        return new int[][]{{row, col}};
    }

    public GameMode getGameMode() {
        return gameMode;
    }

}