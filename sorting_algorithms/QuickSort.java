package sorting_algorithms;

import gui_components.GUIComponents;

public class QuickSort implements SortingAlgorithm {
    private int delay = GUIComponents.delaySlider.getValue() * 1000;

    @Override
    public String getName() {
        return "Quick Sort";
    }

    @Override
    public void doSort(int[] nums) {
        sort(nums, 0, nums.length - 1);
    }

    private int partition(int nums[], int low, int high) {
        int pivot = nums[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (nums[j] < pivot) {
                i++;

                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                SortingAlgorithm.setCurrentBar(j);
                SortingAlgorithm.sleepFor(delay);
            }
        }

        int temp = nums[i + 1];
        nums[i + 1] = nums[high];
        nums[high] = temp;

        return i + 1;
    }

    private void sort(int nums[], int low, int high) {
        if (low < high) {
            int pi = partition(nums, low, high);

            sort(nums, low, pi - 1);
            sort(nums, pi + 1, high);
        }
    }

    @Override
    public void changeDelay(int delay) {
        this.delay = delay;
    }

	@Override
	public String getAlgorithm() {
		
		return " QuickSort-O(n log n)\n"
				+ "void QuickSort(int[] nums) {\r\n"
				+ "        sort(nums, 0, nums.length - 1);\r\n"
				+ "    }\r\n"
				+ "     int partition(int nums[], int low, int high) {\r\n"
				+ "        int pivot = nums[high];\r\n"
				+ "        int i = (low - 1);\r\n"
				+ "        for (int j = low; j < high; j++) {\r\n"
				+ "            if (nums[j] < pivot) {\r\n"
				+ "                i++;\r\n"
				+ "                int temp = nums[i];\r\n"
				+ "                nums[i] = nums[j];\r\n"
				+ "                nums[j] = temp;\r\n"
				+ "            }\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        int temp = nums[i + 1];\r\n"
				+ "        nums[i + 1] = nums[high];\r\n"
				+ "        nums[high] = temp;\r\n"
				+ "\r\n"
				+ "        return i + 1;\r\n"
				+ "    }\r\n"
				+ "\r\n"
				+ "     void sort(int nums[], int low, int high) {\r\n"
				+ "        if (low < high) {\r\n"
				+ "            int pi = partition(nums, low, high);\r\n"
				+ "\r\n"
				+ "            sort(nums, low, pi - 1);\r\n"
				+ "            sort(nums, pi + 1, high);\r\n"
				+ "        }\r\n"
				+ "    }\r\n"
				+ "";
	}
}