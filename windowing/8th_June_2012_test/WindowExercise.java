/*
* Si definisca una applicazione grafica costituita da una finestra che contiene (in questo
* ordine): tre campi di testo (il primo dei quali è destinato a contenere numeri interi) ed un
* bottone. Cliccando sul bottone deve avvenire:
* nel terzo campo di testo compare il più grande fra il valore contenuto nel primo campo di
* testo e la lunghezza della stringa contenuta nel secondo campo di testo .
* se il primo campo di testo non contiene un numero, nel terzo campo di testo deve
* comparire 0.
*
* Developed by Marco Rapaccini on 01/06/2014
*
*/
 
import javax.swing.*;	// importo il package con widget come JFrame, JPanel, etc.
 
import java.awt.event.*;	// importo il package contenente ActionListener e ActionEvent
 
import java.awt.*;	// importo classi come BorderLayout e BoxLayout
 
 
 
public class WindowExercise {
 
	JFrame frame;
	JTextField one;
	JTextField two;
	JTextField three;
	JButton button;
	
	public static void main (String[] args) {
		WindowExercise gui = new WindowExercise();
		gui.go();
	}
 
	private void go(){
		frame = new JFrame();	// creo un nuovo frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // faccio in modo che il programma si chiuda quando si chiude la
		// finestra
		
		JPanel panel = new JPanel();	// creo un nuovo pannello
 
		one = new JTextField(30);	// creo il primo campo di testo
		two = new JTextField(30);	// creo il secondo campo di testo
		three = new JTextField(30);	// creo il terzo campo di testo
 
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		// imposto il layout del pannello, in modo che gli elementi
		// siano disposti in verticale
 
		panel.add(one);		// aggiungo i tre campi di testo
		panel.add(two);		// al pannello
		panel.add(three);
 
		button = new JButton("Click me!");	// creo il button
 
		button.addActionListener(new ButtonListener());
		// passo al registro dei listener di button una nuova istanza
		// dell'inner class ButtonListener, che implementa l'interfaccia
		// ActionListener
 
		frame.getContentPane().add(BorderLayout.CENTER, panel);
		// posiziono il pannello con i 3 campi di testo al centro
		// del frame
 
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		// posiziono il bottone nella parte inferiore del frame
	
		frame.setSize(200,200);	// imposto le dimensioni del frame
		frame.setVisible(true);	// rendo finalmente visibile il frame
	}
 
 
	public class ButtonListener implements ActionListener {
		
		// override del metodo actionPerformed
		public void actionPerformed (ActionEvent e){
 
			int first = 0;	// creo una variabile intera e la
			// inizializzo a 0
 
			int string_length = two.getText().length();
			// ottengo la lunghezza della stringa del secondo campo
 
			try {	// provo a convertire 
				first = Integer.parseInt(one.getText());
				
				// se il numero del primo campo è maggiore
				// della lunghezza della stringa del secondo campo
 
				if (first > string_length) {
					// allora visualizzo il contenuto del
					// primo campo
					three.setText("" + first);
				}
				else {
					// altrimenti visualizzo la lunghezza della stringa
					// del secondo campo
					three.setText("" + string_length);
				}
	
			} catch (NumberFormatException ex){
			// se riesco a catturare l'eccezione, allora dovrò
			// mettere 0 nel terzo campo di testo
				three.setText("0");
			}
		} // fine override
	} // fine inner class
} // fine outer class
