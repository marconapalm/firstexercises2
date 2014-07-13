/*
* Simple tic tac toe game against the computer.
* There's no AI, so I have to improve my program.
*
*/

//import java.applet.AudioClip;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Marco_Rapaccini
 */
public class Tris {
    JFrame frame;
    JButton[] buttons = new JButton[9];
       
    boolean[] occupato = new boolean[9];
  
    boolean[] occupato_g1 = new boolean[9]; // valori per determinare il
                                            // vincitore g1 (utente)
    
    boolean[] occupato_g2 = new boolean[9]; // valori per determinare il
                                            // vincitore g2 (computer)
    boolean turno_g1 = true;
    
    int contatore = 0;
    
    public static void main(String[] args) {
        Tris gui = new Tris();
        gui.go();       
    }
    
    private void go(){
        frame = new JFrame("Tris");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        buttons[0] = new JButton("");
        buttons[0].addActionListener(new ButtonListenerB1());
        buttons[0].setFont(new Font(null,Font.BOLD,50));
        
        buttons[1] = new JButton("");
        buttons[1].addActionListener(new ButtonListenerB2());
        buttons[1].setFont(new Font(null,Font.BOLD,50));
        
        buttons[2] = new JButton("");
        buttons[2].addActionListener(new ButtonListenerB3());
        buttons[2].setFont(new Font(null,Font.BOLD,50));
        
        buttons[3] = new JButton("");
        buttons[3].addActionListener(new ButtonListenerB4());
        buttons[3].setFont(new Font(null,Font.BOLD,50));
 
        buttons[4] = new JButton("");
        buttons[4].addActionListener(new ButtonListenerB5());
        buttons[4].setFont(new Font(null,Font.BOLD,50));
        
        buttons[5] = new JButton("");
        buttons[5].addActionListener(new ButtonListenerB6());
        buttons[5].setFont(new Font(null,Font.BOLD,50));
        
        buttons[6] = new JButton("");
        buttons[6].addActionListener(new ButtonListenerB7());
        buttons[6].setFont(new Font(null,Font.BOLD,50));

        buttons[7] = new JButton("");
        buttons[7].addActionListener(new ButtonListenerB8());
        buttons[7].setFont(new Font(null,Font.BOLD,50));

        buttons[8] = new JButton("");
        buttons[8].addActionListener(new ButtonListenerB9());
        buttons[8].setFont(new Font(null,Font.BOLD,50));
        
        frame.setLayout(new GridLayout(3,3));
        frame.getContentPane().add(buttons[0]);
        frame.getContentPane().add(buttons[1]);
        frame.getContentPane().add(buttons[2]);
        frame.getContentPane().add(buttons[3]);
        frame.getContentPane().add(buttons[4]);
        frame.getContentPane().add(buttons[5]);
        frame.getContentPane().add(buttons[6]);
        frame.getContentPane().add(buttons[7]);
        frame.getContentPane().add(buttons[8]);
        
        frame.setBounds(500,200,300,300);
        frame.setVisible(true);
    }
    
    private class ButtonListenerB1 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ev){
            if (occupato[0] == true){
                JOptionPane.showMessageDialog(null, "Casella già selezionata");
                
            }
            else if (turno_g1){
                    buttons[0].setText("X");
                    occupato[0] = true;
                    occupato_g1[0]=true;
                    verifica();
                    turno_g1 = avversario();
            }       
        }
    }
    
    private class ButtonListenerB2 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ev){
            if (occupato[1] == true){
                JOptionPane.showMessageDialog(null, "Casella già selezionata");
            }
            else if (turno_g1){
                buttons[1].setText("X");
                occupato[1] = true;
                occupato_g1[1]=true;
                verifica();
                turno_g1 = avversario();
            }
        }
    }
    
    private class ButtonListenerB3 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ev){
            if (occupato[2] == true){
                JOptionPane.showMessageDialog(null, "Casella già selezionata");
            }
            else if (turno_g1){
                buttons[2].setText("X");
                occupato[2] = true;
                occupato_g1[2]=true;
                verifica();
                turno_g1 = avversario();
            }
            
        }
    }
    
    private class ButtonListenerB4 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ev){
            if (occupato[3] == true){
                JOptionPane.showMessageDialog(null, "Casella già selezionata");
            }
            else if (turno_g1){
                buttons[3].setText("X");
                occupato[3] = true;
                occupato_g1[3]=true;
                verifica();
                turno_g1 = avversario();
            }
        }
    }
    
    private class ButtonListenerB5 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ev){
            if (occupato[4] == true){
                JOptionPane.showMessageDialog(null, "Casella già selezionata");
            }
            else if (turno_g1){
                buttons[4].setText("X");
                occupato[4] = true;
                occupato_g1[4]=true;
                verifica();
                turno_g1 = avversario();
            }
        }
    }
    
    private class ButtonListenerB6 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ev){
            if (occupato[5] == true){
                JOptionPane.showMessageDialog(null, "Casella già selezionata");
            }
            else if (turno_g1){
                buttons[5].setText("X");
                occupato[5] = true;
                occupato_g1[5]=true;
                verifica();
                turno_g1 = avversario();
            }
        }
    }
    
    private class ButtonListenerB7 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ev){
            if (occupato[6] == true){
                JOptionPane.showMessageDialog(null, "Casella già selezionata");
            }
            else if (turno_g1){
                buttons[6].setText("X");
                occupato[6] = true;
                occupato_g1[6]=true;
                verifica();
                turno_g1 = avversario();
            }
        }
    }
    
    private class ButtonListenerB8 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ev){
            if (occupato[7] == true){
                JOptionPane.showMessageDialog(null, "Casella già selezionata");
            }
            else if (turno_g1){
                buttons[7].setText("X");
                occupato[7] = true;
                occupato_g1[7]=true;
                verifica();
                turno_g1 = avversario();
            }
        }    
    }
    
    private class ButtonListenerB9 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ev){
            if (occupato[8] == true){
                JOptionPane.showMessageDialog(null, "Casella già selezionata");
            }
            else if (turno_g1){
                buttons[8].setText("X");
                occupato[8] = true;
                occupato_g1[8] = true;
                verifica();
                turno_g1 = avversario();
            }
        }
    }
    
    private boolean avversario(){
        turno_g1=false;
        int num = (int)(Math.random()*9);
            boolean risultato = false;
            while(risultato==false){
                if (occupato[num]==false){
                    occupato[num]=true;
                    occupato_g2[num]=true;
                    buttons[num].setText("O");
                    verifica();
                    risultato = true;
                    break;
                }
                else{
                    if(num==8){
                        num=-1;
                    }
                    num++;
                    continue;
                }
            }
            
            return risultato;    
    }
    
    private void verifica(){
        if (turno_g1){
            if ((occupato_g1[0])&&(occupato_g1[1])&&(occupato_g1[2])){
                utente_vincita();
            }
            if ((occupato_g1[3])&&(occupato_g1[4])&&(occupato_g1[5])){
                utente_vincita();
            }
            if ((occupato_g1[6])&&(occupato_g1[7])&&(occupato_g1[8])){
                utente_vincita();
            }
            if ((occupato_g1[0])&&(occupato_g1[3])&&(occupato_g1[6])){
                utente_vincita();
            }
            if ((occupato_g1[1])&&(occupato_g1[4])&&(occupato_g1[7])){
                utente_vincita();
            }
            if ((occupato_g1[2])&&(occupato_g1[5])&&(occupato_g1[8])){
                utente_vincita();
            }
            if ((occupato_g1[0])&&(occupato_g1[4])&&(occupato_g1[8])){
                utente_vincita();
            }
            if ((occupato_g1[2])&&(occupato_g1[4])&&(occupato_g1[6])){
                utente_vincita();
            }
        }
        else{
            if ((occupato_g2[0])&&(occupato_g2[1])&&(occupato_g2[2])){
                utente_vincita();
            }
            if ((occupato_g2[3])&&(occupato_g2[4])&&(occupato_g2[5])){
                utente_vincita();
            }
            if ((occupato_g2[6])&&(occupato_g2[7])&&(occupato_g2[8])){
                utente_vincita();
            }
            if ((occupato_g2[0])&&(occupato_g2[3])&&(occupato_g2[6])){
                utente_vincita();
            }
            if ((occupato_g2[1])&&(occupato_g2[4])&&(occupato_g2[7])){
                utente_vincita();
            }
            if ((occupato_g2[2])&&(occupato_g2[5])&&(occupato_g2[8])){
                utente_vincita();
            }
            if ((occupato_g2[0])&&(occupato_g2[4])&&(occupato_g2[8])){
                utente_vincita();
            }
            if ((occupato_g2[2])&&(occupato_g2[4])&&(occupato_g2[6])){
                utente_vincita();
            }
        }
    }
    
    private void utente_vincita(){
        
        if (turno_g1){
            JOptionPane.showMessageDialog(null, "L'utente vince");     
        }else{
            JOptionPane.showMessageDialog(null, "Il computer vince");
        }
        frame.dispose();
        System.exit(0);
    }
}
