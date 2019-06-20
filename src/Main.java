import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Create a program that mimics mage 8 ball
        // Using ArrayList


        ArrayList<String> response = new ArrayList<>();
        Scanner user = new Scanner(System.in);
        Random rand = new Random();

        response.add("It is certain.");
        response.add("It is decidely so.");
        response.add("Without a doubt.");
        response.add("Yes definetly.");
        response.add("You may rely on it.");
        response.add("As I see it, yes.");
        response.add("Most likely.");
        response.add("Outlook good.");
        response.add("Yes.");
        response.add("Signs point to yes.");
        response.add("Reply hazy try again.");
        response.add("Ask again later.");
        response.add("Better not tell you now.");
        response.add("Cannot predict now.");
        response.add("Concentrate and ask again.");
        response.add("Don't count on it.");
        response.add("My reply is no.");
        response.add("My sources say no.");
        response.add("Outlook not so good.");
        response.add("Very doubtful.");

       //use do-while or while when loop prints once
        System.out.println("Hey You!\nAsk me a question.");
        String answer = user.nextLine();

        int rand_reposnse = rand.nextInt(20);



        for (int i = 0; i <= response.size(); i++){
            System.out.println(response.get(rand_reposnse) + "\n");
            break;
        }



//do while here
//        while(user.hasNext("y") || user.hasNext("n")){
        while(true) {
            System.out.println("Would you like to ask another question? (y/n)\n");
            answer = user.nextLine();
            if (answer.equalsIgnoreCase("y")) {
                System.out.println("Your question?");
                user.nextLine();
                System.out.println(response.get(rand_reposnse));
//                continue;


            }
//            System.out.println(response.get(rand_reposnse));



            else{
                System.out.println("Thank you for playing!");
                break;
            }


        }

//        do {
//            System.out.println("Would you like to ask another question?");
//
//
//
//
//        }while(!user.equalsIgnoreCase(n));




//        for ( String respond : response)
//        {
//            System.out.println(rand.nextInt(response.size()));
//        }
//        do {
//
//        }while()



    }

}

