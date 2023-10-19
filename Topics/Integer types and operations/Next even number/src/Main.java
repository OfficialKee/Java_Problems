import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int value = scanner.nextInt();

        if(value%2 == 0){
            System.out.println(value+2);
        }
        else{
            System.out.println(value+1);
        }
    }
}