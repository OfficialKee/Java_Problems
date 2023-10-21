import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double sum = 0;
        int counter = 0;
         for (; a <= b; a++){
             if(a % 3 == 0){
                 sum += a;
                 counter++;
             }

         }
         double total  = sum / counter;
         System.out.println(total);
    }
}