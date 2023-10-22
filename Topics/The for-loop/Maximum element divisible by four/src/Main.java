import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int arrayLength = scanner.nextInt();
        int nextNum = 0;
        int maximum = 0;
        for (int i = 0; i < arrayLength; i++) {
            nextNum = scanner.nextInt();
            if(nextNum % 4 == 0 && nextNum > maximum){
                maximum = nextNum;
            }
        }
        System.out.println(maximum);
    }
}