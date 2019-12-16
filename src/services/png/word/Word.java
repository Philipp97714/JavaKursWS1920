package services.png.word;

import java.util.ArrayList;
import java.util.Scanner;

public class Word {
    public static void main(String[] args){
        ArrayList<String> eingabe=new ArrayList<String>();
        Scanner scanner=new Scanner(System.in);
        do{
            eingabe.add(scanner.nextLine());
        }while(!eingabe.get(eingabe.size()-1).equalsIgnoreCase("exit"));
        eingabe.remove(eingabe.size()-1);
        eingabe.sort(String::compareTo);
        for (String s:eingabe) System.out.println(s);



    }
}
