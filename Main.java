import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to number guessing game. You have to guess the number between 1 and 100");
        System.out.println("You will get 3 chances");
        int userInput;

        int max=100,min=1;
        int range = max-min+1;

        for(int i=0;i<4;i++){
            System.out.println("Enter number");
            userInput= sc.nextInt();

            int random = (int)(Math.random()*range)+min;

            if(i==3){
                System.out.println("You have exhausted your chances. You lost");
                break;
            }

            if(userInput==random ){
                System.out.println("Congratulations you won");
                break;
            }
            else if(userInput>random){
                System.out.println("Your input is greater than "+random+ ". Try again");
            }
            else if(userInput<random){
                System.out.println("Your input is less than "+random+ ". Try again");
            }

        }


    }
}
