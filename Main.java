import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        if(scanner.nextInt() == 10){
            System.out.println("You types 10");
        }

        scanner.close();
    }

}