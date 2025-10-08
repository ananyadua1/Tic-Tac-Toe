import java.util.Scanner;
import java.util.Random;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.println("Welcome to Rock Paper Scissors!");
        while(true){
            System.out.println("Enter your choice!");
            String userChoice = sc.nextLine().toLowerCase();
            
            if(!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")){
                System.out.println("Invalid Choice! ");
                continue;
            }
            
            String[] choices = { "rock" , "paper" , "scissors"};
            String computerChoice = choices[rand.nextInt(3)];
            System.out.println("Computer chose: " + computerChoice);
            
            if(userChoice.equals(computerChoice)){
                System.out.println("It's a tie! ");
            }
            else if((userChoice.equals("rock") && computerChoice.equals("scissors")) || 
            (userChoice.equals("scissors") && computerChoice.equals("paper")) ||
            (userChoice.equals("paper") && computerChoice.equals("rock")))
            {
                System.out.println("Congratulations! You win...");
            }
            else{
                System.out.println("You lose!");
            }
            
            System.out.println("Do you wish to play again?(yes/no)");
            String in = sc.nextLine().toLowerCase();
            
            if(!in.equals("yes")){
                System.out.println("Thanks for playing! ");
                break;
            }
            
            
    }
    sc.close();
    
}
}