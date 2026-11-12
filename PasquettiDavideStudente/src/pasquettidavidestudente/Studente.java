/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pasquettidavidestudente;

/**
 *
 * @author pasquetti.davide
 */
public class Studente {
    
    private String nome;
    private String cognome;
    private int anno;
    private String indirizzo;
    private String sezione;
    private int nmaterie;
    private int[] votifinali;
    
    /**
     * metodo costruttore
     * @param nome
     * @param cognome
     * @param anno
     * @param indirizzo
     * @param sezione
     * @param nmaterie 
     */
    public Studente(String nome, String cognome, int anno, String indirizzo, String sezione, int nmaterie){
        this.nome = nome;
        this.cognome = cognome;
        this.anno = anno;
        this.indirizzo = indirizzo;
        this.sezione = sezione;
        this.nmaterie = nmaterie;
        this.votifinali = new int [nmaterie];
    }
    
    public String getNome (){
        return this.nome;
    }
    
    public String getCognome (){
        return this.cognome;
    }
    
    public int getAnno (){
        return this.anno;
    }
     
    public String getIndirizzo (){
        return this.indirizzo;
    }
      
    public String getSezione (){
        return this.sezione;
    }
       
    public int getNMaterie (){
        return this.nmaterie;
    }
        
    public int[] getVotiFinali() {
        return this.votifinali;
    }
        
    @Override
    public String toString() {
        return "nome=" + nome + ", cognome=" + cognome + ", anno=" + anno + ", indirizzo=" + indirizzo + ", sezione=" + sezione + ", nmaterie=" + nmaterie + ", votifinali=" + votifinali;
        
    }
    
    /**
     * questa funzione mi permette di inserire i voti
     * @param v
     * @return 
     */
    public boolean AssegnaVoti(int v){
        if (v < 1 && v > 11) return false;
        for (int i = 0; i < votifinali.length; i++){
            if(votifinali[i] == 0){
                votifinali[i] = v;
                return true;
            }
        }
        return false;
    }
    
    /**
     * Questa funzione mi permette di calcolare la mia media, se ovviamente ci sono i voti
     * @return 
     */
    public int MediaCalcolata (){
        int a = 0;
        if (votifinali.length == 0){
            return -1;
        }
        else{
            for(int i = 0; i < votifinali.length; i++){
                a =+ votifinali[i];
            }
            return (a/votifinali.length);
        }
    }
    
    /**
     * Quesat funzione mi permette di trovare il voto più alto tra tutti i voti che controllo nella lista
     * @return 
     */
    public int VotoMassimo (){
        int a = -999;
        if (votifinali.length == 0){
            return -1;
        }
        else{
            for(int i = 0; i < votifinali.length; i++){
                if (a < votifinali.length) a = votifinali[i];
            }
            return a;
        }
    }
    
    /**
     * Questa funzione mi permette di trovare il voto più basso tra tutti i voti che controllo nella lista
     * @return 
     */
    public int VotoMinimo (){
        int a = 1000;
        if (votifinali.length == 0){
            return -1;
        }
        else{
            for(int i = 0; i < votifinali.length; i++){
                if (a > votifinali.length) a = votifinali[i];
            }
            return a;
        }
    }
    
    /**
     * Questa funziome mi dice quanti voti sono insufficenti(ovvero minore di 6) sull'array
     * @return 
     */
    public int VotiInsufficenti (){
        int a = 0;
        if (votifinali.length == 0){
            return -1;
        }
        else{
            for(int i = 0; i < votifinali.length; i++){
                if (votifinali.length < 6) a++;
            }
            return a;
        }
    }
    
    /**
     * Questa funzione mi dice se la media che ho calcolata e sufficente, -1 non esiste la media, 0 sufficente, 1 insufficente
     * @return 
     */
    public int MediaSufficente (){
       if (MediaCalcolata() == -1){
           return -1;
       }
       else if (MediaCalcolata() >= 6){
           return 0;
       }
       else return 1;
    }
    
}