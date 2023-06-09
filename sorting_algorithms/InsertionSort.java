package sorting_algorithms;

import gui_components.GUIComponents;

/**
 * @author Daniel
 * 
 * Implementation of the insertion sort.
 */

public class InsertionSort implements SortingAlgorithm {
    private int delay = GUIComponents.delaySlider.getValue() * 1000;

    @Override
    public String getName() {
        return "Insertion Sort";
    }

    @Override
    public void doSort(int[] nums) {
        int n = nums.length;

        for (int i = 1; i < n; ++i) {
            int key = nums[i];
            int j = i - 1;

            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;

            SortingAlgorithm.setCurrentBar(j);
            SortingAlgorithm.sleepFor(delay);
        }
    }

    @Override
    public void changeDelay(int delay) {
        this.delay = delay;
    }

	@Override
	public String getAlgorithm() {
		return "InsertionSort-O(N^2)\n\n"
				+ " public void doSort(int[] nums)\n"
				+ " {\r\n"
				+ "        int n = nums.length;\r\n\n"
				+ "\r\n"
				+ "        for (int i = 1; i < n; ++i) \r\n"
				+ "          {\n"
				+ "            int key = nums[i];\r\n\n"
				+ "            int j = i - 1;\r\n\n"
				+ "            while (j >= 0 && nums[j] > key) {\r\n\n"
				+ "                nums[j + 1] = nums[j];\r\n\n"
				+ "                j--;\r\n"
				+ "              }\r\n"
				+ "            nums[j + 1] = key;\r\n\n"
				+ "          }"
				+ "       \n} ";
	}
}