/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buttondemo;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author weston.strosser
 */
public class ButtonDemo extends JFrame implements ActionListener {

    JButton button;
    boolean isButtonPressed = false;

    public ButtonDemo() {
        super("Button Demo");
        //this.button.setText("Click me");
        JPanel p = new JPanel();
        p.setBorder(new EmptyBorder(10, 100, 10, 100));
        p.setSize(500, 300);
        button = new JButton("Click Me");
        button.addActionListener(this);
        p.add(button);
        add(p, BorderLayout.CENTER);
        pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!isButtonPressed) {
            button.setText("and click again");
            isButtonPressed = true;
        } else {
            button.setText("Click me");
            isButtonPressed = false;
        }
    }

    public static void main(String[] args) {
        ButtonDemo demo = new ButtonDemo();
        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        demo.button.setText("Click Me");
        demo.setVisible(true);
    }

}
