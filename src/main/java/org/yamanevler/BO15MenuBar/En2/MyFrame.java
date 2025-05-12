package org.yamanevler.BO15MenuBar.En2;

import javax.swing.*;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MyFrame extends JFrame implements ActionListener {

    JMenuBar menuBar;

    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;

    JMenuItem newItem;
    JMenuItem openItem;
    JMenuItem saveItem;
    JMenuItem exitItem;

    public MyFrame(){

        menuBar = new JMenuBar();

        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");

        newItem = new JMenuItem("New");
        openItem = new JMenuItem("Open");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        newItem.addActionListener(this);
        openItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        newItem.setMnemonic(KeyEvent.VK_N); // kısayol tuşu atama

        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("BO15 Menu Bar");
        this.setSize(500, 500);

        this.setJMenuBar(menuBar);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == newItem) {
            JOptionPane.showMessageDialog(null, "New clicked", "Info", JOptionPane.INFORMATION_MESSAGE);
        } else if (e.getSource() == openItem) {
            JOptionPane.showMessageDialog(null, "Open clickedd", "Info", JOptionPane.INFORMATION_MESSAGE);
        } else if (e.getSource() == saveItem) {
            JOptionPane.showMessageDialog(null, "Save clicked", "Info", JOptionPane.INFORMATION_MESSAGE);
        } else if (e.getSource() == exitItem) {
            System.exit(0);
        }
    }
}
