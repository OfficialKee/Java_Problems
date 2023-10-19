import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int hourOne = Integer.parseInt(scanner.next());
        int minuteOne =Integer.parseInt(scanner.next());
        int secondOne = Integer.parseInt(scanner.next());

        int hourTwo = Integer.parseInt(scanner.next());
        int minuteTwo = Integer.parseInt(scanner.next());
        int secondTwo = Integer.parseInt(scanner.next());

        int hoursToSeconds = (hourTwo*60*60) -(hourOne*60*60);
        int minutesToSeconds = (minuteTwo*60) - (minuteOne *60);
        int finalSeconds = secondTwo -secondOne;

        System.out.println(hoursToSeconds+=minutesToSeconds+=finalSeconds);



    }
}