package sorting_algorithms;

import gui_components.GUIComponents;

/**
 * @author Daniel
 * 
 * Implementation of the selection sort.
 */

public class SelectionSort implements SortingAlgorithm {
    private int delay = GUIComponents.delaySlider.getValue() * 1000;

    @Override
    public String getName() {
        return "Selection Sort";
    }

    @Override
    public void doSort(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++)
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;

                    SortingAlgorithm.setCurrentBar(i);
                    SortingAlgorithm.setCurrentBar(j);
                    SortingAlgorithm.sleepFor(delay);
                }

            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
    }

    @Override
    public void changeDelay(int delay) {
        this.delay = delay;
    }

	@Override
	public String getAlgorithm() {
		return "SelectionSort-O(n^2)\n"
				+ "void SelectionSort(int[] nums) {\r\n"
				+ "        int n = nums.length;\r\n"
				+ "\r\n"
				+ "        for (int i = 0; i < n - 1; i++) {\r\n"
				+ "            int minIndex = i;\r\n"
				+ "            for (int j = i + 1; j < n; j++)\r\n"
				+ "                if (nums[j] < nums[minIndex])\n"
				+ "                 {\r\n"
				+ "                    minIndex = j;\r\n"
				+ "\r\n"
				+ "                }\r\n"
				+ "\r\n"
				+ "            int temp = nums[minIndex];\r\n"
				+ "            nums[minIndex] = nums[i];\r\n"
				+ "            nums[i] = temp;\r\n"
				+ "        }\r\n"
				+ "    }";
	}
}