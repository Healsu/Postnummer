import java.util.ArrayList;
import java.util.Scanner;

public class main {
    static ArrayList<Postnumre> list = convert.convertReadFile();
    public static void main(String[] args) {

        System.out.println(checkPost());
    }

    public static String checkPost(){
        String navn = "Kunne ikke finde byen";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv post nummer ind");
        int userInput = scanner.nextInt();
        for (Postnumre p : list){
            if(userInput == p.getNumber()){
               navn = p.getAdresse();
            }
        }

        return navn;
        }
    }

