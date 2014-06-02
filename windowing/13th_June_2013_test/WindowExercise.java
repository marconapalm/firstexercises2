/* Si definisca una applicazione grafica costituita da una finestra che contiene (in questo ordine): un
 * bottone ed una canvas (o un pannello) . Cliccando sul bottone deve avvenire:
 * se dall’avvio dell’applicazione il bottone è stato premuto un numero di volte che è divisibile per 3
 * la canvas (o il pannello) si colora di rosso, altrimenti si colora di verde.
 *
 * Developed by Marco Rapaccini on 02/06/2014
 *
*/

import javax.swing.*;	// importo il package contenente JFrame, JButton e JPanel
import java.awt.*;	// importo il package contenente BorderLayout
import java.awt.event.*;	// importo il package contenente ActionListener e ActionEvent

public class WindowExercise {
	JFrame frame;
	JButton button;
	JPanel panel;

	int contatore = 0;	// definisco un contatore per quante volte è stato premuto il button
	
	public static void main (String[] args){
		WindowExercise gui = new WindowExercise();
		gui.go();
	}

	private void go() {
		frame = new JFrame("Divisibile per 3");	// creo il frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// faccio in modo che il programma termini quando viene chiusa la finestra
		
		button = new JButton("Click me!");	// creo il button
		button.addActionListener(new ButtonListener());
		// aggiungo al registro dei listener di button una nuova istanza della classe
		// ButtonListener, che implementa l'interfaccia ActionListener
					
		panel = new JPanel();	// creo il nuovo pannello
		
		// aggiungo il button nella parte superiore del frame
		frame.getContentPane().add(BorderLayout.NORTH, button);
		// aggiungo il pannello nella parte centrale del frame
		frame.getContentPane().add(BorderLayout.CENTER, panel);
		
		frame.setSize(300,300);	// imposto le dimensioni del frame
		frame.setVisible(true);	// rendo infine visibile il frame	
	}
	
	// definisco la classe ButtonListener, che implementa l'interfaccia ActionListener
	public class ButtonListener implements ActionListener {
		// faccio l'override del metodo actionPerformed
		public void actionPerformed (ActionEvent ev){
			// ogni volta che viene premuto il button
			contatore++;	// il contatore s'incrementa
			
			// se il numero di volte in cui è stato premuto il button
			if (contatore%3==0) {	// è divisibile per 3
				// allora il pannello si colora di rosso
				panel.setBackground(Color.RED);
			}
			else {
				panel.setBackground(Color.GREEN);
			}
		}
	}
}
