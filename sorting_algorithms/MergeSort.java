package sorting_algorithms;

import gui_components.GUIComponents;

public class MergeSort implements SortingAlgorithm {
    private int delay = GUIComponents.delaySlider.getValue() * 1000;

    @Override
    public String getName() {
        return "Merge Sort";
    }

    @Override
    public void doSort(int[] nums) {
        sort(nums, 0, nums.length - 1);
    }

    private void merge(int nums[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for(int i = 0; i < n1; ++i)
            L[i] = nums[l + i];

        for(int j = 0; j < n2; ++j)
            R[j] = nums[m + 1 + j];

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                nums[k] = L[i];
                i++;

                SortingAlgorithm.setCurrentBar(j);
                SortingAlgorithm.sleepFor(delay);

            } else {
                nums[k] = R[j];
                j++;

                SortingAlgorithm.setCurrentBar(j);
                SortingAlgorithm.sleepFor(delay);
            }
            k++;
        }

        while (i < n1) {
            nums[k] = L[i];
            i++;
            k++;

            SortingAlgorithm.setCurrentBar(j);
            SortingAlgorithm.sleepFor(delay);
        }

        while (j < n2) {
            nums[k] = R[j];
            j++;
            k++;

            SortingAlgorithm.setCurrentBar(j);
            SortingAlgorithm.sleepFor(delay);
        }
    }

    private void sort(int nums[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;

            sort(nums, l, m);
            sort(nums, m + 1, r);

            merge(nums, l, m, r);
        }
    }

    @Override
    public void changeDelay(int delay) {
        this.delay = delay;
    }

	@Override
	public String getAlgorithm() {
		
		return " MergeSort-O(N log N)\n"
				+ " void MergeSort(int[] nums) {\r\n"
				+ "     sort(nums, 0, nums.length - 1);\r\n"
				+ "   }\r\n"		
				+ " void merge(int nums[],int l,int m,int r)\r\n{"
				+ "    int n1 = m - l + 1;"
				+ "    int n2 = r - m;\r\n"		
				+ "    int L[] = new int[n1];\n"
				+ "    int R[] = new int[n2];\r\n"
				+ "    for(int i = 0; i < n1; ++i)\r\n"
				+ "          L[i] = nums[l + i];\r\n"
				+ "    for(int j = 0; j < n2; ++j)\r\n"
				+ "          R[j] = nums[m + 1 + j];\r\n"
				+ "    int i = 0, j = 0;"		
				+ "    int k = l;\r\n"
				+ "    while (i < n1 && j < n2) {\r\n"
				+ "        if (L[i] <= R[j]) {\r\n"
				+ "            nums[k] = L[i];   i++;    }\r\n"				
				+ "        else {\r\n"
				+ "            nums[k] = R[j];   j++;    }"				
				+ " \n   k++;"
				+ "      }\r\n"	
				+ "      while (i < n1) {\r\n"
				+ "          nums[k] = L[i];\r\n"
				+ "          i++;    k++;\r\n"							
				+ "      }\r\n"
				+ "      while (j < n2) {\r\n"
				+ "          nums[k] = R[j];\r\n"
				+ "          j++;"
				+ "    k++;\r\n"			
				+ "        }\n"
				+ "  }\r\n"	
				+ " void sort(int nums[],int l,int r) {\r\n"
				+ "      if (l < r) {"
				+ "          int m = (l + r) / 2;\r\n"
			
				+ "     sort(nums, l, m);"
				+ " sort(nums, m + 1, r);\r\n"
				
				+ "     merge(nums, l, m, r);\r\n"
				+ "        }\r\n"
				+ "    }";
	}
}
