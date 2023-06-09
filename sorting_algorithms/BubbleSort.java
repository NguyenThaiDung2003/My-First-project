package sorting_algorithms;

import gui_components.GUIComponents;

/**
 * @author Daniel
 * 
 * Implementation of the bubble sort.
 */

public class BubbleSort implements SortingAlgorithm {
    private int delay = GUIComponents.delaySlider.getValue() * 1000;

    @Override
    public String getName() {
        return "Bubble Sort";
    }

    @Override
    public void doSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;

                    SortingAlgorithm.setCurrentBar(j+1);
                    SortingAlgorithm.sleepFor(delay);
                }

        SortingAlgorithm.setCurrentBar(0);
    }

    @Override
    public void changeDelay(int delay) {
        this.delay = delay;
    }

	@Override
	public String getAlgorithm() {
		return  "BubbleSort-O(N^2)\r\n\r\n"
				+ "  void BubbleSort(int[] nums) \r\n{\r\n"
				+ "        int n = nums.length;\r\n\r\n"
				+ "        for (int i = 0; i < n - 1; i++)\r\n\r\n"
				+ "            for (int j = 0; j < n - i - 1; j++)\r\n\r\n"
				+ "                 if (nums[j] > nums[j + 1]) \r\n"
				+ "                  {\r\n"
				+ "                    int temp = nums[j];\r\n\r\n"
				+ "                    nums[j] = nums[j + 1];\r\n\r\n"
				+ "                    nums[j + 1] = temp;\n"
				+ "                    }\r\n"
				+ "  }";
	}
}