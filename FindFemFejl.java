package codeflow;

public class FindFemFejl {

    public static void main(String[] args) {
        Cinema biogrande = new Cinema(20, 10);

        // Her ville man også kunne fikse ArrayOutOfBounds med nogle '- 1'ere'
        System.out.println("Række 1, sæde 5 er reserveret: " + biogrande.reserve(1, 5));

        System.out.println(biogrande);

        int numberOfRows = biogrande.getRows();
        int numberOfSeats = biogrande.getSeats();
        biogrande.reserve(numberOfRows, numberOfSeats);

        System.out.println("Række 1, sæde 5 er afbestilt: " + biogrande.cancelReservation(1, 5));

    }
}
