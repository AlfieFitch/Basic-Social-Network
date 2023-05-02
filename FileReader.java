/**
 * A class that implements a file reader and reads in a file of colleagues to create a BST.
 * @author AFitchMay
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class FileReader {

    /**
     * Reads in a file of colleagues and creates a BST of them.
     * calls on the readColleagueFile method to do this.
     * @param filePath - the path of the file to be read in
     * @return a BST of colleagues
     */
    public static BST readColleagues(String filePath){

        Scanner in = null;

        try{
            File colleagues = new File(filePath);
            in = new Scanner(colleagues);
        }catch (FileNotFoundException e){
            System.out.println("Could not find " + filePath);
            System.exit(0);
        }

        return readColleagueFile(in);
    }


    /**
     * 
     * @param line - the line of the file to be read in.
     * Creates an array of each section of the line split by ;.
     * Creates an array of each interest split by ,.
     * Creates a new colleague with the information from the line.
     * Inserts the colleague into the BST.
     * Continues until there are no more lines.
     * @return a BST of colleagues
     */
    private static BST readColleagueFile(Scanner line) {

        // Creates a new BST class.
        BST colleagueTree = new BST();

        do{
            String[] split = line.nextLine().split(";");
            String tag = split[0];
            String date = split[1];
            String interests = split[2];
            
            String[] dateArray = date.split("-");

            String[] stringArray = interests.split(",");

            ArrayList<String> interestArray = new ArrayList<>();

            for (String element : stringArray) {
                interestArray.add(element);
            }

            Colleague newColleague = new Colleague(tag, Integer.parseInt(dateArray[0]), Integer.parseInt(dateArray[1]), Integer.parseInt(dateArray[2]), interestArray);
            colleagueTree.insertColleague(newColleague);

        }while(line.hasNextLine());

        return colleagueTree;
    }

}
