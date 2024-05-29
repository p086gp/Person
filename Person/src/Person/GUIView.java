/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person;

/**
 *
 * @author p086gp
 */


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIView {
    private JFrame frame;
    private JLabel label;
    private JButton nameButton;
    private JButton ageButton;
    private JButton exitButton;

    public GUIView() {
        frame = new JFrame("Person Details");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        label = new JLabel("Click for the introduction");
        
        nameButton = new JButton("Show Name");
        ageButton = new JButton("Show Age");
        exitButton = new JButton("Exit");

        nameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                
            }
        });

        ageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(nameButton);
        panel.add(ageButton);
        panel.add(exitButton);
        frame.add(panel);
        frame.setVisible(true);
    }

    public void showPersonDetails(Person person) {
        for (ActionListener al : nameButton.getActionListeners()) {
            nameButton.removeActionListener(al);
        }
        for (ActionListener al : ageButton.getActionListeners()) {
            ageButton.removeActionListener(al);
        }

        nameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("My name is " + person.getName());
            }
        });

        ageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("I'm " + person.getAge() + " years old");
            }
        });
    }
}
