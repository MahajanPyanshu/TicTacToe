package tictactoe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Main implements ActionListener {
    int click=0;
    boolean wins;
    String t="";
    @Override
    public void actionPerformed(ActionEvent e) {

        click++;

        if(click%2==1){
            t="0";
        }
        else{
            t="X";
        }

        if(e.getSource()==b1){
            b1.setText(t);
            buttonDesign(b1);
            b1.setBackground(Color.YELLOW);
            b1.setEnabled(false);
        }
        if(e.getSource()==b2){
            b2.setText(t);
            buttonDesign(b2);
            b2.setEnabled(false);
        }
        if(e.getSource()==b3){
            b3.setText(t);
            buttonDesign(b3);
            b3.setEnabled(false);
        }if(e.getSource()==b4){
            b4.setText(t);
            buttonDesign(b4);
            b4.setEnabled(false);
        }if(e.getSource()==b5){
            b5.setText(t);
            buttonDesign(b5);
            b5.setEnabled(false);
        }if(e.getSource()==b6){
            b6.setText(t);
            buttonDesign(b6);
            b6.setEnabled(false);
        }if(e.getSource()==b7){
            b7.setText(t);
            buttonDesign(b7);
            b7.setEnabled(false);
        }
        if(e.getSource()==b8){
            b8.setText(t);
            buttonDesign(b8);
            b8.setEnabled(false);
        }
        if(e.getSource()==b9){
            b9.setText(t);
            buttonDesign(b9);
            b9.setEnabled(false);
        }
        winningPossibility();
        whoWins();
    }
    JFrame frame;
    Scanner s=new Scanner(System.in);
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
    Main(){
        frame=new JFrame();
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(3);
        GridLayout gl=new GridLayout(3,3);
        frame.setLayout(gl);
        b1=new JButton();
        b1.addActionListener(this);
        frame.add(b1);
        b2=new JButton();
        b2.addActionListener(this);
        frame.add(b2);
        b3=new JButton();
        b3.addActionListener(this);
        frame.add(b3);
        b4=new JButton();
        b4.addActionListener(this);
        frame.add(b4);
        b5=new JButton();
        b5.addActionListener(this);
        frame.add(b5);
        b6=new JButton();
        b6.addActionListener(this);
        frame.add(b6);
        b7=new JButton();
        b7.addActionListener(this);
        frame.add(b7);
        b8=new JButton();
        b8.addActionListener(this);
        frame.add(b8);
        b9=new JButton();
        b9.addActionListener(this);
        frame.add(b9);
        frame.setVisible(true);
    }
    public void buttonDesign(JButton b){
        b.setFont(new Font("Arial",Font.BOLD,50));//Stylish font creation
        if(t.equals("0")){
            b.setBackground(Color.YELLOW);
        }
        else{
            b.setBackground(Color.RED);
        }
    }
    public void winningPossibility(){
        if(b1.getText().equals(b2.getText())&&b1.getText().equals(b3.getText())&&(!b1.getText().isEmpty())){
            wins=true;

        }
        else if(b4.getText().equals(b5.getText())&&b4.getText().equals(b6.getText())&&(!b4.getText().isEmpty())){
            wins=true;
        }
        else if(b7.getText().equals(b8.getText())&&b7.getText().equals(b9.getText())&&(!b7.getText().isEmpty())){
            wins=true;
        }
        else if(b1.getText().equals(b4.getText())&&b1.getText().equals(b7.getText())&&(!b1.getText().isEmpty())){
            wins=true;
        }
        else if(b2.getText().equals(b5.getText())&&b2.getText().equals(b8.getText())&&(!b2.getText().isEmpty())){
            wins=true;
        }
        else if(b3.getText().equals(b6.getText())&&b3.getText().equals(b9.getText())&&(!b3.getText().isEmpty())){
            wins=true;
        }
        else if(b1.getText().equals(b5.getText())&&b1.getText().equals(b9.getText())&&(!b1.getText().isEmpty())){
            wins=true;
        }
        else if(b3.getText().equals(b5.getText())&&b3.getText().equals(b7.getText())&&(!b3.getText().isEmpty())){
            wins=true;
        }
        else{
            wins=false;
        }
    }
    public void whoWins(){
        if(wins){
            JOptionPane.showMessageDialog(frame,t+"  wins");
            restartGame();
        }
        else if(click==9&&!wins){
            JOptionPane.showMessageDialog(frame,"Draw");
            restartGame();
        }
    }
    public void restartGame(){
        int i=JOptionPane.showConfirmDialog(frame,"Do you want to play again");
        //i value is 0 for yes
        if(i==0){
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");
            b1.setBackground(null);
            b2.setBackground(null);
            b3.setBackground(null);
            b4.setBackground(null);
            b5.setBackground(null);
            b6.setBackground(null);
            b7.setBackground(null);
            b8.setBackground(null);
            b9.setBackground(null);

            button_enable();
            t="";
            wins=false;
            click=0;
        }

        //if user presses no
        else if(i==1){
            System.exit(0);
        }
        else{
            button_disable();
        }
    }
    public void button_enable(){
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);
    }
    public void button_disable(){
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);
    }
    public static void main(String[] args) {
        Main obj=new Main();

    }


}
