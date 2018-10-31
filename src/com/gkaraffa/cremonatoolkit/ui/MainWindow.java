package com.gkaraffa.cremonatoolkit.ui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.gkaraffa.cremonatoolkit.control.Application;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class MainWindow extends JFrame {
  private Application controller;
  private JPanel contentPane;
  private JButton exitButton;
  private JTextArea textArea;


  public MainWindow(Application controller) {
    this.controller = controller;
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 450, 284);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
    
    this.textArea = createTextArea();
    contentPane.add(textArea);
    
    this.exitButton = createExitButton();
    contentPane.add(exitButton);
    
    populateTextArea();
    
  }

  private JTextArea createTextArea() {
    JTextArea textArea = new JTextArea();
    textArea.setBounds(5, 5, 440, 216);
    
    return textArea;
  }
  
  private JButton createExitButton() {
    JButton exitButton = new JButton("Exit");
    exitButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        controller.shutDown();
      }
    });
    exitButton.setBounds(327, 229, 117, 29);
    
    return exitButton;
  }
  
  private void populateTextArea() {
    textArea.setText(controller.testQuickAccess());
  }
}
  
