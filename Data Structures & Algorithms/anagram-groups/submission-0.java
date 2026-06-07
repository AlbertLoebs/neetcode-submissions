class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>();

        for (String s : strs) {
            char[] key = s.toCharArray();
            Arrays.sort(key);
            String sorted = new String(key);
            result.putIfAbsent(sorted, new ArrayList<>());
            result.get(sorted).add(s);
        }
            return new ArrayList<>(result.values());
    }
}