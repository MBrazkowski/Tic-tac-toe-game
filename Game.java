import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        int[][] game = new int [3][3];
        int result, x = 0, y = 0, player = 1;

        System.out.println("Select horizontal coordinate (X) [0, 1, 2] and vertical coordinate (Y) [0, 1, 2].");

        while(true) {
            System.out.print("Enter the coordinate X - player " + player + ": ");
            x = data.nextInt();
            System.out.print("Enter the coordinate Y - player " + player + ": ");
            y = data.nextInt();

            if (game[x][y] != player && game[x][y] != 0) {
                System.out.println("You lose your queue!");
                if (player == 1) {
                    player = 2;
                } else {
                    player = 1;
                }
                System.out.print("Enter the coordinate X - player " + player + ": ");
                x = data.nextInt();
                System.out.print("Enter the coordinate Y - player " + player + ": ");
                y = data.nextInt();
                game[x][y] = player;
                continue;
            } else if (game[x][y] == player) {
                System.out.println("These coordinates are already taken. Try again.");
                System.out.print("Enter the coordinate X - player " + player + ": ");
                x = data.nextInt();
                System.out.print("Enter the coordinate Y - player " + player + ": ");
                y = data.nextInt();
            }
            game[x][y] = player;

            if (game[0][0] == player && game[0][1] == player && game[0][2] == player) {
                System.out.println("You Win!");
                break;
            } else if (game[1][0] == player && game[1][1] == player && game[1][2] == player) {
                System.out.println("You Win!");
                break;
            } else if (game[2][0] == player && game[2][1] == player && game[2][2] == player) {
                System.out.println("You Win!");
                break;
            } else if (game[0][0] == player && game[1][0] == player && game[2][0] == player) {
                System.out.println("You Win!");
                break;
            } else if (game[0][1] == player && game[1][1] == player && game[2][1] == player) {
                System.out.println("You Win!");
                break;
            } else if (game[0][2] == player && game[1][2] == player && game[2][2] == player) {
                System.out.println("You Win!");
                break;
            } else if (game[0][0] == player && game[1][1] == player && game[2][2] == player) {
                System.out.println("You Win!");
                break;
            } else if (game[0][2] == player && game[1][1] == player && game[2][0] == player) {
                System.out.println("You Win!");
                break;
            } else if (game[0][0] != 0 && game[0][1] != 0 && game[0][2] != 0 && game[1][0] != 0 && game[1][1] != 0 && game[1][2] != 0 && game[2][0] != 0 && game[2][1] != 0 && game[2][2] != 0) {
                System.out.println("End of the game. Nobody is a winner.");
                break;
            }
            else {
                if (player == 1) {
                    player = 2;
                } else {
                    player = 1;
                }
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(game[i][j]);
                }
                System.out.println();
            }
        }
        data.close();
    }
}