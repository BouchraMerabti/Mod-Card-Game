import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        // Welcome msg
        // input so the user can choose what mood they are in it
        // choose adjective, name a verb place
        // grttinh thr text

        Scanner scanner = new Scanner(System.in);

        String mood = "";
        String name, adjective, place, verb, object;

        System.out.println("Welcome to your new adventure 🤩");
        System.out.println("---------------------------------");

        System.out.print("How you want your game mood to be ? (FUNNY/ SCARY/ ROMANTIC/ MYSTERY/ GAMER STYLE/ FANTASY / ADVENTURE) : ");
        name = scanner.nextLine().toLowerCase();

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






            if (mood.equals("FUNNY")) {
                System.out.printf("Your car, looking extremely %s " +
                                " suddenly decides to %s right in the middle of %s.\n " +
                                "Everyone stares as %s jumps out holding a giant %s, shouting,\n" +
                                " ‘THIS WASN’T PART OF THE PLAN!!’\n And just like that… your road trip becomes the weirdest moment of the year." , adjective,
                        verb, place, name, object);

            }
//            else if (mood.equals("SCARY")) {
//                System.out.printf("The night was unusually %s when your car began to %s by itself near %s.\n" +
//                        " A chill ran down your spine as a shadow shaped like %s appeared in the rear-view mirror.\n" +
//                        "The radio crackled, repeating the word '%s' over and over… and the road ahead suddenly vanished.", adjective,
//                        verb, place, name, object);
//
//            }else if (mood.equals("ROMANTIC")) {
//                System.out.printf("As the sky turned %s, your car gently slowed down near %s\n." +
//                        " %s smiled softly and handed you a %s\n. " +
//                        "In that moment, while the engine continued to %s\n, " +
//                        "you realized that this unexpected drive had become the beginning of something truly beautiful.", adjective,
//                        place, name, object, verb);
//
//            }else if (mood.equals("ADVENTURE")) {
//                System.out.printf("Your %s car sped across %s, ready to %s at full power.\n" +
//                        " Suddenly, %s tossed you a %s and yelled, " +
//                        "‘\nHOLD THIS! IT’S YOUR ONLY CHANCE!’\n With the wind roaring around you, the adventure of a lifetime had officially begun.",
//                        adjective, place, verb, name, object);
//
//            }else if (mood.equals("MYSTERY")) {
//                System.out.printf("The case began on a %s afternoon when your car was seen near %s,\n" +
//                                " trying to ç for no clear reason.\n" +
//                                " Inside, a single clue was found: a %s with the initials of %s\n." +
//                                " Nothing made sense yet you knew this mystery was only getting started.",
//                        adjective, place, verb, object, name);
//
//            }
//            else if (mood.equals("GAMER STYLE")) {
//                System.out.printf("Your car respawned with a %s glow as you entered %s\n. Suddenly, the engine began to %s like it just unlocked a secret skill.\n" +
//                        " Out of nowhere, %s appeared holding a legendary %s, yelling, ‘BRO, THIS ISN’T EVEN YOUR FINAL FORM!’\n " +
//                        "With that, your quest line officially updated—and your speed stat just went OP.", adjective,
//                        place, verb, name, object);
//
//            }else if (mood.equals("FANTASY")) {
//                System.out.printf("In the ancient lands of %s, your %s carriage roared to life,\n " +
//                                "ready to %s through magic-filled roads\n. A mysterious figure, %s, emerged from swirling mist holding a glowing %s\n." +
//                                " With a whisper of forgotten spells, the journey ahead promised danger, wonder, and destiny.", place, adjective,
//                        verb, name, object);
//
//            } else if (!mood.equals("FUNNY") && !mood.equals("SCARY") && !mood.equals("ROMANTIC") &&
//                    !mood.equals("MYSTERY") && !mood.equals("GAMER STYLE") && !mood.equals("FANTASY")){
//                System.out.println("Choose one of the moods");
//            }






        scanner.close();
    }
}
