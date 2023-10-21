import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int amountOfParts = scanner.nextInt();

        int numberToBeShipped = 0;
        int numberToBeFIxed = 0;
        int numberOfRejects = 0;
        int updated;

        for (int i = 0; i < amountOfParts; i++) {
             updated = scanner.nextInt();
             if(updated == 0){
                 numberToBeShipped++;
             }
             if(updated == 1){
                 numberToBeFIxed++;
             }
             if(updated == -1){
                 numberOfRejects++;
             }

        }
        System.out.print(numberToBeShipped);
        System.out.print(' ');
        System.out.print(numberToBeFIxed);
        System.out.print(' ');
        System.out.print(numberOfRejects);
    }
}