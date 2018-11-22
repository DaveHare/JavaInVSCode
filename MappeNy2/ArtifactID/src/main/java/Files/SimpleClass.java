package Files;
import java.util.ArrayList;

public class SimpleClass{

    public static void main(String[] args) {
        
    }

    public static void enMetode(){
        String littTekst = "Dette er en simpel test";
        String littMerTekst = "Stay serious"; 
        ArrayList<String> enListe = new ArrayList<>();
        
        enListe.add(littTekst); 
        enListe.add(littMerTekst);

        System.out.println(enListe);

    }
}