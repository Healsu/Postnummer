import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class convert {

    private static String fileName = "src/postnumre.txt";
    static ArrayList<Postnumre> PostArray = new ArrayList<>();

    public static ArrayList<Postnumre> convertReadFile(){
        try {
            File file = new File(fileName);
            Scanner sc = new Scanner(file);
            sc.nextLine();
            while (sc.hasNext()){
                String line = sc.nextLine();
                String[] post = line.split(";");
                int postnumre = parseInt(post[0]);
                String postAdressen = post[1];

                Postnumre postNum = new Postnumre(postnumre,postAdressen);
                PostArray.add(postNum);
            }


        }
        catch (Exception e){
            System.out.println("Cant find file");
        }
        return PostArray;
    }
}
