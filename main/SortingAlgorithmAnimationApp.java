package main;

import javax.swing.SwingUtilities;

import gui.AppGUI;

/**
 * @author Daniel
 * 
 * The driver class.
 */

public class SortingAlgorithmAnimationApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(AppGUI::new);
    }
}