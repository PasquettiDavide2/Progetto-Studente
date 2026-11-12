
package pasquettidavidestudente;
import java.util.*;
public class TestStudente {
    
    public void Avvia (){
        Scanner s= new Scanner(System.in);
        System.out.println("Inserisci nome: ");
        String nome=s.nextLine();
        System.out.println("Inserisci cognome: ");
        String cognome=s.nextLine();
        System.out.println("Inserisci anno: ");
        int anno=s.nextInt();
        s.nextLine();
        System.out.println("Inserisci indirizzo: ");
        String indirizzo=s.nextLine();
        System.out.println("Inserisci sezione: ");
        String sezione=s.nextLine();
        System.out.println("Inserisci il numero delle materie: ");
        int nmaterie=s.nextInt();
        System.out.println("Inserisci i voti delle materie: ");
        int votifinali=s.nextInt();
        
        Studente p = new Studente(nome,cognome,anno,indirizzo,sezione,nmaterie);
        System.out.println(p.toString());
        System.out.println(p.toString());
        System.out.println(p.toString());
        System.out.println(p.toString());
        System.out.println(p.toString());
    }
    
}
