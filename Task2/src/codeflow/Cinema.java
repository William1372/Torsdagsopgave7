package codeflow;

public class Cinema {
    String[][] seats;

    public Cinema(int rows, int seatsPerRow) {

        this.seats = new String[rows][seatsPerRow];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < seatsPerRow; j++) {

                this.seats[i][j] = "O";

            }

        }

        this.seats[0][0] = "X";

    }

    public int getRows() {

        return seats.length;

    }

    public int getSeats() {

        return seats[0].length;

    }

    public boolean reserve(int row, int seat) {

        if (seats[row][seat].equals("O")) {

            seats[row][seat] = "X";
            return true;

        }

        return false;

    }

    public boolean cancelReservation(int row, int seat) {
        if (seats[row][seat].equals("X")) {

            seats[row][seat] = "O";
            return true;

        }

        return false;

    }

    public String toString() {
        String result = "";

        for (int i = 0; i < seats.length; i++) {

            result += "|";

            for (int j = 0; j < seats[i].length; j++) {

                result += seats[i][j] + "|";

            }

            result += "\n";

        }

        return result;

    }

}
