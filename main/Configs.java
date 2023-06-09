package main;

/**
 * @author Daniel
 * 
 * A load of configs for the application.
 */

public class Configs {
    public static final String APPLICATION_NAME = "Sorting Algorithm Animation";

    public static final int APPLICATION_WIDTH = 1350;
    public static final int APPLICATION_HEIGHT = 700;

    public static final int DISPLAY_PANEL_WIDTH = Configs.APPLICATION_WIDTH * 4 / 5;
    public static final int DISPLAY_PANEL_HEIGHT = Configs.APPLICATION_HEIGHT;

    public static final int BUTTONS_PANEL_WIDTH = Configs.APPLICATION_WIDTH / 5;
    public static final int BUTTONS_PANEL_HEIGHT = Configs.APPLICATION_HEIGHT;

    public static final int INITIAL_LIST_STARTING_VALUE = 50;

    public static final String[] ALL_SORTS_COMBO_BOX_VALUES = {"Bubble Sort", "Quick Sort", "Selection Sort", "Insertion Sort", "Merge Sort"};

    public static final int MAXIMUM_DELAY_VALUE = 200000;
    public static final int MINIMUM_DELAY_VALUE = 0;
    public static final int TICK_SPACING = 100000;



    public static final int INITIAL_DELAY_VALUE = MAXIMUM_DELAY_VALUE / 2;
}