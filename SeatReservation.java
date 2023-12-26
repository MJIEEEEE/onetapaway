//Mark Jason C. Manalo
//BSIT104

import java.util.*;
public class SeatReservation{
    public static void main(String[] args){
        
        Scanner userInput = new Scanner(System.in);
        int[][] seats = new int[10][4];
        System.out.println("Bus Seat Reservation:");
        while (true) {
            System.out.println("         Col 1   Col 2   Col 3   Col 4");
            for (int i = 0; i < seats.length; i++) {
                System.out.print("row " + (i + 1) + " | ");
                
                for (int j = 0; j < seats[i].length; j++) {
                    System.out.print(seats[i][j] == 0 ? "   *    " : "   X    ");
                }
                
                System.out.println();
            }
            System.out.println("Please see the table for your reference.");
            System.out.println("Please enter your desired seat number using the following format: (Enter row and column) (Enter negative any negative number to exit): ");
            int row = userInput.nextInt();
            int column = userInput.nextInt();
            if (row < 0 || column < 0) {
                break;
            }
            seats[row - 1][column - 1]++;
        }
    }
}