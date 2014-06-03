package server3;

/**
 *
 * @author Marco_Rapaccini
 */
public class Accumulatore {
    private int somma = 0;
    private int contatore = 0;
    
    // definisco il metodo che accede alle variabili somma e contatore
    // in modo sincronizzato
    synchronized public void incrementa(int somma, int contatore){
        this.somma = somma;
        this.contatore = contatore;
    }
    
    public int getSomma(){
        return somma;
    }
    
    public double getMedia(){
        if (contatore==0){
            return 0;
        }
        else{
            return (double) somma/contatore;
        }
    }
}
