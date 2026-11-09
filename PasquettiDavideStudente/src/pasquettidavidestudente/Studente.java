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
        
    public String toString() {
        return "nome=" + nome + ", cognome=" + cognome + ", anno=" + anno + ", indirizzo=" + indirizzo + ", sezione=" + sezione + ", nmaterie=" + nmaterie + ", votifinali=" + votifinali;
    }
    
    /**
     * Assegna l'array di voti finali allo studente
     */
    public boolean assegnaVoti(int v) {
        if(this.votifinali.length > this.nmaterie ){
            return false;
        }
        else{
            this.votifinali.length = v;
            return true;
        }
    }
    
     
            
            
            
            
            
}
