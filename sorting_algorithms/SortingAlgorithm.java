package sorting_algorithms;

import drawing.PaintSurface;
import gui_components.GUIComponents;

/**
 * @author Daniel
 * 
 * Template for the sorting algorithms.
 */

public abstract interface SortingAlgorithm {
	public abstract String getAlgorithm();         //
    public abstract String getName();

    public abstract void doSort(int[] nums);

    public abstract void changeDelay(int delay);

    public static void setCurrentBar(int currentBarIndex) {
        PaintSurface.currentBarIndex = currentBarIndex;
    }

    public static void sleepFor(int delay) {
        long timeElapsed;
        final long startTime = System.nanoTime();

        do {
            timeElapsed = System.nanoTime() - startTime;
        } while(timeElapsed < delay);

        GUIComponents.displayPanel.repaint();
    }
}