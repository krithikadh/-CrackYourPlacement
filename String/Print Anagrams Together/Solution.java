class Solution {
    public List<List<String>> Anagrams(String[] string_list) {
        Map<String, List<String>> anagramsMap = new LinkedHashMap<>();
        for (String word : string_list) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            if (!anagramsMap.containsKey(sortedWord)) {
                anagramsMap.put(sortedWord, new ArrayList<>());
            }
            anagramsMap.get(sortedWord).add(word);
        }
        List<List<String>> result = new ArrayList<>(anagramsMap.values());
        return result;
    }
}
