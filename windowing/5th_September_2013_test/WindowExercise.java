/*
* Si definisca una applicazione grafica costituita da una finestra che contiene (in questo ordine): un
* bottone, una canvas (o un pannello) ed un campo di testo destinato a contenere valori numerici.
* Cliccando sul bottone deve avvenire:
* se dall’avvio dell’applicazione il bottone è stato premuto un numero di volte maggiore del valore
* contenuto nel campo di testo, la canvas (o il pannello) si colora di rosso, altrimenti si colora di
* verde.
* Nel caso in cui il campo di testo non contenga un numero intero, si colori la canvas (o il pannello)
* di giallo e si scriva nel campo di testo il valore 3.
*
* Developed by Marco Rapaccini on 01/06/2014
*
*/
 
import javax.swing.*;	// importo il package contenente tutti i componenti come JFrame, JPanel, JButton e JTextField
import java.awt.*;	// importo il package contenente classi come BorderLayout
import java.awt.event.*;	// importo il package contenente ActionListener e ActionEvent
 
public class WindowExercise {
	
	static int button_pressed = 0;	// contatore destinato a contenere quante volte il pulsante button è stato premuto
	
	JFrame frame;	// definisco un frame
	JButton button;	// definisco un button
	JPanel panel;	// definisco un pannello
	JTextField text_field;	// definisco un campo di testo
	
	
 
	public static void main (String[] args) {
		WindowExercise gui = new WindowExercise();
		gui.go();
		
	}
	
	private void go(){
		frame = new JFrame();	// creo un nuovo frame (finestra)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// faccio in modo che il programma termini
		// nel momento in cui venga premuta la "x" di chiusura della finestra
		
		button = new JButton("Click me!");	// creo un nuovo button
		
		button.addActionListener(new ButtonListener());	// aggiungo al registro dei listener del button una nuova
		// istanza dell'inner class ButtonListener (che implementa l'interfaccia ActionListener)
		
		panel = new JPanel();	// creo un nuovo pannello
		
		text_field = new JTextField();	// creo un nuovo campo di testo
		
		frame.getContentPane().add(BorderLayout.NORTH, button);	// aggiungo il button nella parte superiore del frame
		
		frame.getContentPane().add(BorderLayout.CENTER, panel);	// aggiungo il pannello nella parte centrale del frame
		
		frame.getContentPane().add(BorderLayout.SOUTH, text_field);	// aggiungo il campo nel basso del frame
		
		frame.setSize(200,200);	// imposto le dimensioni del frame
		
		frame.setVisible(true);	// rendo finalmente visibile il frame
	}
	
	public class ButtonListener implements ActionListener {	//la classe ButtonListener implementa l'interfaccia ActionListener
		
		// override del metodo ActionPerformed
		public void actionPerformed(ActionEvent e){
			button_pressed++;	// ogni volta che premo il button si incrementa il valore del contatore
			
			try{	
				int value = Integer.parseInt(text_field.getText());	// provo a prendere il valore numerico
				// del campo di testo
				
				if (button_pressed > value){	// se il button è stato premuto più volte del valore del
				// campo di testo il pannello si colora di rosso
					panel.setBackground(Color.RED);
				}
				else{	// altrimenti si colora di verde
					panel.setBackground(Color.GREEN);
				}
				
			}catch(NumberFormatException ex){	// nel caso in cui non ci sia un numero intero
				// coloriamo il pannello di giallo
				panel.setBackground(Color.YELLOW);
				// e scriviam nel campo di testo il valore 3
				text_field.setText("3");
			}
		}
	}
	
}
