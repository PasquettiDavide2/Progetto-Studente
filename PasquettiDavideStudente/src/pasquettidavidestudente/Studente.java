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
    
    
    
    
            
            
            
            
            
}
