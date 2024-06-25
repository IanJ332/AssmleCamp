class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int maxCount = 0;
        int mostFrequentNum = 0;
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequentNum = entry.getKey();
            }
        }

        return mostFrequentNum;        
    }
}

