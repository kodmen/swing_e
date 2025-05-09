package org.yamanevler.BO15MenuBar.En1;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuBar extends JFrame implements ActionListener {


    JMenuBar menuBar;

    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;

    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;

    public MenuBar(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("BO15 Menu Bar");
        this.setSize(500, 500);

        menuBar = new JMenuBar();

        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);



        this.setJMenuBar(menuBar);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == loadItem) {
            System.out.println("Load clicked");
        } else if (e.getSource() == saveItem) {
            System.out.println("Save clicked");
        } else if (e.getSource() == exitItem) {
            System.out.println("Exit clicked");
            System.exit(0);
        }
    }
}
