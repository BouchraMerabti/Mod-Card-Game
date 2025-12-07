import java.util.Scanner;

public class Main {



    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";
    public static void main (String[] args){




        Scanner scanner = new Scanner(System.in);

        String mood;
        String name, adjective, place, verb, object;

        System.out.println("Welcome to your new adventure 🤩");
        System.out.println("---------------------------------");

        System.out.print("How you want your game mood to be ? (FUNNY/ SCARY/ ROMANTIC/ MYSTERY/ GAMER STYLE/ FANTASY / ADVENTURE) : ");
        mood = scanner.nextLine().toLowerCase();


        System.out.print("Enter a name : ");
        name = scanner.nextLine();

        System.out.print("Enter an adjective : ");
        adjective = scanner.nextLine();

        System.out.print("Enter a place : ");
        place = scanner.nextLine();

        System.out.print("Enter a verb : ");
        verb = scanner.nextLine();

        System.out.print("Enter an object : ");
        object = scanner.nextLine();



            switch (mood) {
                case "funny" :
                    System.out.println("---------------------------------");
                    System.out.println("Your card ✨ : ");
                    System.out.println("➡️➡️➡️➡️");
                    System.out.printf(YELLOW + "Your car, looking extremely %s " +
                                    " suddenly decides to %s right in the middle of %s.\n " +
                                    "Everyone stares as %s jumps out holding a giant %s, shouting,\n" +
                                    " ‘THIS WASN’T PART OF THE PLAN!!’\n And just like that… your road trip becomes the weirdest moment of the year." , adjective,
                            verb, place, name, object);
                    break;

                case "scary" :
                    System.out.println("---------------------------------");
                    System.out.println("Your card ✨ : ");
                    System.out.println("➡️➡️➡️➡️");
                    System.out.printf( BLUE + "The night was unusually %s when your car began to %s by itself near %s.\n" +
                                    " A chill ran down your spine as a shadow shaped like %s appeared in the rear-view mirror.\n" +
                                    "The radio crackled, repeating the word '%s' over and over… and the road ahead suddenly vanished.", adjective,
                            verb, place, name, object);
                    break;

                case "romantic" :
                    System.out.println("---------------------------------");
                    System.out.println("Your card ✨ : ");
                    System.out.println("➡️➡️➡️➡️");
                    System.out.printf(CYAN + "As the sky turned %s, your car gently slowed down near %s\n." +
                                    " %s smiled softly and handed you a %s\n. " +
                                    "In that moment, while the engine continued to %s\n, " +
                                    "you realized that this unexpected drive had become the beginning of something truly beautiful.", adjective,
                            place, name, object, verb);
                    break;

                case "adventure"  :
                    System.out.println("---------------------------------");
                    System.out.println("Your card ✨ : ");
                    System.out.println("➡️➡️➡️➡️");
                    System.out.printf( PURPLE + "Your %s car sped across %s, ready to %s at full power.\n" +
                                    " Suddenly, %s tossed you a %s and yelled, " +
                                    "‘\nHOLD THIS! IT’S YOUR ONLY CHANCE!’\n With the wind roaring around you, the adventure of a lifetime had officially begun.",
                            adjective, place, verb, name, object);
                    break;



                case "mystery" :
                    System.out.println("---------------------------------");
                    System.out.println("Your card ✨ : ");
                    System.out.println("➡️➡️➡️➡️");
                    System.out.printf(GREEN + "The case began on a %s afternoon when your car was seen near %s,\n" +
                                    " trying to ç for no clear reason.\n" +
                                    " Inside, a single clue was found: a %s with the initials of %s\n." +
                                    " Nothing made sense yet you knew this mystery was only getting started.",
                            adjective, place, verb, object, name);
                    break;

                case "gamer style" :

                    System.out.println("---------------------------------");
                    System.out.println("Your card ✨ : ");
                    System.out.println("➡️➡️➡️➡️");
                    System.out.printf(WHITE + "Your car respawned with a %s glow as you entered %s\n. Suddenly, the engine began to %s like it just unlocked a secret skill.\n" +
                                    " Out of nowhere, %s appeared holding a legendary %s, yelling, ‘BRO, THIS ISN’T EVEN YOUR FINAL FORM!’\n " +
                                    "With that, your quest line officially updated—and your speed stat just went OP.", adjective,
                            place, verb, name, object);
                    break;

                case "fantasy" :
                    System.out.println("---------------------------------");
                    System.out.println("Your card ✨ : ");
                    System.out.println("➡️➡️➡️➡️");
                    System.out.printf(RED + "In the ancient lands of %s, your %s carriage roared to life,\n " +
                                    "ready to %s through magic-filled roads\n. A mysterious figure, %s, emerged from swirling mist holding a glowing %s\n." +
                                    " With a whisper of forgotten spells, the journey ahead promised danger, wonder, and destiny.", place, adjective,
                            verb, name, object);
                    break;

                default :
                    System.out.println("Enter a valid mood");




            }






        scanner.close();
    }
}
