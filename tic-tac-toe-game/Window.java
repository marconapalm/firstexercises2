/*
 * Game window.
 * I used 9 buttons to represents the 9 boxes of a tic-tac-toe sketch.
 */

package tris;

import javax.swing.*;       // needed imports
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Marco_Rapaccini
 */
public class Window {
    JFrame frame;   // declares the JFrame I'll use
    JButton[] buttons = new JButton[9]; // creates an array of JButtons
       
    boolean[] selected = new boolean[9];    // checks if a box is selected
  
    boolean[] selected_g1 = new boolean[9]; /* values needed to check if
                                               g1 (the user) is the winner */
    
    boolean[] selected_g2 = new boolean[9]; /* values needed to check if
                                               g2 (the computer) is the winner */
    boolean turn_g1 = true;                 // boolean used to decide the turn               
    
    boolean winner_called = false;          /* boolean used to check if
                                               winner() method is called */
    int counter = 0;                        // counts selected boxes

    public void go(){
        create_window();
    }
    
    private void create_window(){           // creats the window
        frame = new JFrame("Tic-tac-toe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        buttons[0] = new JButton("");
        buttons[0].addActionListener(new ButtonListenerB0());
        buttons[0].setFont(new Font(null,Font.BOLD,50));
        
        buttons[1] = new JButton("");
        buttons[1].addActionListener(new ButtonListenerB1());
        buttons[1].setFont(new Font(null,Font.BOLD,50));
        
        buttons[2] = new JButton("");
        buttons[2].addActionListener(new ButtonListenerB2());
        buttons[2].setFont(new Font(null,Font.BOLD,50));
        
        buttons[3] = new JButton("");
        buttons[3].addActionListener(new ButtonListenerB3());
        buttons[3].setFont(new Font(null,Font.BOLD,50));
 
        buttons[4] = new JButton("");
        buttons[4].addActionListener(new ButtonListenerB4());
        buttons[4].setFont(new Font(null,Font.BOLD,50));
        
        buttons[5] = new JButton("");
        buttons[5].addActionListener(new ButtonListenerB5());
        buttons[5].setFont(new Font(null,Font.BOLD,50));
        
        buttons[6] = new JButton("");
        buttons[6].addActionListener(new ButtonListenerB6());
        buttons[6].setFont(new Font(null,Font.BOLD,50));

        buttons[7] = new JButton("");
        buttons[7].addActionListener(new ButtonListenerB7());
        buttons[7].setFont(new Font(null,Font.BOLD,50));

        buttons[8] = new JButton("");
        buttons[8].addActionListener(new ButtonListenerB8());
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
    
    /* The first box waits for a click */
    private class ButtonListenerB0 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ev){
            counter++;
            if (turn_g1){
                    buttons[0].setText("X");
                    selected[0] = true;
                    selected_g1[0]=true;
                    check_winner();
                    turn_g1 = enemy();
            }
            buttons[0].setEnabled(false);   
        }
    }
    
    /* The second box waits for a click */
    private class ButtonListenerB1 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ev){
            counter++;
            if (turn_g1){
                buttons[1].setText("X");
                selected[1] = true;
                selected_g1[1]=true;
                check_winner();
                turn_g1 = enemy();
            }
            buttons[1].setEnabled(false);   
        }
    }
    
    /* The third box waits for a click */
    private class ButtonListenerB2 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ev){
            counter++;
            if (turn_g1){
                buttons[2].setText("X");
                selected[2] = true;
                selected_g1[2]=true;
                check_winner();
                turn_g1 = enemy();
            }
            buttons[2].setEnabled(false);
        }
    }
    
    /* The fourth box waits for a click */
    private class ButtonListenerB3 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ev){
            counter++;
            if(turn_g1){
                buttons[3].setText("X");
                selected[3] = true;
                selected_g1[3]=true;
                check_winner();
                turn_g1 = enemy();
            }
            buttons[3].setEnabled(false);
        }
    }
    
    /* The fifth box waits for a click */
    private class ButtonListenerB4 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ev){
            counter++;
            if (turn_g1){
                buttons[4].setText("X");
                selected[4] = true;
                selected_g1[4]=true;
                check_winner();
                turn_g1 = enemy();
            }
            buttons[4].setEnabled(false);
        }
    }
    
    /* The sixth box waits for a click */
    private class ButtonListenerB5 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ev){
            counter++;
            if (turn_g1){
                buttons[5].setText("X");
                selected[5] = true;
                selected_g1[5]=true;
                check_winner();
                turn_g1 = enemy();
            }
            buttons[5].setEnabled(false);
        }
    }
    
    /* The seventh box waits for a click */
    private class ButtonListenerB6 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ev){
            counter++;
            if (turn_g1){
                buttons[6].setText("X");
                selected[6] = true;
                selected_g1[6]=true;
                check_winner();
                turn_g1 = enemy();
            }
            buttons[6].setEnabled(false);
        }
    }
    
    /* The heighth box waits for a click */
    private class ButtonListenerB7 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ev){
            counter++;
            if (turn_g1){
                buttons[7].setText("X");
                selected[7] = true;
                selected_g1[7]=true;
                check_winner();
                turn_g1 = enemy();
            }
            buttons[7].setEnabled(false);
        }    
    }
    
    /* The ninth box waits for a click */
    private class ButtonListenerB8 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ev){
            counter++;
            if (turn_g1){
                buttons[8].setText("X");
                selected[8] = true;
                selected_g1[8] = true;
                check_winner();
                turn_g1 = enemy();
            }
            buttons[8].setEnabled(false);
        }
    }
    
    /* Computer's choice */
    private boolean enemy(){
        turn_g1=false;  // now it's the computer's turn
        int num = (int)(Math.random()*9);   // chooses a random number (0 - 8)
        while(true){
            if (selected[num]==false){      // if there is a free box
                counter++;                  
                selected[num]=true;         // the box is occupeid
                selected_g2[num]=true;      
                buttons[num].setText("O");
                buttons[num].setEnabled(false);
                check_winner();             // always check
                return true;
             }
             else{                          // if there's no free box
                if(num==8){                 // if we are at the last box                         
                    num=-1;                 // let's go to the first      
                }
                num++;                      // go to the next box
                }
             }        
    }
    
    /* Checks if there is a winner */
    private void check_winner(){
        if (counter<=9){
            if (turn_g1){                   /* if it's user's turn
                                               check different combinations */
                if ((selected_g1[0])&&(selected_g1[1])&&(selected_g1[2])){
                    winner();
                }
                if ((selected_g1[3])&&(selected_g1[4])&&(selected_g1[5])){
                    winner();
                }
                if ((selected_g1[6])&&(selected_g1[7])&&(selected_g1[8])){
                    winner();
                }
                if ((selected_g1[0])&&(selected_g1[3])&&(selected_g1[6])){
                    winner();
                }
                if ((selected_g1[1])&&(selected_g1[4])&&(selected_g1[7])){
                    winner();
                }
                if ((selected_g1[2])&&(selected_g1[5])&&(selected_g1[8])){
                    winner();
                }
                if ((selected_g1[0])&&(selected_g1[4])&&(selected_g1[8])){
                    winner();
                }
                if ((selected_g1[2])&&(selected_g1[4])&&(selected_g1[6])){
                    winner();
                }
            }
            else{   // if it's the computer's turn
                if ((selected_g2[0])&&(selected_g2[1])&&(selected_g2[2])){
                    winner();
                }
                if ((selected_g2[3])&&(selected_g2[4])&&(selected_g2[5])){
                    winner();
                }
                if ((selected_g2[6])&&(selected_g2[7])&&(selected_g2[8])){
                    winner();
                }
                if ((selected_g2[0])&&(selected_g2[3])&&(selected_g2[6])){
                    winner();
                }
                if ((selected_g2[1])&&(selected_g2[4])&&(selected_g2[7])){
                    winner();
                }
                if ((selected_g2[2])&&(selected_g2[5])&&(selected_g2[8])){
                    winner();
                }
                if ((selected_g2[0])&&(selected_g2[4])&&(selected_g2[8])){
                    winner();
                }
                if ((selected_g2[2])&&(selected_g2[4])&&(selected_g2[6])){
                    winner();
                }
            }
        }
        if ((counter==9) && (winner_called==false)) {
            /* If all boxes have been occupied and there's no winner
               it means that there's a draw*/
            draw();                               
        }
    }
    
    private void winner(){
        winner_called=true;         // there's a winner
        if (turn_g1){               // if the user is the winner
            JOptionPane.showMessageDialog(null, "The user wins");     
        }else{                      // if the user is the computer
            JOptionPane.showMessageDialog(null, "The computer wins");
        }
        close_all();                // finishes the game   
    }
    
    private void draw(){            // method called when there's a draw
        JOptionPane.showMessageDialog(null, "Draw");
        close_all();                // finishes the game
    }
    
    private void close_all(){       // closes the window
        frame.dispose();
        System.exit(0);
    }
}
