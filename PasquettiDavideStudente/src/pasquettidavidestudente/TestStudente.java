
package pasquettidavidestudente;
import java.util.*;
public class TestStudente {
    
    public void Avvia (){
        //primo studente
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
        
        Studente p = new Studente(nome,cognome,anno,indirizzo,sezione,nmaterie);
        
        for (int i = 0; i < nmaterie; i++) {
            System.out.print("Inserisci il voto per la materia " + (i + 1) + " (1-10): ");
            int voto = s.nextInt();
            // Se il voto non è valido (fuori dal range 1-10), lo richiede
            while (!p.AssegnaVoti(voto)) {
                System.out.print("Voto non valido! Inserisci un voto tra 1 e 10: ");
                voto = s.nextInt();
            }
        }
        s.nextLine(); 
        
        //secondo studente
        System.out.println("Inserisci nome: ");
        String nome2 = s.nextLine();
        System.out.println("Inserisci cognome: ");
        String cognome2 = s.nextLine();
        System.out.println("Inserisci anno: ");
        int anno2 = s.nextInt();
        s.nextLine();
        System.out.println("Inserisci indirizzo: ");
        String indirizzo2 = s.nextLine();
        System.out.println("Inserisci sezione: ");
        String sezione2 = s.nextLine();
        System.out.println("Inserisci il numero delle materie: ");
        int nmaterie2 = s.nextInt();
        
        Studente p2 = new Studente(nome2, cognome2, anno2, indirizzo2, sezione2, nmaterie2);
        
        for (int i = 0; i < nmaterie2; i++) {
            System.out.print("Inserisci il voto per la materia " + (i + 1) + " (1-10): ");
            int voto = s.nextInt();
            // Attenzione: qui va usato p2, non p!
            while (!p2.AssegnaVoti(voto)) {
                System.out.print("Voto non valido! Inserisci un voto tra 1 e 10: ");
                voto = s.nextInt();
            }
        }
        s.nextLine();
        
        //stampa di primo studente
        System.out.println("studente 1:" + p.toString());
        System.out.println("La media calcolata dello studente e: " + p.MediaCalcolata());
        System.out.println("La media dello studente e(0 suff, 2 insuff, -1 prob): " + p.MediaSufficente());
        System.out.println("Lo studente ha : " + p.VotiInsufficenti() + "voti insufficenti");
        System.out.println("Il voto massimo dello studente e: " + p.VotoMassimo());
        System.out.println("Il voto minimo dello studente e: " + p.VotoMinimo());
        System.out.println("Lo studente ha: " + p.VotiInsufficenti() + "insufficenti");
        
        //stampa del secondo studente
        System.out.println("studente 2: " + p2.toString());
        System.out.println("La media calcolata dello studente e: " + p2.MediaCalcolata());
        System.out.println("La media dello studente e (0 suff, 1 insuff, -1 prob): " + p2.MediaSufficente());
        System.out.println("Lo studente ha: " + p2.VotiInsufficenti() + " voti insufficienti");
        System.out.println("Il voto massimo dello studente e: " + p2.VotoMassimo());
        System.out.println("Il voto minimo dello studente e: " + p2.VotoMinimo());
        
        System.out.println("confronto dei 2 studenti");
        if (p.MediaCalcolata() > p2.MediaCalcolata()) {
            System.out.println(p.getNome() + " ha la media più alta!");
        } else if (p2.MediaCalcolata() > p.MediaCalcolata()) {
            System.out.println(p2.getNome() + " ha la media più alta!");
        } else {
            System.out.println("I due studenti hanno la stessa media!");
        }
    }
    
}
