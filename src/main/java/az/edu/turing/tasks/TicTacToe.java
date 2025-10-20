package az.edu.turing.tasks;

import java.util.Scanner;

public class TicTacToe {
    private final char[][] board;
    private char currentPlayer;


    public TicTacToe() {
        this.board = new char[3][3];
        this.currentPlayer = 'X';
        initializeBoard();
    }

    public void play(){
        boolean gameWin= false;
        int row;
        int col;

        Scanner input = new Scanner(System.in);
        while(!gameWin){
            System.out.println("Cari oyun sahesi: ");
            printBoard();

            System.out.print("Oyunçu " + currentPlayer+ ", sətri daxil et(1-3): ");
            row = input.nextInt() - 1;
            System.out.print("Oyunçu " + currentPlayer+ ", sütunu daxil et(1-3): ");
            col = input.nextInt() - 1;

            if(board[row][col] == ' '){
                board[row][col] =currentPlayer;
                gameWin=checkWinner(row,col);

                if(gameWin){
                    System.out.println("Oyuncu "+ currentPlayer + " qazandi!");
                }else if(isFull()){
                    System.out.println(" Oyun bitdi");
                }else{
                    switchPlayer();
                }

            }else{
                System.out.println("Bu xana artiq dolub! Yeniden cehd edin: ");

            }
        }
    }

    private boolean checkWinner(int row,int col) {
        return board[row][0]==currentPlayer && board[row][1]==currentPlayer&board[row][2]==currentPlayer
                ||board[0][col]==currentPlayer&& board[1][col]==currentPlayer&board[2][col]==currentPlayer
                || board[0][0]==currentPlayer&& board[1][1]==currentPlayer&board[2][2]==currentPlayer
                || board[0][2]==currentPlayer&& board[1][1]==currentPlayer&& board[2][0]==currentPlayer;
    }

    private void initializeBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = ' ';
            }
        }
    }
    private void printBoard() {
        for (int row = 0; row < 3; row++) {
            System.out.print("| ");
            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col]+ " | ");
            }
            System.out.println();
        }
    }
    private boolean isFull() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row][col] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    private void switchPlayer() {
        currentPlayer=currentPlayer == 'X' ? 'O' : 'X';
    }


}
