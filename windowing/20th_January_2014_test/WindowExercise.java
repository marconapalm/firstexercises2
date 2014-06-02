import javax.swing.*;	// importo i widget necessari
import java.awt.*;	// importo il BorderLayout
import java.awt.event.*;	// importo ActionEvent e ActionListener

class WindowExercise{

	JFrame frame;
	JButton button;
	JLabel label;
	JTextField field;

	static double contatore = 0;	// definisco un contatore per quante volte è stato premuto il button

	public static void main (String[] args){
		WindowExercise gui = new WindowExercise();
		gui.go();
	}

	private void go(){
		frame = new JFrame();	// creo una nuova finestra
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// il programma terminerà
		// nel momento in cui viene chiusa la finestra

		button = new JButton("Click me!");	// creo il button
		button.addActionListener(new ButtonListener());	// aggiungo al registro dei
		// listener del button una nuova istanza della classe ButtonListener,
		// che implementa l'interfaccia ActionListener

		label = new JLabel();	// creo la label
		
		field = new JTextField();	// creo il campo di testo
		
		// aggiungo i componenti al frame
		frame.getContentPane().add(BorderLayout.NORTH, button);
		frame.getContentPane().add(BorderLayout.CENTER, label);
		frame.getContentPane().add(BorderLayout.SOUTH, field);
		
		frame.setSize(200, 200);	// imposto le dimensioni del frame
		frame.setVisible(true);		// rendo infine visibile il frame
		
	}

	// definisco l'inner class ButtonListener che implementa l'interfaccia ActionListener
	public class ButtonListener implements ActionListener {
		// faccio l'override del metodo ActionPerformed
		public void actionPerformed (ActionEvent e) {
			contatore++;	// ogni volta che viene premuto il contatore si incrementa
			// il valore del contatore
	
			double valore;

			try {
				// provo a prendere il valore dal campo di testo
				valore = Double.parseDouble(field.getText());
			
				// nella label compare il quoziente reale tra il valore del campo
				// e il numero di volte che è stato premuto il button
				label.setText("" + valore/contatore);

			} catch (NumberFormatException ex){	// se invece il campo di testo
								// non contiene un numero
				// allora scrivo nel campo di testo il valore 10
				field.setText("10");
			}
			
		} // fine override
	}
}
