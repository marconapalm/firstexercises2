/*
 * Compito programmazione del 27 Settembre 2012
 *
 * Si definisca una applicazione client server basata su socket. Il server deve poter rispondere
 * contemporaneamente a più client.
 * Il client genera casualmente un intero N. Il client invia poi al server N valori numerici interi
 * non negativi generati casualmente. La fine della sequenza viene segnalata inviando il valore
 * numerico -1.
 * Ogni volta che un client termina la trasmissione, il server scrive a video la somma e la
 * media di tutti i valori ricevuti finora da tutti i client. I -1 non vanno né sommati né
 * conteggiati.
 * Se necessario, si gestiscano le problematiche di sincronizzazione.
 */

package client3;

import java.net.*;
import java.io.*;

/**
 *
 * @author Marco_Rapaccini
 */
public class Client3 {
    Socket client;
    DataOutputStream stream;
    
    public static void main(String[] args) {
        Client3 c = new Client3();
        c.setUp();
        c.invia();
        c.chiudiConnessione();
    }
    
    public void setUp(){    // definisco il metodo che inizializza la connessione
        try{
            // creo un nuovo Socket
            client = new Socket("localhost", 4000);
            // creo un nuovo flusso di dati in uscita
            stream = new DataOutputStream(client.getOutputStream());
            
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    
    public void invia(){
        // client genera casualmente un numero
        int N = (int)(Math.random()*20);
        
        try{
            // itera per N volte
            for (int i = 0; i<N; i++){
                // ad ogni iterazione viene creato un numero casuale
                int numero_casuale = (int)(Math.random()*15);
                // il quale viene poi scritto nello stream
                stream.writeInt(numero_casuale);
                
                // stampiamo a schermo il numero che stiamo per inviare
                System.out.println("Sto per inviare: " + numero_casuale);
                
                // e inviato immediatamente al Server
                stream.flush();
                
            }
            // alla fine del ciclo scrivo il valore -1 che segnala la fine della sequenza
            stream.writeInt(-1);
            // e lo invio
            stream.flush();
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    
    public void chiudiConnessione(){    // definisco il metodo che chiude la connessione
        try{
            stream.close(); // chiudo il flusso
            client.close(); // chiudo il client
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    
}
