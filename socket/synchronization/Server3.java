package server3;

import java.net.*;
import java.io.*;
/**
 *
 * @author Marco_Rapaccini
 */
public class Server3 {
    ServerSocket server;    // definisco un ServerSocket
    Socket client;          // definisco un Socket per il client
    Accumulatore a;
    
    public static void main(String[] args) {
        Server3 s = new Server3();  // creo una nuova istanza di Server3
        s.setUpNetworking();        // richiamo il metodo setUpNetworking
    }
    
    public void setUpNetworking(){  // definisco il metodo setUpNetworking
        try{
            // il server si mette in ascolto alla porta TCP numero 4000
            server = new ServerSocket(4000);
            a = new Accumulatore();
            // entra in un loop infinito per ascoltare le richieste dei client
            while(true){
                // quando il server accetta una richiesta di connessione,
                // il metodo accept() restituisce un Socket per dialogare col
                // client
                client = server.accept();
                
                // creo una nuova istanza della classe ThreadServer3, passando
                // come argomento al costruttore il Socket per dialogare col client
                ThreadServer3 t = new ThreadServer3(client,a);
                
                // avviamo il thread
                t.start();
                
            }
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    
}
