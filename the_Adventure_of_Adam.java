package Java_Challenge;

import java.util.Scanner;

public class the_Adventure_of_Adam {
    public static void main(String[] args) {
        System.out.println("Adam accepts your adventure and embarks on the journey");
        System.out.println("Adam is staying in front of three doors. It is very important to him to choose right way! ");
        System.out.println("Dear user, you are responsible to help Adam to select right door. Press 1,2 or 3.");
        Scanner doorInput = new Scanner(System.in);
        int door = doorInput.nextInt();
        if (door==1){
            System.out.println("Adam is going to open a first door.");
            System.out.println("This door is unlocked and has very expensive design.");
            System.out.println("After he turned the knob he entered into the library");
            System.out.println("All of the books are in Russian and Adam doesn't speak it");
            System.out.println("Only two books are in English: Java  and Scrum . ");
            System.out.println("Witch one you choose?");
            Scanner bookInput = new Scanner(System.in);
            String book = bookInput.next();
            bookInput.close();
            switch (book) {
                case "Java":
                    System.out.println("Adam has mastered Java. But while he was reading it - Scrum tutorial has been disappeared");
                    System.out.println("You cannot become a professional without soft skills");
                    System.out.println("Game over");
                break;
                case"Scrum":
                    System.out.println("Adam has mastered Scrum. But while he was reading it - Java tutorial has been disappeared");
                    System.out.println("You cannot become a professional without technical skills");
                    System.out.println("Game over");
                    break;
                default:
                    System.out.println("You selected book in Russian language - Война и мир (War and Peace by Tolstoy). Good luck with that - it will take a couple of years");
                    break;
            }

        }else if(door==2){
            System.out.println("Adam enters a room - and there is a laptop on a table.");
            System.out.println("On a laptop there is already a conference in which 400 people are learning Java and Scrum.");
            System.out.println("A guy named Nadir is looking for volunteers to answer questions");
            System.out.println("So there are two options: turn on a web camera and answer or ignore.");
            System.out.println("Please press 1 or 2");
            Scanner laptopInput = new Scanner(System.in);
            int laptop = laptopInput.nextInt();
            if(laptop==1) {
                System.out.println("You selected first option - to give it  try! Good luck");
                System.out.println("Hello, Adam! I see a very impressive resume in front of me! But I still have a couple of questions");
                System.out.println("First question: What do you like about Agile?");
                System.out.println("Adam has 2 answers on his mind, please help him decide!");
                System.out.println("Option 1: Flexibility and Velocity");
                System.out.println("Option 2: Face to Face communication and Teamwork");
                System.out.println("Please press 1 or 2 to choose");
                Scanner questionOneInput = new Scanner(System.in);
                int questionOne = questionOneInput.nextInt();
                if (questionOne == 1 || questionOne == 2) {
                    System.out.println("Thank you for your answer, Adam. Looks like you are experienced Agile team member!");
                    System.out.println("So, tell me please, how long is your sprint?");
                    System.out.println("Please type your answer in days!");
                    Scanner questionTwoInput = new Scanner(System.in);
                    int questionTwo = questionTwoInput.nextInt();

                    if (questionTwo >= 7 && questionTwo <= 30) {
                        System.out.println("This is a good answer, Adam!");
                        System.out.println("Yes, sprint is never takes longer than a month!");
                        System.out.println("And final question: what is your Scrum team?");
                        System.out.println("And again Adam has only two options on his mind....");
                        System.out.println("Option 1: 4 developers; 2 testers; scrum master and product owner");
                        System.out.println("Option 2: 10 developers; 1 tester; scrum master and product owner");
                        System.out.println("Please type 1 or 2");
                        Scanner questionThreeInput = new Scanner(System.in);
                        int questionThree = questionThreeInput.nextInt();
                        switch (questionThree){
                            case 1:
                                System.out.println("Good job, Adam");
                                System.out.println("You have a good knowledge about Scrum and Agile");
                                System.out.println("CONGRATS! YOU WON!!!!");
                            case 2:
                                System.out.println("Sorry, but 1 tester cannot handle that normally");
                                System.out.println("Thank you Adam, it was close enough. Please be ready next time!");
                                System.out.println("Game over!");

                            default:
                                System.out.println("Could you please repeat, I didn't understand");
                                System.out.println("Try again");
                        }

                    } else if (questionTwo > 30) {
                        System.out.println("It doesn't sound like you worked in Agile");
                        System.out.println("Sorry but I will ask the person that learned something.....");
                        System.out.println("Game Over");

                    } else if (questionTwo < 6) {
                        System.out.println("It doesn't sound like you worked in Agile");
                        System.out.println("Sorry but I will ask the person that learned something.....");
                        System.out.println("Game Over");

                    } else {
                        System.out.println("Can understand what are you saying..");
                        System.out.println("Please try again");
                    }
                } else {
                    System.out.println("Sorry, Adam, looks like we have a miss understanding.");

                }
            }

            else if (laptop == 2) {
                    System.out.println("I decided to ignore, so nothing happened....");
                    System.out.println("Game Over!");

                } else {
                    System.out.println("You probably don't know how to turn on web camera on this old PC...Try again!");

                }

            }


        else if(door==3){
            System.out.println("Adam is trying to open a door but looks like the door is made from a cake!");
            System.out.println("There are two options: to eat the door or to slam it");
            System.out.println("Please enter 1 or 2");
            Scanner cakeDoorInput = new Scanner(System.in);
            int cakeDoor = cakeDoorInput.nextInt();
            switch (cakeDoor){
                case 1:
                    System.out.println("Did you really eat a door?");
                    System.out.println("Game Over!");
                    break;

                case 2:
                    System.out.println("This is how we enter a room in Cybertek! >_<");
                    System.out.println("After couple minutes of searching Adam see's the coffee cup on the table");
                    System.out.println("Without thinking even a minute he drinks it.");
                    System.out.println("He wrenches his eyes open...");
                    System.out.println("Head hearts and Adam is lying on the floor. He rolled slowly on the smooth cold floor...");
                    System.out.println("He can't remember anything after that...");
                    System.out.println("You clutch at memory, and there is nothing but empty air... ");
                    System.out.println("Please enter a new name:");
                    Scanner newNameInput = new Scanner(System.in);
                    String newName = newNameInput.next();
                    newNameInput.close();
                    System.out.println(newName+" .... I like this name...");
                    System.out.println("After that cup of coffee You don't know anything.... but Java");
                    System.out.println("The door starts to open behind you..");
                    System.out.println("You are hired for 200K, "+newName+"!");
                    System.out.println("You WON!CONGRATS!");
                    System.out.println("                        (");
                    System.out.println("                          )     (");
                    System.out.println("                   ___...(-------)-....___\n");
                    System.out.println("               .-\"\"       )    (          \"\"-.\n");
                    System.out.println("         .-'``'|-._             )         _.-|\n");
                    System.out.println("        /  .--.|   `\"\"---...........---\"\"`   |\n");
                    System.out.println("       /  /    |                             |\n");
                    System.out.println("       /  /    |                             |\n");
                    System.out.println("        \\  \\   |                             |\n");
                    System.out.println("         `\\ `\\ |                             |\n");
                    System.out.println("           `\\ `|                             |\n");
                    System.out.println("           _/ /\\                             /\n");
                    System.out.println("          (__/  \\                           /\n");
                    System.out.println("       _..---\"\"` \\                         /`\"\"---.._\n");
                    System.out.println("    .-'           \\                       /          '-.\n");
                    System.out.println("   :               `-.__             __.-'              :\n");
                    System.out.println("   :                  ) \"\"---...---\"\" (                 :\n");
                    System.out.println("    '._               `\"--...___...--\"`              _.'\n");
                    System.out.println(" Java \\\"\"--..__                              __..--\"\"/\n");
                    System.out.println("       '._     \"\"\"----.....______.....----\"\"\"     _.'\n");


                    break;
                default:
                    System.out.println("You are just staring on the door...");
                    System.out.println("Something went wrong, please try again!");
                    break;
            }

        }else{
            System.out.println("Adam is confused. It doesn't seem you told him a right number. Please try again!");
        }

    }
}
