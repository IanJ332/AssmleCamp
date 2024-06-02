class singleNumber {
    public Iterator<Integer> singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }
        return set.iterator().next();
    }
}

//use same logic, so use hashset store every number in it and if set already got number(s) then remove it from it, if not just add it into it.
//so whats left will be the number(s) that are unique.
//then use iterator.next to pop them out.
//WARNING: set.iterator() only give itorator number instead of correct data.
