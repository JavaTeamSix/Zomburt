import java.util.Scanner;

public class Game {

    public static void main(String[] args) throws InterruptedException {
        Boolean win = false, lose = false;
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?");
        Character player = new Character(in.nextLine());

        String intro = "In the distant year of 2021, an advanced infectious airborne \n" +
                "disease has turned the population into Divoc Zombies. \n" +
                "All that remains is you and a few of your fellow Faction members. \n" +
                "You must navigate through three heavily infected Zombie areas to find \n" +
                "the magical antidote and locate your friends and family to free them \n" +
                "from a Zombie life of Divoc Suffering. \n" +
                "If you fail, you will become a Divoc Zombie.";
        char[] chars = intro.toCharArray();
        // Print a char from the array, then sleep for 1/25 second
        for (int i = 0; i < chars.length; i++){
            System.out.print(chars[i]);
//            Thread.sleep(25);
        }
        System.out.println();

        while (win == false || lose == false) {
            System.out.print(">");
            String input = in.nextLine();
            if(input.isEmpty()) {
                continue;
            }
            Parser.runCommands(input);
            }
    }
}
