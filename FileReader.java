import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class FileReader {

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

    private static BST readColleagueFile(Scanner line) {

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
