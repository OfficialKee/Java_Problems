import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int counter = 0;
        for ( ;a <= b ; a++) {
            if(a%n == 0){
                counter++;
            }
        }
        System.out.println(counter);
    }
}