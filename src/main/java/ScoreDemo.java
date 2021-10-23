// Fernando Branco
// CIS 2353
// Fall 2021
// Project 2

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScoreDemo {

    public static void main(String[] args) throws FileNotFoundException {
        ScoreList list = new ScoreList();
        //ScoreNode head = new ScoreNode(null, 0);
        list.setHead(new ScoreNode("fe", 2));
        ScoreNode second = new ScoreNode("Carlos", 5);
        ScoreNode third = new ScoreNode("Jose", 10);

        list.getHead().setNextNode(second);
        second.setNextNode(third);
        //System.out.println(list.getHead());
        list.print();




//        ScoreList list = new ScoreList();
//        ScoreList temp = new ScoreList();
//        Scanner keyboard = new Scanner(System.in);
//
//
//        // Open the file.
//        File file = new File("scores.txt");
//        Scanner inputFile = new Scanner(file);
//        while (inputFile.hasNext()) {
//            temp.addToList(inputFile.next(), inputFile.nextInt());
//        }
//
//        inputFile.close();
//        temp.print();
//        System.out.println(temp);
//
//        int decision = 0;
//
//        System.out.println("Would you like to add another (1), remove (2), or quit the program (3)?");
//        decision = keyboard.nextInt();
//        while (decision != 3) {
//            if (decision == 1) {
//                System.out.println("Write the name followed by score");
//                String name = keyboard.next();
//                int score = keyboard.nextInt();
//                boolean checkName = temp.verifyToUpdate(name);
//                if (checkName) {
//                    temp.remove(name);
//                    temp.addToList(name, score);
//                } else {
//                    temp.addToList(name, score);
//                }
//                list = new ScoreList(temp);
//                list.print();
//            } else if (decision == 2) {
//                System.out.println("Write the name of the person you’d like to remove: ");
//                temp.remove(keyboard.next());
//                list = new ScoreList(temp);
//                list.print();
//            }
//
//
//        }
//
    }
}