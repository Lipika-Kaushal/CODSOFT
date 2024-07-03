import java.util.*;

public class codsoft1{
    Random rand = new Random();
    int n =rand.nextInt(100)+1;

    public static void round(int rounds,int chances,int number){
        if(rounds>=6){
            System.out.println("Invalid number of rounds entered , choose between(1,2,3,4,5) only ");
            round(rounds,chances, number);
        }
        else{
            for (int i =0;i<rounds;i++){
                System.out.println("\n\n*Round "+(i+1));
                game(chances);

            }
        }

    }
    public static void game(int chances){
        Random randInt = new Random();
        int n =randInt.nextInt(100)+1;
        int number = n;
        int score = 0;
        Scanner sc = new Scanner(System.in);
        while(chances>0){
            System.out.println("\nPlease guess the number : ");
            int guesses_num = sc.nextInt();

            if(guesses_num>100){
                System.out.println("Please enter number between 1-100 only");
                game(chances);
            }
            else {
                if(guesses_num==number){
                    System.out.println("\nYOU ROCK!!\nYou guessed it right!!");
                }
                else{
                    System.out.println("\nOOPS\nIt was a wrong guess");
                    if(guesses_num-number>15){
                        System.out.println("\nThe guessed number is too high");
                    } else if (number-guesses_num>15) {
                        System.out.println("\nThe guessed number is too low");
                    }
                }
                chances = chances - 1;
            }
        }
        score=chances*5;
        System.out.println("\nYour score for this round is "+score);

        if(chances==0){
            System.out.println("The correct number was - "+number);
        }

    }
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n------------------------Welcome to the NUMBER GAME------------------------\n");
        System.out.println("Please read the instructions below carefully before playing the game:\n");
        System.out.println("1. This is a game of guessing. You will try to guess a secret number.");
        System.out.println("2. The secret number is randomly chosen between 1 and 100.");
        System.out.println("3. Enter your guess when prompted.");
        System.out.println("4. If you guess correctly, you win the round!");
        System.out.println("5. If your guess is incorrect, don't worry. You'll have 4 more chances to guess.");
        System.out.println("6. After all your chances are used, the round ends.");
        System.out.println("7. You can choose the number of rounds you want to play.");
        System.out.println("8. Your score for each round will be displayed after it's completed.");
        System.out.println("9. If it's displayed excessively high or low, it's just a 15-unit variance.");
        System.out.println("\nBEST OF LUCK!");


        codsoft1 c = new codsoft1();
        int number=c.n;
        int chances = 5;

        System.out.println("\nChoose number of rounds(1 or 2 or 3 or 4 or 5)");
        int rounds=sc.nextInt();

        round(rounds,chances,number);
    }
}
