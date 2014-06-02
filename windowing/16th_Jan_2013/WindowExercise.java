/* Si definisca una applicazione grafica costituita da una finestra che contiene (in questo
 * ordine): due campi di testo (destinati a contenere numeri interi) una label ed un bottone.
 * Cliccando sul bottone deve avvenire:
 * nella label compare la media dei valori contenuti nei due campi di testo.
 * se i campi di testo non contengono un numero, nella label deve comparire 0.
 
 * I used only the java.awt package. I didn't use Swing.
*/


import java.awt.*;  // importo i componenti di cui ho bisogno
import java.awt.event.*;    // importo ActionListener e ActionEvent

/**
 *
 * @author Marco_Rapaccini
 */
public class WindowExercise {
    
    TextField field1;
    TextField field2;
    Label label;
    
    public static void main (String[] args){
        WindowExercise gui = new WindowExercise();
        gui.go();
    }
    
    private void go(){
        Frame frame = new Frame();  // creo un nuovo frame
        frame.addWindowListener(new WindowAdapter(){    // faccio in modo che sia
               // possibile chiudere il frame
            @Override
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
        
        field1 = new TextField(); // creo un nuovo campo di testo
 
        field2 = new TextField(); // creo un altro campo di testo
      
        label = new Label();          // creo una label

        Button button = new Button("Click me!");       // creo un button
        button.addActionListener(new ButtonListener());
  
        Panel panel = new Panel();
        panel.setLayout(new BorderLayout());
        panel.add(BorderLayout.NORTH,field1);
        panel.add(BorderLayout.CENTER,field2);
        panel.add(BorderLayout.SOUTH, label);
        
        frame.add(BorderLayout.NORTH,panel);
        frame.add(BorderLayout.SOUTH, button);
        
        frame.setSize(200, 200);
        frame.setVisible(true);
        
    }
    
    // definisco la classe ButtonListener che implementa l'interfaccia ActionListener
    public class ButtonListener implements ActionListener{
        // override del metodo ActionPerformed
        @Override
        public void actionPerformed(ActionEvent ev){
            try{
                int valore1 = Integer.parseInt(field1.getText());
                int valore2 = Integer.parseInt(field2.getText());
                double media = ((double)(valore1+valore2)/2);
                label.setText("" + media);
            }catch(NumberFormatException ex){
                label.setText("0");
            }
        }
    }
           
} // fine outer class
