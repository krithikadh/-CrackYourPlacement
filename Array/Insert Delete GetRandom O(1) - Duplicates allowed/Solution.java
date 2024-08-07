class RandomizedCollection {
    private List<Integer> nums;
    private Map<Integer, Set<Integer>> map;
    private Random rand;

    public RandomizedCollection() {
        nums=new ArrayList<>();
        map=new HashMap<>();
        rand=new Random();
    }
    
    public boolean insert(int val) {
        boolean np = !map.containsKey(val);
        map.computeIfAbsent(val, k -> new HashSet<>()).add(nums.size());
        nums.add(val);
        return np;
    }
    
    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }
        int a = map.get(val).iterator().next();
        map.get(val).remove(a);
        if (map.get(val).isEmpty()) {
            map.remove(val);
        }
        int b = nums.get(nums.size() - 1);
        nums.set(a, b);
        if (a != nums.size() - 1) {
            map.get(b).remove(nums.size() - 1);
            map.get(b).add(a);
        }
        nums.remove(nums.size() - 1);
        return true;
    }
    
    public int getRandom() {
        return nums.get(rand.nextInt(nums.size()));
    }
}
