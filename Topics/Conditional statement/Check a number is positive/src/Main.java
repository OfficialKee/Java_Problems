import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int value = scanner.nextInt();
        if(value > 0){
            System.out.println("YES");
        }
        else if(value <= 0 ){
            System.out.println("NO");
        }
    }
}