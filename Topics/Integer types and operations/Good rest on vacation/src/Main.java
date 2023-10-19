import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int   numberOfDays = scanner.nextInt();
        int foodCostPerDay = scanner.nextInt();
        int  oneWayFlight = scanner.nextInt();
        int costOfOneNightInHotel = scanner.nextInt();

        int foodTotal = numberOfDays * foodCostPerDay;
        int flightTotal = oneWayFlight * 2;
        int hotelCost = costOfOneNightInHotel * (numberOfDays -1);
        int total = foodTotal + flightTotal + hotelCost;

        System.out.println(total);
    }
}